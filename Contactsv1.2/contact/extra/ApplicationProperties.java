package contact.extra;

import contact.controller.ContactController;

public class ApplicationProperties
{
    private static ContactController appController;

    private static String saveDirectory;

    private static String saveFile;

    public static ContactController getAppController()
    {
        return appController;
    }

    public static String getSaveDirectory()
    {
        return saveDirectory;
    }

    public static String getSaveFile()
    {
        return saveFile;
    }

    public static void setAppController(ContactController AppController)
    {
        appController = AppController;
    }

    public static void setSaveDirectory(String SaveDirectory)
    {
        saveDirectory = SaveDirectory;
    }

    public static void setSaveFile(String SaveFile)
    {
        saveFile = SaveFile;
    }

    public static void initAppController()
    {
        appController = new ContactController();
        appController.setSaveDirectory(saveDirectory);
        appController.setSaveFile(saveFile);
        appController.initRepository();
    }
}
