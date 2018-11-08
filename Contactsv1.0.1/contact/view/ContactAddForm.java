package contact.view;


import javafx.application.Application;
import javafx.stage.FileChooser;
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
import javafx.scene.image.ImageView;
import javafx.scene.paint.ImagePattern;

import contact.model.Contact;
import contact.controller.ContactController;
import contact.view.ApplicationContainer;

public class ContactAddForm extends Form
{
    final private String defaultImagePNGUrl = "contact/view/assets/png/contact.png";
    final private String backButtonDisabledPNGUrl = "contact/view/assets/png/backdisabled.png";
    final private String backButtonEnabledPNGUrl = "contact/view/assets/png/backenabled.png";
    final private String saveButtonEnabledPNGUrl = "contact/view/assets/png/saveenabled.png";
    final private String saveButtonDisabledPNGUrl = "contact/view/assets/png/savedisabled.png";
    final private String selectPhotoEnabledPNGUrl = "contact/view/assets/png/selectphotoenabled.png";
    final private String selectPhotoDisabledPNGUrl = "contact/view/assets/png/selectphotodisabled.png";

    private int status;

    private boolean state = true;

    private ApplicationContainer appContainer;

    private ContactController contactsController;

    private Scene contactAddScene;

    private Pane absoluteContainer;
    private VBox mainContainer;
    private VBox contactFormContainer;
    private StackPane cImageContainer;

    private Circle createBackBtn , createSaveBtn , cImage ;

    private ImageView cImageSelect;

    private TextField txtNameInput , txtNumberInput , txtEmailInput;

    public static class AlertBox
    {
        private static Pane Container;
        private static long sleep;

        public static void msg(String m , ContactAddForm me)
        {
          
            try {

                VBox blocker = new VBox();
                VBox alertContainer = new VBox();
                Label txt = new Label(m);

                blocker.setPrefSize(me.getWidth()  , me.getHeight());
                blocker.setOpacity(0.5);
                blocker.setStyle("-fx-background-color:black;");

                alertContainer.setPrefWidth(330);
                alertContainer.setAlignment(Pos.CENTER);
                alertContainer.setPrefHeight(200);
                alertContainer.setOpacity(0.7);
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

    public ContactAddForm()
    {
        absoluteContainer = new Pane();
        mainContainer = new VBox();
        contactFormContainer = new VBox();

        this.createBackBtn = new Circle(20);
        this.createBackBtn.setFill(new ImagePattern(new Image(this.backButtonDisabledPNGUrl)));

        this.createSaveBtn = new Circle(20);
        this.createSaveBtn.setFill(new ImagePattern(new Image(this.backButtonDisabledPNGUrl)));
      
        this.cImageContainer = new StackPane();
        this.cImageSelect = new ImageView(new Image(this.selectPhotoDisabledPNGUrl));
        this.cImageSelect.setScaleX(2);
        this.cImageSelect.setScaleY(2);
        this.cImage = new Circle(90);
        this.cImage.setFill(new ImagePattern(new Image(this.defaultImagePNGUrl)));
        

        this.txtNameInput = new TextField();
        this.txtNumberInput = new TextField();
        this.txtEmailInput = new TextField();

    }

    public void createScene()
    {
        this.setBackBtn();
        this.setSaveBtn();

       this.txtEmailInput.setText("");
       this.txtNumberInput.setText("");
       this.txtNameInput.setText("");


        cImageContainer.addEventHandler(MouseEvent.MOUSE_CLICKED , (MouseEvent e)->
        {
            FileChooser imageChooser = new FileChooser();
           imageChooser.setTitle("Select a Profile Pic..");
           imageChooser.showOpenDialog(ApplicationContainer.getStage());


        });



        cImageContainer.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e)->
        {
            cImageSelect.setImage(new Image(this.selectPhotoEnabledPNGUrl));
        });

        cImageContainer.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e)->
        {
            cImageSelect.setImage(new Image(this.selectPhotoDisabledPNGUrl));
        });

        this.absoluteContainer.setPrefSize(this.sceneWidth, this.sceneHeight);
        this.contactFormContainer.setPrefSize(this.sceneWidth, this.sceneHeight);
        this.mainContainer.setPrefWidth(this.sceneWidth);
        this.mainContainer.setPrefHeight(this.sceneHeight);
        this.cImageContainer.setPrefWidth(this.sceneWidth);
        this.cImageContainer.setAlignment(Pos.CENTER);


        this.contactFormContainer.setPadding(new Insets(14,14,14,14));
        this.contactFormContainer.setSpacing(20);

        this.mainContainer.setAlignment(Pos.CENTER);
        this.contactFormContainer.setAlignment(Pos.CENTER);
       
        this.createBackBtn.setLayoutX(this.sceneWidth - 270);
        this.createBackBtn.setLayoutY( this.sceneHeight - 460);

        this.createSaveBtn.setLayoutX(this.sceneWidth - 60);
        this.createSaveBtn.setLayoutY( this.sceneHeight - 460);

        this.txtNameInput.setPromptText("Enter Your Name");
        this.txtNumberInput.setPromptText("Enter Your Number");
        this.txtEmailInput.setPromptText("Enter Your Email");

        Font inputFieldFont = new Font(20);

        this.txtNameInput.setFont(inputFieldFont);
        this.txtNumberInput.setFont(inputFieldFont);
        this.txtEmailInput.setFont(inputFieldFont);



        if(this.status == 0)
        {
            this.cImageContainer.getChildren().addAll(this.cImage , this.cImageSelect);
            this.contactFormContainer.getChildren().addAll(this.cImageContainer , txtNameInput , txtNumberInput , txtEmailInput);
            this.mainContainer.getChildren().add(this.contactFormContainer);
            this.absoluteContainer.getChildren().addAll(this.mainContainer,this.createBackBtn , this.createSaveBtn);
            this.contactAddScene = new Scene(this.absoluteContainer , 330 , 520);
            status++;
        }

        this.appContainer.setScene(this.appContainer , this.contactAddScene);
        this.appContainer.show(this.appContainer);
    }

    public void setBackButtonEnabled()
    {
        this.createBackBtn.setFill(new ImagePattern(new Image(this.backButtonEnabledPNGUrl)));
    }

    public void setBackButtonDisabled()
    {
        this.createBackBtn.setFill(new ImagePattern(new Image(this.backButtonDisabledPNGUrl)));
    }

    public void setBackBtn()
    {
        this.setBackButtonDisabled();
        this.getBackButton().addEventHandler(MouseEvent.MOUSE_ENTERED , (MouseEvent e)->
        {
            this.setBackButtonEnabled();
            this.getBackButton().setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));

        });

        this.getBackButton().addEventHandler(MouseEvent.MOUSE_EXITED , (MouseEvent e)->
        {
            this.setBackButtonDisabled();
           
            // Remove shadow
        });
    }

    public void setSaveButtonEnabled()
    {
        this.createSaveBtn.setFill(new ImagePattern(new Image(this.saveButtonEnabledPNGUrl)));
    }

    public void setSaveButtonDisabled()
    {
        this.createSaveBtn.setFill(new ImagePattern(new Image(this.saveButtonDisabledPNGUrl)));
    }

    public void setSaveBtn()
    {
        this.setSaveButtonDisabled();
        this.getSaveButton().addEventHandler(MouseEvent.MOUSE_ENTERED , (MouseEvent e)->
        {
            this.setSaveButtonEnabled();
            this.getSaveButton().setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));

        });

        this.getSaveButton().addEventHandler(MouseEvent.MOUSE_EXITED , (MouseEvent e)->
        {
            this.setSaveButtonDisabled();
            
            // Remove shadow
        });
    }

    public void setAppContainer(ApplicationContainer container)
    {
        this.appContainer = container;
    }

    public Circle getBackButton()
    {
        return this.createBackBtn;
    }

    public Circle getSaveButton()
    {
        return this.createSaveBtn;
    }

    public Scene getScene()
    {
        return this.contactAddScene;
    }

    public ApplicationContainer getAppContainer()
    {
        return this.appContainer;
    }


    public void getValues()
    {
        try {

        Contact tmp = new Contact();
        String name = null;
        String number = " ";
        String email = " ";

        if(this.txtNameInput.getText().isEmpty())
        {
            throw new Exception("Error Name is empty");

        }
        else
        {
            
            name = this.txtNameInput.getText();
            number = this.txtNumberInput.getText();
            email = this.txtEmailInput.getText();

            tmp.setName(name);
            tmp.setEmail(email);
            tmp.setNumber(number);

            System.err.println(name);

            this.contactsController.add(tmp);

            if(!this.contactsController.getErrors().isEmpty())
            {
                throw new Exception("Contact with same name Already Exists");
            }
            
        }

            
        } catch (Exception e) {

            System.out.println(e);

            AlertBox.setContainer(this.absoluteContainer);
            AlertBox.msg(e.getMessage()  , this);

            this.state = false;
        }
        
    }

    public void setContactContainer(ContactController cc)
    {
        this.contactsController = cc;
    }

    public boolean success()
    {
        this.getValues();
        return this.state;
    }
}


