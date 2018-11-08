package contact.view.controller;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.ImagePattern;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.image.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.*;
import java.io.File;
import java.net.URL;
import java.util.Random;

import javafx.event.Event;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.MouseButton;


import contact.extra.ApplicationProperties;
import contact.controller.ContactController;
import contact.view.controller.ContactDetailController;
import contact.view.controller.CreateContactController;


public class MainViewController 
{
    @FXML private Pane rootNode;

    @FXML private VBox Container;
   
    @FXML private ScrollPane ContactScrollPane;

    @FXML private TextField searchInput;

    @FXML protected Circle AddContactButton;

    private final ContactController contactController;

    public MainViewController()
    {
        this.contactController = ApplicationProperties.getAppController();
        this.contactController.loadContacts();
    }

    public ContactController getContactController() {
        
        return contactController;
    }

    public VBox getContainer() {

        return this.Container;
    }

    protected HBox getContactBox(String contactString)
    {
        int id = 0;
        String name = null;
        String numbers = null;
        String[] emails = null;

        HBox contactBox = null;
        HBox contactPhotoBox = null;
        VBox contactSimpleDetailBox = null;

        Text txtName = null;
        Text txtNumber = null;
        Label firstLetterOfName = null;



        try {
            
            id = this.getContactController().stringToContact(contactString).getId();
            name = this.getContactController().stringToContact(contactString).getName();

            if(this.getContactController().stringToContact(contactString).getNumbers().getNumbers().size() > 0)
            {
                numbers = this.getContactController().stringToContact(contactString).getNumbers().getNumbers().toArray()[0].toString();

            }
            
           
           
            contactBox = new HBox();
            contactPhotoBox = new HBox();
            contactSimpleDetailBox = new VBox();

            txtName = new Text();
            txtNumber = new Text();
            firstLetterOfName = new Label();

          
            firstLetterOfName.setText((name.charAt(0)+"").toUpperCase());

            txtName.setText(name);
          
            txtNumber.setText(numbers);
            
            Random r = new Random();
            Random rr = new Random();

            String col = "-fx-background-color:rgba(" + r.nextInt(300)+ "," + rr.nextInt(300) +", 161, 0.801);";
           
            contactPhotoBox.setStyle(col);

            contactBox.getStyleClass().add("ContactBox");
            contactPhotoBox.getStyleClass().add("ContactPhotoBox");
            contactSimpleDetailBox.getStyleClass().add("ContactSimpleDetailBox");

            txtName.getStyleClass().add("ContactName");
            txtNumber.getStyleClass().add("ContactNumber");
            firstLetterOfName.getStyleClass().add("FirstLetterOfName");

            contactPhotoBox.getChildren().add(firstLetterOfName);
            contactSimpleDetailBox.getChildren().addAll(txtName , txtNumber);
            contactBox.getChildren().addAll(contactPhotoBox , contactSimpleDetailBox);

        } catch (Exception e) {

            System.out.println(e);
        }

        return contactBox;
    }

    protected void setStyles()
    {
        this.AddContactButton.setFill(new ImagePattern(new Image(getClass().getResource("../assets/icons/plus.png").toExternalForm())));
        
        this.searchInput.setPromptText("Search " + this.contactController.getContacts().size() + " Contacts");
        this.searchInput.setFocusTraversable(false);
        
        this.ContactScrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        this.ContactScrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

    }

    @FXML protected void setEventHandlers()
    {
        this.searchInput.textProperty().addListener((observable, oldValue, newValue)->
        {
            if(newValue.length() > 0 || newValue != " ")
            {
                // Turn to  case Insesnsitive
                this.getSearch(newValue);
            }
            else
            {
                this.initialize();
            }
        });


      // Change Event Type to OnFocus or something..........

      this.getContainer().addEventHandler(MouseEvent.ANY, (MouseEvent e)->
        {
            if(ContactDetailController.hasDeleted())
            {
                this.getContainer().getChildren().remove(this.getContainer().lookup("#" + ContactDetailController.getDelete()));
                this.searchInput.setPromptText("Search " + (this.contactController.getContacts().size()) + " Contacts");
                ContactDetailController.setHasDeleted(false);

            }

            if(CreateContactController.getNewExists())
            {
                this.initialize();
            }

        });


        FXMLLoader loadAddContact = new FXMLLoader();

        this.AddContactButton.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e)->
        {
            try {

                CreateContactController.setPrevContainer(this.rootNode);
                Container.getScene().setRoot(loadAddContact.load(getClass().getResource("../xml/createContactView.xml")));

            } catch (Exception exception) {
                
                System.out.println(exception);
            }
        });
    }

    protected void createContactBox(String contactString)
    {

        try {

            HBox contactDetailBox = null;

           
                contactDetailBox = this.getContactBox(contactString);
                contactDetailBox.setId(contactString.split(",")[0]);

                HBox tmp = contactDetailBox;

                contactDetailBox.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e)->
                {
                    ContactDetailController.setContactId(Integer.parseInt(tmp.getId()));
                    ContactDetailController.setPrevContainer(this.rootNode);

                    FXMLLoader loadContactDetail = new FXMLLoader();

                    try {
          
                        Container.getScene().setRoot(loadContactDetail.load(getClass().getResource("../xml/contactDetailView.xml")));

                    } catch (Exception exception) {
                        
                        System.out.println(exception);
                    }

                });
                
           
                this.Container.getChildren().add(contactDetailBox);
            
        } catch (Exception e) {
            
            System.out.println(e);
            
        }    
    }

    public void getSearch(String searchString)
    {
        this.Container.getChildren().clear();

        for(String contact:this.getContactController().getSearchContacts(searchString))
        {   
          this.createContactBox(contact);
        }
    }

    @FXML
    protected void initialize()
    {
        try {


            CreateContactController.setNewExists(false);

            this.getContainer().getChildren().clear();
          
            this.setStyles();

            this.setEventHandlers();
    
            for(String contactString : this.getContactController().getContacts())
            {
                this.createContactBox(contactString);
            }

            
        } catch (Exception e) {

            System.out.println(e);

        }

       
    }
}