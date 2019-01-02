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

public class ModeController {


    @FXML
    private Button humanVsPc;

    @FXML
    private BorderPane modeBoard;

    private static VBox appContainer;

	public VBox getAppContainer()
	{
		return ModeController.appContainer;
	}

	public static void setAppContainer(VBox appContainer)
	{
		ModeController.appContainer = appContainer;
	}

    public void initialize() {

        humanVsPc.addEventFilter(MouseEvent.MOUSE_CLICKED , ev->{

            try {
                
                GameInitController tmpGameInitController = new GameInitController();
                tmpGameInitController.setPlayer("You" , Color.RED);
                tmpGameInitController.setPlayer("PC" , Color.GREEN , 2);
    
                BoardViewController.setGameInitController(tmpGameInitController);
                BoardViewController.setAppContainer(ModeController.appContainer);
    
                FXMLLoader boardLoader = new FXMLLoader();
                
                Pane board = (Pane)boardLoader.load(getClass().getResource("/model/board.fxml"));
                
                this.getAppContainer().getChildren().remove(modeBoard);

                this.getAppContainer().getChildren().add(board);



            } catch (Exception e) {
                //TODO: handle exception
            }
        });
    }


}