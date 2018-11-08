
import contact.model.*;
import contact.controller.*;

import java.util.List;

public class Test
{
    public static void main(String[] args) throws Exception{
        
        ContactController contactsController = new ContactController();
        contactsController.setSaveFile("contact/model/contacts.csv");
        List<Contact> contacts = contactsController.getContacts();

        Contact one = new Contact();
        one.setName("jishnsu");
        one.setNumber("7293aaa026514");
        one.setEmail("jishnaaau@gmail.com");

        Contact two = new Contact();
        two.setName("jishssasanu");
        two.setNumber("729302asa6514");
        two.setEmail("jishnu@gmasssil.com");

        contactsController.add(one);
        contactsController.add(two);

        for(Contact con : contactsController.getContacts())
        {
            System.out.println(con.getName());
        }

        for(Contact pcon : contactsController.getContacts())
        {
            System.out.println(pcon.getName());
        }
    }
}