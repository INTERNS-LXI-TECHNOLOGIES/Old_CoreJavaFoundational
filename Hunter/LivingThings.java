/**
 * interface LivingThings
 *
 *  -   void setPosX(int pox)
 *
 *  -   void setPosY(int poy)
 *
 *  -   int[] getCoordinates()
 *
 *  -   void getPosY()void getPosX()
 *
 *  -   void setCoordinates(int posx , int posy)
 *
 */
public interface LivingThings
{
    // Setters

    public void setPosX(int pox);
    public void setPosY(int poy);
    public void setCoordinates(int posx , int posy);

    // Getters

    public int getPosY();
    public int getPosX();
    public int[] getCoordinates();

    public void walk();

}
