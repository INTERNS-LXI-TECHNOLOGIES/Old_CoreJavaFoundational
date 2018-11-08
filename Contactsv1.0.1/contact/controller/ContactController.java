
package contact.controller;

import java.io.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import contact.model.Contact;

public class ContactController
{
    private final String tmpFile ="contact/model/tmpContacts.csv";
    private String saveFile ="contact/model/contacts.csv";

    private Set<String> errMessage;

    private LinkedList<Contact> contacts;

    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;


    public ContactController() throws Exception
    {
        this.errMessage = new HashSet<>();
    }

    public LinkedList<Contact> getContacts() throws Exception
    {
        try {

        this.bufferedReader = new BufferedReader(new FileReader(this.saveFile));

        this.contacts = new LinkedList<>();
        
        Contact tmp = null;

        String contactString = null;

        String [] contactDetails = new String[10];

        while( (contactString = this.bufferedReader.readLine()) != null)
        {
            contactDetails = contactString.split(",");
            tmp = new Contact();
            
            if(contactDetails.length == 1) { tmp.setName(contactDetails[0]); }
            if(contactDetails.length == 2) { tmp.setName(contactDetails[0]); tmp.setNumber(contactDetails[1]);}
            if(contactDetails.length == 3) { 

                tmp.setName(contactDetails[0]);     
                tmp.setNumber(contactDetails[1]);
                tmp.setEmail(contactDetails[2]);
            }
            
            
            this.contacts.add(tmp);

        }

        return this.contacts;
            
        } catch (Exception e) {
            
           
        }
        finally
        {
            this.bufferedReader.close();
        }

        return null;
    }

    public void add(Contact contact) throws Exception
    {   
        try {

            if(this.contacts.contains(contact))
            {
                throw new Exception("Number Already saved");
            }
            else
            {

                this.contacts.add(contact);

                this.bufferedWriter = new BufferedWriter(new FileWriter(this.saveFile,true));
                String contactString = contact.getName() + ",";
                contactString = contactString.concat(contact.getNumbers().toString() + ",");
                contactString = contactString.concat(contact.getEmails().toString());
                contactString = contactString.concat("\n");

                this.bufferedWriter.write(contactString);
                this.bufferedWriter.close();
            }
        } 
        catch (Exception e) {
           
            this.setError(e.getMessage());

            System.out.println(e);
        }
        finally
        {
            this.bufferedWriter.close();
        }
        
    }

    public void remove(Contact contact) throws Exception
    {
        try
        {

            this.setSaveFile(this.saveFile);
      
            BufferedWriter tmpFileWriter = new BufferedWriter(new FileWriter(this.tmpFile));
            BufferedReader tmpFileReader = new BufferedReader(new FileReader(this.tmpFile));

         
            String searchString = contact.getName() + "," + contact.getNumbers();
            searchString = searchString.concat("," + contact.getEmails());

            String contactString;

            while((contactString = this.bufferedReader.readLine()) != null)
            {
             
                if(contactString.equals(searchString))
                {
                }
                else
                {
                    tmpFileWriter.write(contactString);
                    tmpFileWriter.newLine();
                }
            }

            tmpFileWriter.close();
            
            ///////////////////////////////////////////////

            String s = null;

            this.bufferedWriter = new BufferedWriter(new FileWriter(this.saveFile));

            while((s = tmpFileReader.readLine()) != null)
            {

                this.bufferedWriter.write(s);
                this.bufferedWriter.newLine();
            }

           
            tmpFileReader.close();

            if(!this.contacts.contains(contact))
            {
                throw new Exception("Contact Not Found");
            }

           
            this.contacts.remove(contact);
        }
        catch(Exception e)
        {
            this.setError(e.getMessage());
        }
        finally
        {
            BufferedWriter tmpFileWriter = new BufferedWriter(new FileWriter(this.tmpFile));
            tmpFileWriter.write(" ");
            this.bufferedReader.close();
            this.bufferedWriter.close();
        }

    }

    public void setError(String msg)
    {
        this.errMessage.add(msg);
    }


    public Set getErrors()
    {
        return this.errMessage;
    }

    public void setSaveFile(String file) throws Exception
    {
        this.saveFile = file;
        this.bufferedReader = new BufferedReader(new FileReader(this.saveFile));
    }

}