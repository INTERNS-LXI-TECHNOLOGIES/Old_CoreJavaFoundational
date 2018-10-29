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

import contact.controller.ContactController;
import contact.model.Contact;
import contact.view.ContactOnClick;
import contact.extras.Console;


import java.util.List;
import java.util.Set;


public class ContactListForm 
{
    private static ContactOnClick contactOnClick;

    public static void setContactClickMethod(ContactOnClick pcontactOnClick)
    {
        contactOnClick = pcontactOnClick;
    }

    public static Scene createForm(List<Contact> t)
    {
        ScrollPane mainContainer = new ScrollPane();
        mainContainer.setHbarPolicy(ScrollBarPolicy.NEVER);
        mainContainer.setVbarPolicy(ScrollBarPolicy.ALWAYS);
        mainContainer.setStyle("-fx-font-size: 1px;");

        VBox container = new VBox();
        container.setPadding(new Insets(1,0,1,0));
        container.setSpacing(3);

        HBox singleContactList = null;
        VBox singleContactListDetails;

        Text contactName , contactNumber , contactEmail;
        StackPane contactImageHolder;
        Image contactImage;
        Circle contactImageBackground;

        for(Contact tmp : t)
        {
            Font contactNameFont = new Font("Aerial" , 15);
            Font contactNumberFont = new Font("Aerial" , 10);
            Font contactEmailFont = new Font("Aerial" , 10);

            singleContactList = new HBox(); 
            singleContactListDetails = new VBox(); 
            
            singleContactList.setPrefHeight(50);
            singleContactList.setPrefWidth(400);
            singleContactList.setPadding(new Insets(10,10,10,10));
            singleContactList.setSpacing(20);
         
            singleContactListDetails.setSpacing(5);
            


            HBox tmpSingleContactList = singleContactList; 
            ContactOnClick tmpContactOnClick = contactOnClick;

            singleContactList.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent e)->
            {  
                tmpSingleContactList.setBackground(new Background(new BackgroundFill(Color.BURLYWOOD, CornerRadii.EMPTY, Insets.EMPTY)));      
            });

            singleContactList.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent e)->
            {  
                tmpSingleContactList.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
            });

            singleContactList.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e)->
            {
                tmpContactOnClick.click(tmp);
            });

            contactName = new Text(tmp.getName());
            contactNumber = new Text(tmp.getNumbers().toString());
            contactEmail = new Text(tmp.getEmails().toString());
            contactName.setFont(contactNameFont);
            contactNumber.setFont(contactNumberFont);
            contactEmail.setFont(contactEmailFont);

            contactImageBackground = new Circle(30);
            contactImage = new Image("contact/view/contact.png");
            contactImageHolder = new StackPane();

            contactImageBackground.setFill(new ImagePattern(contactImage));        
            contactImageBackground.setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));

            contactImageHolder.getChildren().add(contactImageBackground);
            singleContactList.getChildren().add(contactImageHolder);
            singleContactListDetails.getChildren().addAll(contactName , contactNumber , contactEmail);
            singleContactList.getChildren().add(singleContactListDetails);
            container.getChildren().add(singleContactList); 

            mainContainer.setContent(container);
        }

        return new Scene(mainContainer , 330,480);
    }
}