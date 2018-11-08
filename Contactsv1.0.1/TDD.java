import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.scene.input.*;

import contact.model.*;
import contact.controller.ContactController;
import contact.view.*;

import java.util.List;


public class TDD extends Application
{
    public static void refresh(ContactController contactsController, ContactListForm contactListForm , ContactInfoForm contactInfoForm)
    {
    
        try
        {

            for(Contact contact : contactsController.getContacts())
            {
                    contactListForm.createContactBox(contact , contactInfoForm);
    
            }
            
        } catch (Exception ew) {
            //TODO: handle exception
        }
    }

    @Override
    public void start(Stage stage) throws Exception
    {
        ContactController contactsController = new ContactController();
        contactsController.setSaveFile("contact/model/contacts.csv");
       
        ApplicationContainer contactContainer = new ApplicationContainer();

        ContactListForm contactListForm = new ContactListForm();
        contactListForm.setSceneSize(330, 520);
        contactListForm.createScene();

        ContactInfoForm contactInfoForm = new ContactInfoForm();
        contactInfoForm.setSceneSize(330, 520);
        contactInfoForm.setAppContainer(contactContainer);
        contactInfoForm.setContactContainer(contactsController);

        ContactAddForm contactAddForm = new ContactAddForm();
        contactAddForm.setSceneSize(330, 520);
        contactAddForm.setAppContainer(contactContainer);
        contactAddForm.setContactContainer(contactsController);
        
        refresh(contactsController, contactListForm, contactInfoForm);

        contactListForm.getContactButton().addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e)->
        {
           contactAddForm.createScene();  
        });

        //contactInfoForm.getOptionButton()

        contactInfoForm.getBackButton().addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e)->{

            contactListForm.clear();

            refresh(contactsController, contactListForm, contactInfoForm);

            ApplicationContainer.setScene(contactContainer , contactListForm.getScene());

        });




        contactAddForm.getBackButton().addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e)->{
  
            contactListForm.clear();

            refresh(contactsController, contactListForm, contactInfoForm);

            ApplicationContainer.setScene(contactContainer , contactListForm.getScene());
        });


        contactAddForm.getSaveButton().addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e)->
        {
            if(contactAddForm.success())
            {    
                contactListForm.clear();

                refresh(contactsController, contactListForm, contactInfoForm);  

                ApplicationContainer.setScene(contactContainer , contactListForm.getScene());
            }
         
        });

      
        ApplicationContainer.setStage(stage);
        ApplicationContainer.setScene(contactContainer , contactListForm.getScene());
        ApplicationContainer.show(contactContainer);
        
    }


    public static void main(String[] args) {
        
        launch(args);
    }
}