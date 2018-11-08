package contact.view.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.ImagePattern;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.image.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.*;

import javafx.event.Event;
import javafx.scene.input.MouseButton;

import contact.extra.ApplicationProperties;

import java.io.File;


import contact.controller.ContactController;
import contact.view.controller.CreateContactController;

public class ContactDetailController
{

    @FXML protected StackPane ContactPhotoBox;

    @FXML protected VBox ContactDetailBox;
    
    @FXML protected Text ContactName;

    @FXML protected Circle ContactImage;

    @FXML protected Circle BackButton;

    @FXML protected Circle DeleteButton;

    @FXML protected Circle EditButton;

    @FXML protected VBox Container;

    @FXML private Pane rootNode;


    private static int contactId;

    private final ContactController contactController;

    private static Pane prevPane;

    private static String deleteContactId = null;

    private static boolean hasDelete;


    public ContactDetailController()
    {
        contactController = ApplicationProperties.getAppController();
    }

    public static void setDelete(int Id)
    {
        deleteContactId = Id+"";
    }

    public static String getDelete()
    {
        return deleteContactId;
    }

    public static boolean hasDeleted()
    {
        return hasDelete;
    }

    public static void setHasDeleted(boolean state)
    {
        hasDelete = state;
    }

    public ContactController getContactController() {
        
        return contactController;
    }

    public static void setPrevContainer(Pane PrevPane)
    {
        prevPane = PrevPane;
    }

    public static void setContactId(int Id)
    {
        contactId = Id;
    }

    public static int getContactId()
    {
        return contactId;
    }

    
    public void createContactDetailsBoxs()
    {
  
       
        this.BackButton.setFill(new ImagePattern(new Image(getClass().getResource("../assets/icons/back.png").toExternalForm())));
        this.DeleteButton.setFill(new ImagePattern(new Image(getClass().getResource("../assets/icons/delete.png").toExternalForm())));
        this.EditButton.setFill(new ImagePattern(new Image(getClass().getResource("../assets/icons/edit.png").toExternalForm())));
        this.ContactImage.setFill(new ImagePattern(new Image(getClass().getResource("../assets/icons/user.png").toExternalForm())));
       
        this.BackButton.addEventFilter(MouseEvent.MOUSE_CLICKED, (MouseEvent e)->
        {
            /* 
                Scene sn = this.Container.getScene();
                sn.setRoot(prevPane);      
            */

            try {
                

                FXMLLoader loadAddContact = new FXMLLoader();
                
                Container.getScene().setRoot(loadAddContact.load(getClass().getResource("../xml/mainView.xml")));
    

            } catch (Exception exception) {
                //TODO: handle exception
            }
            
        });




        this.DeleteButton.addEventFilter(MouseEvent.MOUSE_CLICKED, (MouseEvent e)->
        {   
            ContactDetailController.setHasDeleted(true);
            ContactDetailController.setDelete(ContactDetailController.getContactId());

            this.contactController.removeContact(ContactDetailController.getContactId());          

            try {
                

                FXMLLoader loadAddContact = new FXMLLoader();
                
                Container.getScene().setRoot(loadAddContact.load(getClass().getResource("../xml/mainView.xml")));
    

            } catch (Exception exception) {
                //TODO: handle exception
            }
        });

     

        this.EditButton.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e)->
        {
            CreateContactController.setEditMode(true);
            CreateContactController.setContactId(this.getContactId());
            CreateContactController.setPrevContainer(this.rootNode);


            try {

                FXMLLoader loadAddContact = new FXMLLoader();
                
                Container.getScene().setRoot(loadAddContact.load(getClass().getResource("../xml/createContactView.xml")));

            } catch (Exception exception) {

                System.out.println(exception);

            }
        });

        String name = null;
        String[] numbers = null;
        String[] emails = null;

        String contactString = contactController.getContact(contactId);

        String[] contactDetails = contactString.split(",");

        name = contactDetails[1];

        this.ContactName.setText(name);

        if(contactDetails.length >= 3)
        {
     
            numbers = contactDetails[2].split("/");
        }
     
        if(contactDetails.length == 4)
        {
            emails = contactDetails[3].split("/");
        }
        
        if(numbers != null)
        {
            for(String number:numbers)
            {
                HBox numberBox = new HBox();
                Circle icon = new Circle(20);
                Text txtNumber = new Text(number);

                icon.setFill(new ImagePattern(new Image(getClass().getResource("../assets/icons/phone.png").toExternalForm())));

                numberBox.getStyleClass().add("NumberBox");
                txtNumber.getStyleClass().add("TxtNumber");

                numberBox.getChildren().addAll(icon , txtNumber);
                this.ContactDetailBox.getChildren().add(numberBox);
            }

        }

        if(emails != null)
        {

            for(String email:emails)
            {
               
                HBox emailBox = new HBox();
                Circle icon = new Circle(20);
                Text txtEmail = new Text(email);

                icon.setFill(new ImagePattern(new Image(getClass().getResource("../assets/icons/mail.png").toExternalForm())));


                emailBox.getStyleClass().add("EmailBox");
                txtEmail.getStyleClass().add("TxtEmail");

                emailBox.getChildren().addAll(icon , txtEmail);
                this.ContactDetailBox.getChildren().add(emailBox);
            }
        }
    }

    @FXML
    protected void initialize()
    {
      this.createContactDetailsBoxs();
    }
}