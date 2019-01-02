package com.lxisoft.view.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.control.ToolBar;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Window;
import javafx.stage.Stage;
import javafx.scene.paint.*;
import javafx.scene.text.*;

import com.lxisoft.controller.*;

public class MenuController {

    public static double sceneX;

    public static double sceneY;

    @FXML
    private ToolBar toolBar;

    @FXML
    private ImageView powerButton;

    @FXML
    private ImageView playButton;

    @FXML
    private BorderPane menuContainer;

    @FXML 
    private VBox appContainer;

    @FXML
    private Label title;


    @FXML
    protected void closeWindow() {

        System.exit(0);
    }

    @FXML
    public void initialize() {

        title.setFont(

            Font.loadFont(MenuController.class.getResource("/fonts/OstrichSans-Bold.otf").toExternalForm(),50)

            );
    }

  
    @FXML
    protected void initHandlers() {


        toolBar.setOnMousePressed((event)->{

            MenuController.sceneX = event.getSceneX();
            MenuController.sceneY = event.getSceneY();
        });

        toolBar.setOnMouseDragged((event)->
        {
            toolBar.getScene().getWindow().setX(event.getSceneX() - MenuController.sceneX);
            toolBar.getScene().getWindow().setY(event.getSceneY() - MenuController.sceneY);

        });

      
        playButton.setOnMousePressed((event)->
        {

            try {

               ModeController.setAppContainer(appContainer);
    
                FXMLLoader boardLoader = new FXMLLoader();
    
                Pane mode = (Pane)boardLoader.load(getClass().getResource("/model/mode.fxml"));

                appContainer.getChildren().remove(menuContainer);

                appContainer.getChildren().add(mode);
            
                
            } catch (Exception e) {

                e.printStackTrace();
            }
        }); 

    }
}