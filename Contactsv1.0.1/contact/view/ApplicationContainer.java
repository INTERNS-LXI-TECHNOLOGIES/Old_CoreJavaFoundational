package contact.view;

import javafx.stage.Stage;
import javafx.scene.Scene;

public class ApplicationContainer
{
    private static Stage apc_stage;

    private static Scene prevScene;

    private Scene scene;

    public static void setStage(Stage stage)
    {
        apc_stage = stage;
    }

    public static Scene setScene(ApplicationContainer container , Scene scene)
    {
        prevScene = container.scene;

        container.scene = scene;

        apc_stage.setScene(container.scene);   

        return container.scene;
    }

    public static Scene getPrevScene()
    {
        return prevScene;
    }

    public static void show(ApplicationContainer container)
    {
        apc_stage.show();
    }

    public static Stage getStage()
    {
        return apc_stage;
    }

}