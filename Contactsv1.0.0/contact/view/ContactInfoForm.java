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

import contact.extras.Console;
import contact.model.Contact;
import contact.controller.ContactController;

import java.util.List;


public class ContactInfoForm
{
    public static StackPane header;

    public static void setHeader(StackPane pane)
    {
        header = pane;
    }

    public static StackPane getHeader()
    {
        return header;
    }

   public static void viewContact(Contact contact , Stage stage)
   {
        Pane absoluteContainer = new Pane();
        
        VBox mainContainerHolder = new VBox();
        mainContainerHolder.setLayoutX(90);
        mainContainerHolder.setLayoutY(90);
        mainContainerHolder.setAlignment(Pos.CENTER);


        VBox mainContainer = new VBox();
        mainContainer.setPadding(new Insets(10,10,10,10));
        mainContainer.setAlignment(Pos.CENTER);
        mainContainer.setSpacing(10);

        Circle contactImageBackground = new Circle(60);
        Image contactImage = new Image("contact/view/assets/png/contact.png");
        StackPane contactImageHolder = new StackPane();

        contactImageBackground.setFill(new ImagePattern(contactImage));        
        contactImageBackground.setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));

        Label labelName, labelNumber , labelEmail;

        labelName = new Label(contact.getName());

        mainContainer.getChildren().addAll(contactImageBackground , labelName);

        for(String number : contact.getNumbers())
        {
            labelNumber = new Label(number);
            mainContainer.getChildren().add(labelNumber);

        }

        for(String email : contact.getEmails())
        {
            labelEmail = new Label(email);
            mainContainer.getChildren().add(labelEmail);
        }

        mainContainerHolder.getChildren().addAll(mainContainer);
        absoluteContainer.getChildren().addAll(mainContainerHolder , header);
        stage.setScene(new Scene(absoluteContainer , 330 , 520));

   }
}