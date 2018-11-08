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
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

import contact.extras.Console;
import contact.model.Contact;
import contact.controller.ContactController;
import contact.view.ContactOnClick;
import contact.view.ContactHeader;


import java.util.List;


public class ContactListForm 
{
    private static ContactOnClick contactOnClick;

    private static StackPane header;

    public static void setHeader(StackPane pheader)
    {
        header = pheader;
        header.setStyle("-fx-font-size: 20px;");
    }

    public static void setContactClickMethod(ContactOnClick pcontactOnClick)
    {
        contactOnClick = pcontactOnClick;
    }

    public static Scene createForm(List<Contact> t)
    {
        Pane absoluteContainer = new Pane();

        ScrollPane mainContainer = new ScrollPane();
        mainContainer.setPrefSize(330, 480);
        mainContainer.setFitToWidth(true);
       
        mainContainer.setVbarPolicy(ScrollBarPolicy.ALWAYS);
        mainContainer.setStyle("-fx-font-size: 1px;");

        VBox container = new VBox();
        container.setPadding(new Insets(1,0,1,0));
        container.setSpacing(3);

        HBox searchBoxContainer = new HBox();
        TextField searchBox = new TextField();

        searchBox.setPrefWidth(320);
        searchBox.setFont(new Font(20));
        searchBoxContainer.setPadding(new Insets(5,5,5,5));
        searchBoxContainer.getChildren().add(searchBox);

        searchBox.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e)->{

            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Not complete");
            alert.setContentText("Not yet implemented");
    
            alert.showAndWait();

        });

  
        
        absoluteContainer.getChildren().add(searchBoxContainer);

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
            singleContactList.setBackground(new Background(new BackgroundFill(Color.color(1, 1 ,1), CornerRadii.EMPTY, Insets.EMPTY)));
    
         
            singleContactListDetails.setSpacing(5);
            


            HBox tmpSingleContactList = singleContactList; 
            ContactOnClick tmpContactOnClick = contactOnClick;

            singleContactList.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent e)->
            {  
                tmpSingleContactList.setBackground(new Background(new BackgroundFill(Color.BURLYWOOD, CornerRadii.EMPTY, Insets.EMPTY)));      
            });

            

            singleContactList.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent e)->
            {  
                tmpSingleContactList.setBackground(new Background(new BackgroundFill(Color.color(1, 1 ,1), CornerRadii.EMPTY, Insets.EMPTY)));
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
            contactImage = new Image("contact/view/assets/png/contact.png");
            contactImageHolder = new StackPane();

            contactImageBackground.setFill(new ImagePattern(contactImage));        
            contactImageBackground.setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));

            contactImageHolder.getChildren().add(contactImageBackground);
            singleContactList.getChildren().add(contactImageHolder);
            singleContactListDetails.getChildren().addAll(contactName , contactNumber , contactEmail);
            singleContactList.getChildren().add(singleContactListDetails);
            container.getChildren().add(singleContactList); 

        }

       
        mainContainer.setContent(container);
        mainContainer.setLayoutY(40);
        absoluteContainer.getChildren().addAll(mainContainer , header);

        return new Scene(absoluteContainer , 330,520);
    }
}