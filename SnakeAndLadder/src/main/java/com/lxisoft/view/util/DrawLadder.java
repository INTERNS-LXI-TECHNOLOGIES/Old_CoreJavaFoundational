package com.lxisoft.view.util;

import javafx.scene.canvas.*;
import javafx.scene.paint.*;

public class DrawLadder {

    public static void draw(GraphicsContext gc , double x1,double y1 , double x2,double y2) {

        gc.beginPath();

        gc.setFill(Color.YELLOW);

        double pl1 = 15;

        double angle = Math.toDegrees(Math.atan((y2-y1)/(x2-x1)));

        if(angle >= 80 && angle <= 100) {

           // gc.setStroke(Color.GREEN);
            gc.lineTo(x1 + pl1,y1);
            gc.lineTo(x2 + pl1,y2);

            // finds points between x1,y1 and x2 ,y2
            // finds points between x1 + pl1,y1 and x2 + pl1 ,y2
        } 
        else if(angle  < 0.0) {

            //gc.setStroke(Color.BLUE);
            gc.lineTo(x1,y1 + pl1 + 10);
            gc.lineTo(x2,y2 + pl1 + 10);

        }
        else {

            //gc.setStroke(Color.YELLOW);
            gc.lineTo(x1,y1 + pl1);
            gc.lineTo(x2,y2 + pl1);

        }





        gc.stroke();

    }


    public void svae() {
        /*if(x1 == x2) {

            gc.lineTo(x1 + 13, y1);
            gc.lineTo(x2 + 13, y2);    
        }
        else if(y1 == y2) {

            gc.lineTo(x1, y1 + 13);
            gc.lineTo(x2, y2 + 13);    
        } 
        else if(small slope){

            gc.lineTo(x1 + 13, y1);
            gc.lineTo(x2 + 13, y2);   
        }
        else {

            gc.lineTo(x1, y1 + 13);
            gc.lineTo(x2, y2 + 13);
        }*/
    }
}

