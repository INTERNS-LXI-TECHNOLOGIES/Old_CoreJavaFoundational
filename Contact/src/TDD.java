
/*
	NOTICE
	------------
	This Project is Halted Due to too much time spent  in debugging front-end script in 
	javafx webview [ WebView does'nt have developer tools option so debugging scripts is difficult ]
	
*/



import contact.model.*;
import contact.controller.*;
import contact.view.controller.MainViewController;

public class TDD extends contact.view.controller.MainViewController{

	public static void main(String[] args) {
		
		
		String host = "jdbc:mariadb://localhost/mysql";
		
		String user = "jishnu";
		
		String pwd = "123";
		
		Repository<Contact> repo = new SQLRepository<Contact>(host , user , pwd , Contact.class);

		ContactController backEndController = new ContactController();
		backEndController.setRepository(repo);

		MainViewController.setBController(backEndController);
		
		launch(args);
	}

}
