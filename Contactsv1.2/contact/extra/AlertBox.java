
package contact.extra;

import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.input.*;
import javafx.scene.paint.*;

public class AlertBox
    {
        private static Pane Container;
        private static long sleep;

        public static void msg(String m , int w , int h)
        {
          
            try {

                VBox blocker = new VBox();
                VBox alertContainer = new VBox();
                Label txt = new Label(m);

                blocker.setPrefSize(w,h);
                blocker.setOpacity(0.3);
                blocker.setStyle("-fx-background-color:black;");

                alertContainer.setPrefWidth(330);
                alertContainer.setAlignment(Pos.CENTER);
                alertContainer.setPrefHeight(200);
                alertContainer.setOpacity(0.9);
                alertContainer.setPadding(new Insets(20,20,20,20));
                alertContainer.setStyle("-fx-background-color:black;");
                alertContainer.setLayoutY(520/2 - 200/2);
                
                txt.setTextFill(Color.WHEAT);

                alertContainer.getChildren().add(txt);
                Container.getChildren().addAll(blocker , alertContainer);
        
    
                alertContainer.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e)->
                {
                    try {
                        
                        Container.getChildren().removeAll(blocker , alertContainer);

                    } catch (Exception es) {
                        //TODO: handle exception
                    }
                });

            } catch (Exception e) {
                //TODO: handle exception
            }
        }

        public static void setContainer(Pane container)
        {
            Container = container;
        }

        public static void sleep(long sl) {
            
            sleep = sl;
        }

    
    }