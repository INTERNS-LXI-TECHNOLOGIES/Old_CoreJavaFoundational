package contact.view;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.event.EventHandler;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.paint.Color;

import javafx.scene.paint.ImagePattern;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.*;
import javafx.scene.shape.Circle;
import javafx.scene.layout.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.*;
import javafx.animation.FadeTransition;

import contact.model.Contact;
import contact.view.ContactInfoForm;


public class ContactListForm extends Form
{

    final private String defaultImagePNGUrl = "contact/view/assets/png/contact.png";
    final private String addContactDisabledPNGUrl = "contact/view/assets/png/contactdisabled.png";
    final private String addContactEnabledPNGUrl = "contact/view/assets/png/contactenabled.png";


    private Scene contactScene;

    private Pane absoluteContainer;
    private ScrollPane mainContainer;
    private HBox searchBoxContainer;
    private VBox contactsContainer;
 
    private Circle createContactbtn;

    private TextField searchBox;

    public Circle getContactButton()
    {
        return this.createContactbtn;
    }

    public void setContactButtonEnabled()
    {
        this.createContactbtn.setFill(new ImagePattern(new Image(this.addContactEnabledPNGUrl)));
    }

    public void setContactButtonDisabled()
    {
        this.createContactbtn.setFill(new ImagePattern(new Image(this.addContactDisabledPNGUrl)));
    }

    public void setCreateContactBtn()
    {
        this.getContactButton().setOpacity(0.4);

        this.getContactButton().addEventHandler(MouseEvent.MOUSE_ENTERED , (MouseEvent e)->
        {
            this.setContactButtonEnabled();
            this.getContactButton().setOpacity(1);
            this.getContactButton().setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));
        });

        this.getContactButton().addEventHandler(MouseEvent.MOUSE_EXITED , (MouseEvent e)->
        {
            this.setContactButtonDisabled();
            this.getContactButton().setOpacity(0.6);

            // Remove shadow Effecr
        });
    }

    public ContactListForm()
    {
        this.absoluteContainer = new Pane();
        this.mainContainer = new ScrollPane();
        this.searchBoxContainer = new HBox();
        this.contactsContainer = new VBox();

        this.createContactbtn = new Circle(20);
        this.searchBox = new TextField();

    }

    public void createScene()
    {

        this.setCreateContactBtn();

        this.mainContainer.setStyle("-fx-font-size:1;");
        this.mainContainer.setVbarPolicy(ScrollBarPolicy.ALWAYS);
        this.mainContainer.setPrefWidth(this.sceneWidth);
        this.mainContainer.setPrefHeight(this.sceneHeight - 40);
        this.mainContainer.setLayoutY(40);

        this.createContactbtn.setFill(new ImagePattern(new Image(this.addContactDisabledPNGUrl)));
        this.createContactbtn.setLayoutX(this.sceneWidth - 60);
        this.createContactbtn.setLayoutY( this.sceneHeight - 60);

        this.searchBox.setPromptText("Search Contacts");
        this.searchBox.setPrefWidth(this.sceneWidth);
        this.searchBox.setPrefHeight(this.sceneHeight - 480);

        this.contactsContainer.setPadding(new Insets(1,0,1,0));

        this.searchBoxContainer.getChildren().add(this.searchBox);
        this.mainContainer.setContent(this.contactsContainer);
        this.absoluteContainer.getChildren().addAll(this.mainContainer , this.createContactbtn , this.searchBoxContainer);
    
        
        this.contactScene = new Scene(absoluteContainer , this.sceneWidth , this.sceneHeight);

    }

    public void clear()
    {
        this.contactsContainer.getChildren().clear();
    }
    
    public void createContactBox(Contact contact , ContactInfoForm event)
    {

        HBox singleContactContainer = new HBox();
        VBox singleContactDetails = new VBox();

        Text cname = new Text(contact.getName());
        Text cnumber = new Text(contact.getNumbers().toString());
        Text cmail = new Text(contact.getEmails().toString());

        Circle cimage = new Circle(30);

        
        cname.setFont(new Font("Aerial" , 18));
        cnumber.setFont(new Font("Aerial" , 10));
        cmail.setFont(new Font("Aerial" , 10));

        singleContactContainer.setPrefWidth(this.sceneWidth);
        singleContactContainer.setPadding(new Insets(5,5,5,5));
        
        singleContactDetails.setPadding(new Insets(0,15,0,15));
        singleContactDetails.setSpacing(5);
        
        cimage.setFill(new ImagePattern(new Image(this.defaultImagePNGUrl)));
        cimage.setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));

        
        singleContactDetails.getChildren().addAll(cname , cnumber , cmail);
        singleContactContainer.getChildren().addAll(cimage , singleContactDetails);
        this.contactsContainer.getChildren().add(singleContactContainer);


        singleContactContainer.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e)->{

            singleContactContainer.setStyle("-fx-background-color:green");
        });

        singleContactContainer.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e)->{

            singleContactContainer.setStyle("-fx-background-color:white");
        });

        singleContactContainer.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e)->
        {
            event.setContact(contact);
            event.createScene();
        });
        
    }

    public Scene getScene()
    {
        return this.contactScene;
    }


}

