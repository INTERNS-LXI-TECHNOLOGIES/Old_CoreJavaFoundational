package contact.controller;

import java.util.ArrayList;
import contact.extra.Console;
import contact.model.Contact;
import contact.controller.Repository;

public class ContactController
{
    private int currentId ;

    private int lastInsertId;

    private Repository repository;

    private String saveDirectory;

    private String saveFile;

    private ArrayList<Contact> contactList;

    private ArrayList<String> contactListString;

    public ContactController()
    {
        this.contactList = new ArrayList<>();
    }

    public void setSaveDirectory(String SaveDirectory) {

        this.saveDirectory = SaveDirectory;
    }

    public void setSaveFile(String SaveFile)  {

        this.saveFile = SaveFile;
    }

    public String getSaveDirectory()  {

        return this.saveDirectory;
    }

    public String getSaveFile() {

        return this.saveFile;
    }

    public Repository getRepository()
    {
        return this.repository;
    }

    public int getLastInsertId()
    {
        return this.lastInsertId;
    }

    public void setLastInsertId(int id)
    {
        this.lastInsertId = id;
    }

    public void initRepository(boolean ...state)
    {
        try {

            this.repository = new Repository(this.getSaveDirectory());

            this.getRepository().setCurrentFilePath(this.getSaveFile());
            this.getRepository().createFile(this.getSaveFile());
            this.getRepository().useFile(this.getSaveFile());

        } catch (Exception exception) {

            Console.log(exception);
        }
    }

    public ArrayList<Contact> getLocalContactList()
    {
        return this.contactList;
    }

    public ArrayList<String> getLocalContactStrings()
    {
        return this.contactListString;
    }

    public ArrayList<String> getContacts()
    {
        return this.contactListString;
    }

    public String getContact(int id)
    {
        for(Contact contact : this.getLocalContactList())
        {
            if(contact != null)
            {
                if(contact.getId() == id)
                {
                    return this.contactToString(contact);
                }

            }

        }

        return null;
    }

    public ArrayList<String> getSearchContacts(String keyword)
    {
        return this.getRepository().select(keyword);
    }




    public String makeContact(String id ,String  name , String num1 , String num2 , String email1 , String email2)
    {
        String contactString = id + "," + name + ",";

        if(!num1.isEmpty())
        {
            contactString = contactString.concat(num1);
        }

        if(!num2.isEmpty())
        {
            if(!num1.isEmpty())
            {
                contactString = contactString.concat("/");                
            }
            contactString = contactString.concat(num2 + ",");
        }
        else
        {
            contactString = contactString.concat(",");
        }

        if(!email1.isEmpty())
        {
            contactString = contactString.concat(email1);
        }
        if(!email2.isEmpty())
        {
            if(!email1.isEmpty())
            {
                contactString = contactString.concat("/");
            }

            contactString = contactString.concat(email2);
        }

        return contactString;
    }

    public Contact stringToContact(String ContactString)
    {

        String[] contactString = ContactString.split(",");

        Contact contact = null;

        contact = new Contact(Integer.parseInt(contactString[0]) , contactString[1]);

        if(contactString.length == 3)
        {
            for(String number : contactString[2].split("/"))
            {
                contact.setNumber(number);
            }
        }

        if(contactString.length == 4)
        {
            for(String number : contactString[2].split("/"))
            {
                contact.setNumber(number);
            }

            for(String email : contactString[3].split("/"))
            {
                contact.setEmail(email);
            }
        }

        return contact;
    }

    public String contactToString(Contact contact)
    {
        String contactString = contact.getId() + "," + contact.getName() + ",";

        int noNumbers = contact.getNumbers().getNumbers().size();

        switch(noNumbers)
        {
            case 0 : contactString = contactString.concat(",");
                     break;

            case 1 : contactString = contactString.concat(contact.getNumbers().getNumbers().toArray()[0].toString() + ",");
                     break;

            case 2: String tmpString = contact.getNumbers().getNumbers().toArray()[0].toString();
                    tmpString = tmpString.concat( "/" + contact.getNumbers().getNumbers().toArray()[1].toString() + ",");
                    contactString = contactString.concat(tmpString);
                    break;
        }

        int noEmails = contact.getEmails().getEmails().size();

        switch(noEmails)
        {
            case 0 : break;

            case 1 : contactString = contactString.concat(contact.getEmails().getEmails().toArray()[0].toString());
                     break;

            case 2: String tmpString = contact.getEmails().getEmails().toArray()[0].toString();
                    tmpString = tmpString.concat( "/" + contact.getEmails().getEmails().toArray()[1].toString());
                    contactString = contactString.concat(tmpString);
                    break;
        }

        return contactString;
    }
    

    public void loadContacts()
    {
        Contact tmpContact = null;

        try {

            this.contactListString = this.getRepository().select(".");

            for(String pcontact:this.contactListString)
            {
                tmpContact = stringToContact(pcontact);

                if(this.lastInsertId < tmpContact.getId())
                {
                    this.lastInsertId = tmpContact.getId();
                }

                this.getLocalContactList().add(tmpContact);
            }

        } catch (Exception exception) {

            Console.log(exception);
        }
    }

    public boolean insertContactRepo(String ContactString)
    {
        return this.getRepository().insert(ContactString);
    }

    public boolean updateContactRepo(String Id , String NewValue)
    {
        return this.getRepository().update("^" + Id, NewValue);
    }

    public boolean deleteContactRepo(String Id)
    {
        return this.getRepository().delete("^" + Id);
    }


    public void addContact(String ContactString) throws Exception
    {
        Contact tmpContact = null;

            tmpContact = this.stringToContact(ContactString);

            if(!this.getLocalContactList().contains(tmpContact))
            {
                this.insertContactRepo(ContactString);
                this.getLocalContactStrings().add(ContactString);
                this.getLocalContactList().add(tmpContact);
                this.loadContacts();
            }
            else
            {
                throw new Exception("Contact ALready exist");
            }
    }

    public void removeContact(int contactId)
    {
        try {

            String contactString = this.getContact(contactId);

            for(Contact contact : this.getLocalContactList())
            {
                if(contact.getId() == contactId)
                {
                    synchronized(this.getLocalContactList())
                    {
                        this.getLocalContactList().clear();

                        synchronized(this.getLocalContactStrings())
                        {                       
                            this.getLocalContactStrings().clear();
                            if(this.getLocalContactList().remove(contact))
                            {
                                this.loadContacts();
                                this.deleteContactRepo(contactId + "");
                            }
                        }

                    }
                }
            }

        } catch (Exception exception) {

            Console.log(exception);

        }
    }

    public void editContact(String NewContactString)
    {
        Contact tmpContact = null;
        Contact originalContact = null;

        String originalContactString = null;

        try {

            tmpContact = this.stringToContact(NewContactString);

            originalContactString = this.getContact(tmpContact.getId());

            originalContact = this.stringToContact(originalContactString);


            if(this.getLocalContactList().contains(tmpContact))
            {
                this.updateContactRepo(tmpContact.getId()+"", NewContactString);

                synchronized(this.getLocalContactList())
                {
                    this.getLocalContactList().clear();
                    this.getLocalContactList().remove(originalContact);
                    this.getLocalContactList().add(tmpContact);
                }
                synchronized(this.getLocalContactStrings())
                {
                    this.getLocalContactStrings().clear();
                    this.loadContacts();
                }

            }
            else
            {
                throw new Exception("Contact Does not Exits");
            }

        } catch (Exception exception) {

            Console.log(exception);
        }
    }

}
