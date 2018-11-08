import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;

import contact.extras.Console;
import contact.model.Contact;
import contact.controller.ContactController;
import contact.view.ContactOnClick;
import contact.view.ContactListForm;
import contact.view.ContactAddForm;
import contact.view.ContactHeader;
import contact.view.ContactInfoForm;

import java.util.List;


public class TDD extends Application
{
    @Override
    public void start(Stage stage)
    {
        final ContactController<Contact> contactsController = new ContactController<>();
        List<Contact> contacts = contactsController.getContacts();
        
        Contact one = new Contact();
        one.setName("jishnu");
        one.setNumber("7293026514");
        one.setEmail("jishnu@gmail.com");

        Contact two = new Contact();
        two.setName("Rahul");
        two.setNumber("7293026514");
        two.setEmail("rahulpr@gmail.com");

        Contact two1 = new Contact();
        two1.setName("Robin bro");
        two1.setNumber("81119182293");
        two1.setEmail("robin@@gma2il.com");

        Contact two2 = new Contact();
        two2.setName("Dileep");
        two2.setNumber("81119182923");
        two2.setEmail("rahul@gmail.2com");

        Contact two3 = new Contact();
        two3.setName("Tommy");
        two3.setNumber("8111918293");
        two3.setEmail("rahul@gmail2.com");

        Contact two4 = new Contact();
        two4.setName("Rummy");
        two4.setNumber("811w1918293");
        two4.setEmail("rahulw@gmail2.com");

        contactsController.add(one);
        contactsController.add(two);
        contactsController.add(two1);
        contactsController.add(two2);
        contactsController.add(two3);
        contactsController.add(two4);

        ContactAddForm.setController(contactsController);

 
        ContactListForm.setContactClickMethod((Contact contact)->
        {   
            ContactInfoForm.viewContact(contact , stage);

        });

        ContactHeader.getAddContactButton().addEventHandler(MouseEvent.MOUSE_CLICKED , (MouseEvent e)->
        {
            stage.setScene(ContactAddForm.createForm());
        });

        ContactListForm.setHeader(ContactHeader.getAddContactButton());

        Scene viewContacts = ContactListForm.createForm(contacts);

        
        ContactInfoForm.setHeader(ContactHeader.getAddBackButton());
      
        ContactInfoForm.getHeader().addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e)->
        {
            Scene tmp = viewContacts;
            List<Contact> tmpcontacts = contactsController.getContacts();
            stage.setScene(ContactListForm.createForm(tmpcontacts));
        });

        ContactAddForm.getSaveButton().addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e)->
        {
           
            ContactAddForm.saveContact();
            List<Contact> tmpcontacts = contactsController.getContacts();
            stage.setScene(ContactListForm.createForm(tmpcontacts));

        });
        
        stage.setResizable(false);
        stage.setScene(viewContacts);
        stage.setTitle("People");
        stage.show();
    }


    public static void main(String[] args) {
        
        launch(args);
    }
}