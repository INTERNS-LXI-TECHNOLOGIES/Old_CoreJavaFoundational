

import contact.controller.*;
import contact.model.Contact;

import contact.extra.ApplicationProperties;

public class Test 
{

      public static void main(String[] args) throws Exception {

        ContactController cc = new ContactController();

        String a = cc.makeContact("1","jishnu" , "","aaaa","eeee","sjhsjs");
        System.out.println(a);

        Contact ca = cc.stringToContact(a);

        System.out.println(ca.getNumbers().getNumbers().toString());
        System.out.println(ca.getEmails().getEmails().toString());


        cc.contactToString(ca);
    }


}