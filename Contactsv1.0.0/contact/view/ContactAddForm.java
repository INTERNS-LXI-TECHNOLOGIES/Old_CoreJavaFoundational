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
import javafx.scene.paint.ImagePattern;

import contact.model.Contact;
import contact.controller.ContactController;


public class ContactAddForm
{
    private static ContactController ccontroller;

    private static TextField  txtName , txtNumber , txtEmail;
    private static Button saveBtn = new Button("Save"),  cancelBtn = new Button("Cancel");


    public static void setController(ContactController c)
    {
        ccontroller = c;
    }
    
    public static void saveContact()
    {
        String name = txtName.getText();
        String number = txtNumber.getText();
        String email = txtEmail.getText();

        Contact newc = new Contact();
        newc.setName(name);
        newc.setEmail(email);
        newc.setNumber(number);

        ccontroller.add(newc);
    }

    public static Button getSaveButton()
    {
        return saveBtn;
    }

    public static Scene createForm()
    {

        Pane absoluteContainer = new Pane();
        absoluteContainer.setStyle("-fx-background-color:white;");

        VBox mainContainerHolder = new VBox();
        mainContainerHolder.setAlignment(Pos.CENTER);
        mainContainerHolder.setPrefSize(330, 480);


        VBox mainContainer = new VBox();
        mainContainer.setPadding(new Insets(10,10,10,10));
        mainContainer.setAlignment(Pos.CENTER);
        mainContainer.setSpacing(10);
        

        Circle contactImageBackground = new Circle(60);
        Image contactImage = new Image("contact/view/assets/png/contact.png");
        StackPane contactImageHolder = new StackPane();

        contactImageBackground.setFill(new ImagePattern(contactImage));        
        contactImageBackground.setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));

        txtName = new TextField();
        txtNumber = new TextField();
        txtEmail = new TextField();

        Boolean firstTimeName = true;
        Boolean firstTimeNumber = true;
        Boolean firstTimeEmail = true;

        txtName.setPromptText("Name");
        txtNumber.setPromptText("Number");
        txtEmail.setPromptText("Email");


        cancelBtn.setLayoutX(20);
        cancelBtn.setLayoutY(20);

        saveBtn.setLayoutX(100);
        saveBtn.setLayoutY(20);


        mainContainer.getChildren().addAll(contactImageBackground , txtName  , txtNumber , txtEmail);
        mainContainerHolder.getChildren().addAll(mainContainer);
        absoluteContainer.getChildren().addAll(mainContainerHolder  ,saveBtn , cancelBtn);
        mainContainer.setStyle("-fx-background-color:white;");

        return new Scene(absoluteContainer , 330 , 520);

    }

}