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

import contact.extra.ApplicationProperties;
import contact.extra.AlertBox;
import contact.controller.ContactController;
import contact.view.controller.ContactDetailController;


public class CreateContactController
{
    @FXML protected Button SaveButton;
    @FXML protected Button CancelButton;

    protected static Pane prevPane;

    @FXML private VBox Container;

    @FXML private Pane rootNode;

    @FXML protected TextField NameField;
    @FXML protected TextField Number1Field;
    @FXML protected TextField Number2Field;
    @FXML protected TextField Email1Field;
    @FXML protected TextField Email2Field;

    @FXML protected Text TypeHeader;

    @FXML private Circle ContactImageBox;


    private final ContactController contactController;

    private static boolean editMode = false;

    private static int contactId;

    private static boolean newExists;

    public CreateContactController()
    {
        this.contactController = ApplicationProperties.getAppController();
    }

    public static void setPrevContainer(Pane PrevPane)
    {
        prevPane = PrevPane;
    }


    public static void setEditMode(boolean modeState)
    {
        editMode = modeState;
    }

    public boolean getEditMode()
    {
        return editMode;
    }

    public static void setNewExists(boolean State)
    {
        newExists = State;
    }

    public static boolean getNewExists()
    {
        return newExists;
    }

    public static void setContactId(int id)
    {
        contactId = id;
    }

    public int getContactId()
    {
        return contactId;
    }

    public ContactController getContactController() {
        
        return contactController;
    }

    public void setStyles()
    {
        this.ContactImageBox.setFill(new ImagePattern(new Image(getClass().getResource("../assets/icons/user.png").toExternalForm())));
    }

    public void setEventHandlers()
    {
        this.CancelButton.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e)->{

            this.setEditMode(false);
            Scene sn = this.Container.getScene();
            sn.setRoot(prevPane);   

        });

        this.SaveButton.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e)->{

            try
            {
                String id = this.getContactController().getLastInsertId() + 1 + "";
                String name = this.NameField.getText();
                String number1 = this.Number1Field.getText();
                String number2 = this.Number2Field.getText();
                String email1 = this.Email1Field.getText();
                String email2 = this.Email2Field.getText();

               

                if(!this.getEditMode())
                {
                    if(name.isEmpty())
                    {
                        throw new Exception("Enter a Name for Contact");
                    }
                    else
                    {
                        String contactString = this.getContactController().makeContact(id , name , number1 , number2,email1 , email2);
                        this.getContactController().addContact(contactString);
                        this.getContactController().setLastInsertId(Integer.parseInt(id));
                        CreateContactController.setNewExists(true);

                        ContactDetailController.setContactId(Integer.parseInt(id));
                        ContactDetailController.setPrevContainer(prevPane);

                        FXMLLoader loadContactDetail = new FXMLLoader();

                        try {
                           
                            Container.getScene().setRoot(loadContactDetail.load(getClass().getResource("../xml/contactDetailView.xml")));
    
                        } catch (Exception exception) {
                            
                            System.out.println(exception);
                        }
                    }
                }
                else
                {

                    CreateContactController.setNewExists(true);
                    String contactString = this.getContactController().makeContact(this.getContactId() +"", name , number1 , number2 , email1 , email2);
              
                    ContactDetailController.setContactId(this.getContactId());
                    this.getContactController().editContact(contactString);
                    this.setEditMode(false);

                    FXMLLoader loadContactDetail = new FXMLLoader();

                    try {
          
                        Container.getScene().setRoot(loadContactDetail.load(getClass().getResource("../xml/contactDetailView.xml")));

                    } catch (Exception exception) {
                        
                        System.out.println(exception);
                    }
                }
            }
            catch(Exception exception)
            {
                AlertBox.setContainer(this.rootNode);
                AlertBox.msg(exception.getMessage() ,330,480);
            }

        });


    
    }

    @FXML public void initialize()
    {   
        try {

                this.setStyles();

                if(this.getEditMode())
                {
                        this.TypeHeader.setText("Edit Contact");
        
                        String contactString = this.getContactController().getContact(this.getContactId());
                        String[] contactDetails = contactString.split(",");
        
                        this.NameField.setText(contactDetails[1]);
        
                        if(contactDetails.length == 3)
                        {
                            String[] numbers = contactDetails[2].split("/");
        
                            this.Number1Field.setText(numbers[0]);
        
                            if(numbers.length == 3)
                            {
                                this.Number2Field.setText(numbers[1]);
                            }
                        }
        
                        if(contactDetails.length == 4)
                        {
                            String[] numbers = contactDetails[2].split("/");
        
                            this.Number1Field.setText(numbers[0]);
        
                            if(numbers.length == 2)
                            {
                                this.Number2Field.setText(numbers[1]);
                            }
        
                            String[] emails = contactDetails[3].split("/");
        
                            this.Email1Field.setText(emails[0]);
        
                            if(emails.length == 2)
                            {
                                this.Email2Field.setText(emails[1]);
                            }
                        }
                }
                else
                {
        
                    this.TypeHeader.setText("Create Contact"); 
                }
            
        
                    if(this.NameField.getText().isEmpty()){ this.NameField.setPromptText("Enter Contact Name"); }
                    if(this.Number1Field.getText().isEmpty()){ this.Number1Field.setPromptText("Enter Mobile No"); }
                    if(this.Number2Field.getText().isEmpty()){ this.Number2Field.setPromptText("Enter Landline No"); }
                    if(this.Email1Field.getText().isEmpty()){ this.Email1Field.setPromptText("Enter Personal Email"); }
                    if(this.Email2Field.getText().isEmpty()){ this.Email2Field.setPromptText("Enter Work Email"); }
        
        
        
                    this.setEventHandlers();
        
        } catch (Exception e) {
   
           e.printStackTrace();
        }
    }
}