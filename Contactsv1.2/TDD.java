

import contact.controller.*;

import javafx.application.Application;
import javafx.event.Event;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.*;
import javafx.fxml.FXMLLoader;

import javafx.scene.input.MouseEvent;
import javafx.scene.input.MouseButton;

import contact.extra.ApplicationProperties;

public class TDD extends Application
{

    public static void main(String[] args) throws Exception {

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception
    {

      String mainViewXML = "contact/view/xml/mainView.xml";

      ApplicationProperties.setSaveDirectory("data/");
      ApplicationProperties.setSaveFile("db");  
      ApplicationProperties.initAppController();


      FXMLLoader mainLoader = new FXMLLoader();
      Pane pane= mainLoader.load(getClass().getResource(mainViewXML));
      Scene mainScene = new Scene(pane,330,480);
      stage.setTitle("People");
      stage.setScene(mainScene);
      stage.setResizable(false);
      stage.show();

     

    }

}
