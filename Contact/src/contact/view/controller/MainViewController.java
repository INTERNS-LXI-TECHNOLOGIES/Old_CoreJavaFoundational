package contact.view.controller;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import netscape.javascript.JSObject;
import java.io.File;


import contact.controller.*;

public class MainViewController extends Application {

	private static ContactController bcontroller;
	
	private WebView browser;
	
	private WebEngine webkit;
	
	public static ContactController getBController() {
		
		return bcontroller;
	}

	public static void setBController(ContactController _bcontroller) {
	
		bcontroller = _bcontroller;
	}
	
	public void start(Stage mainStage) {
		
		try {
			
			this.browser = new WebView();
			
			this.webkit = browser.getEngine();

			File homeFile = new File("../Contact/src/contact/view/html/App.html");
			
			this.webkit.setJavaScriptEnabled(true);
			
			this.webkit.getLoadWorker().stateProperty().addListener((o,os , ns)->{
				
					JSObject jobj = (JSObject )this.webkit.executeScript("window");
						
					jobj.setMember("app", new JAPP());
					
			});
			
			this.webkit.setOnAlert(event->{
				
				System.out.println(event.getData());
			}); 

			this.webkit.load(homeFile.toURI().toString());
			
			VBox browserContainer = new VBox();
			
			browserContainer.getChildren().add(this.browser);
			
			mainStage.setResizable(false);
			
			mainStage.setScene(new Scene(browserContainer , 300 , 480));
			
			mainStage.show();
			
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
	}

}

