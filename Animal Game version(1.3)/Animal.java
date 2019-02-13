import java.util.ArrayList;

public class Animal{
    

    private int positionX;
    private int positionY;
    private String name;
    private int strength;
    private int hungryLevel;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPositionX(int positionX){
        this.positionX=positionX;
    }
    public int getPositionX(){
        return positionX;
    }
    public void setPositionY(int positionY){
        this.positionY=positionY;
    }
    public int getPositionY(){
        return positionY;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getStrength() {
        return strength;
    }
    public void setHungryLevel(int hungryLevel) {
        this.hungryLevel = hungryLevel;
    }
    public int getHungryLevel() {
        return hungryLevel;
    }


    
}