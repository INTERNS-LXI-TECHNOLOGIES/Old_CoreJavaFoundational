package contact.view;

import javafx.scene.shape.*;
import javafx.scene.Cursor;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.geometry.*;
import javafx.scene.text.*;

public class ContactHeader
{

    private static StackPane pane = new StackPane();;

    public static StackPane getAddBackButton()
    {
        
        StackPane pane = new StackPane();
        Image backDisabled = new Image("contact/view/assets/png/backdisabled.png");
        Image backEnabled = new Image("contact/view/assets/png/backenabled.png");
        Circle circle = new Circle(20);

        circle.setFill(new ImagePattern(backDisabled));

        pane.setCursor(Cursor.HAND);
        pane.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e)->
        {
           circle.setFill(new ImagePattern(backEnabled));
        });

        pane.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e)->
        {
            circle.setFill(new ImagePattern(backDisabled));
        });

        pane.setLayoutX(270);
        pane.setLayoutY(20);

        pane.getChildren().addAll(circle);
        
        return pane;
    }

    public static StackPane getAddContactButton()
    {
   
        Circle circle = new Circle(20);
        
        Image contactDisabled = new Image("contact/view/assets/png/contactdisabled.png");
        Image contactEnabled = new Image("contact/view/assets/png/contactenabled.png");

        circle.setFill(new ImagePattern(contactDisabled));

        pane.setCursor(Cursor.HAND);
        pane.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e)->
        {
           circle.setFill(new ImagePattern(contactEnabled));
        });

        pane.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e)->
        {
           circle.setFill(new ImagePattern(contactDisabled));
        });

        pane.setLayoutX(270);
        pane.setLayoutY(460);

        pane.getChildren().addAll(circle);
        
        return pane;
    }
    
}