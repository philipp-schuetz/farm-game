import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alert here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alert extends Interface
{
    private int counter;
    private int time;

    private String text = "";
    private int size = 10;
    public Alert(String text, int size, int time){
        this.text = text;
        this.size = size;
        this.time = time;
    }

    public void act()
    {
        setImage(new GreenfootImage(this.text, this.size, Color.WHITE, new Color(0,0,0,0)));

        if (counter < time){
            counter++;
        } else {
            getWorld().removeObject(this);
        }

    }
}
