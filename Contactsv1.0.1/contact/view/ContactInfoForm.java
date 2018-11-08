package contact.view;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.event.EventHandler;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.paint.Color;


import javafx.scene.effect.*;
import javafx.scene.input.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;;
import javafx.scene.paint.ImagePattern;

import contact.model.Contact;
import contact.controller.ContactController;
import contact.view.ApplicationContainer;


public class ContactInfoForm extends Form
{
    final private String defaultImagePNGUrl = "contact/view/assets/png/contact.png";
    final private String backButtonDisabledPNGUrl = "contact/view/assets/png/backdisabled.png";
    final private String backButtonEnabledPNGUrl = "contact/view/assets/png/backenabled.png";
    final private String deleteButtonDisabledPNGUrl = "contact/view/assets/png/deletedisabled.png";
    final private String deleteButtonEnabledPNGUrl = "contact/view/assets/png/deleteenabled.png";

    private int status;

    private ApplicationContainer appContainer;

    private ContactController contactsController;

    private Scene contactInfoScene; 

    private Pane absoluteContainer;
    private VBox mainContainer;
    private VBox contactDetailsContainer;

    private Circle createBackBtn , cImage;

    private Label labelName , labelNumber , labelEmail;

    private Contact contact;

    private Circle deleteBtn;

    public ContactInfoForm()
    {
        this.createBackBtn = new Circle(20);
      
        this.cImage = new Circle(60);

        this.deleteBtn = new Circle(20);

    }

    public Circle getBackButton()
    {
        return this.createBackBtn;
    }

    public Circle getDeleteBtn()
    {
        return this.createBackBtn;
    }

    public ContactController getController()
    {
        return this.contactsController;
    }

    public Contact getContact()
    {
        return this.contact;
    }

    public void setBackButtonEnabled()
    {
        this.createBackBtn.setFill(new ImagePattern(new Image(this.backButtonEnabledPNGUrl)));
    }

    public void setBackButtonDisabled()
    {
        this.createBackBtn.setFill(new ImagePattern(new Image(this.backButtonDisabledPNGUrl)));
    }

    public void setBackBtn()
    {
        this.setBackButtonDisabled();
        this.getBackButton().addEventHandler(MouseEvent.MOUSE_ENTERED , (MouseEvent e)->
        {
            this.setBackButtonEnabled();
            this.getBackButton().setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));

        });

        this.getBackButton().addEventHandler(MouseEvent.MOUSE_EXITED , (MouseEvent e)->
        {
            this.setBackButtonDisabled();
            
            // Remove shadow
        });
    }

    public void setContact(Contact contact)
    {
        this.contact = contact;
    }

    public void setAppContainer(ApplicationContainer container)
    {
        this.appContainer = container;
    }

    public void createScene()
    {
        this.absoluteContainer = new Pane();
        this.mainContainer = new VBox();
        this.contactDetailsContainer = new VBox();


        this.deleteBtn.setLayoutX(this.sceneWidth - 80);
        this.deleteBtn.setLayoutY( this.sceneHeight - 485);
        this.deleteBtn.setFill(new ImagePattern(new Image(this.deleteButtonDisabledPNGUrl)));

        this.deleteBtn.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent e)->{

            this.deleteBtn.setFill(new ImagePattern(new Image(this.deleteButtonEnabledPNGUrl)));

        });

        this.deleteBtn.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent e)->{

            this.deleteBtn.setFill(new ImagePattern(new Image(this.deleteButtonDisabledPNGUrl)));

        });


        this.deleteBtn.addEventHandler(MouseEvent.MOUSE_CLICKED,(MouseEvent e)->{

            try {

                this.contactsController.remove(this.getContact());

                
            } catch (Exception ed) {
                //TODO: handle exception
            }

        });



        this.setBackBtn();

        this.absoluteContainer.setPrefSize(this.sceneWidth, this.sceneHeight);
        this.contactDetailsContainer.setPrefSize(this.sceneWidth, this.sceneHeight);
        this.mainContainer.setPrefWidth(this.sceneWidth);
        this.mainContainer.setPrefHeight(this.sceneHeight);

        this.contactDetailsContainer.setSpacing(10);

        this.contactDetailsContainer.setAlignment(Pos.CENTER);

        this.createBackBtn.setLayoutX(this.sceneWidth - 270);
        this.createBackBtn.setLayoutY( this.sceneHeight - 460);
        this.createBackBtn.setFill(new ImagePattern(new Image(this.backButtonEnabledPNGUrl)));

        this.cImage.setFill(new ImagePattern(new Image(this.defaultImagePNGUrl)));
        this.cImage.setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));
        this.labelName = new Label(this.contact.getName());
        this.labelNumber = new Label(this.contact.getNumbers().toString());
        this.labelEmail = new Label(this.contact.getEmails().toString());

        this.contactDetailsContainer.getChildren().addAll(this.cImage ,this.labelName , this.labelNumber , this.labelEmail);
        this.mainContainer.getChildren().add(this.contactDetailsContainer);
        this.absoluteContainer.getChildren().addAll(this.mainContainer , this.createBackBtn,this.deleteBtn);
        this.contactInfoScene = new Scene(absoluteContainer , 330 , 520);
        
        this.appContainer.setScene(this.appContainer , this.contactInfoScene);
        this.appContainer.show(this.appContainer);



    }

    public Scene getScene()
    {
        return this.contactInfoScene;
    }

    public void setContactContainer(ContactController cc)
    {
        this.contactsController = cc;
    }
}
