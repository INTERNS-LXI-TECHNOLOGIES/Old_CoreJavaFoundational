package contact.view;

public class Form
{

    protected double sceneWidth = 330;
    protected double sceneHeight = 520;

    public void setSceneSize(double w , double h)
    {
        this.sceneHeight = h;
        this.sceneWidth = w;
    }

    public double getWidth()
    {
        return this.sceneWidth;
    }

    public double getHeight()
    {
        return this.sceneHeight;
    }

}