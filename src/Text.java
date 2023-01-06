import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text extends Interface
{
    /**
     * Act - do whatever the Text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String text = "";
    private int size = 10;
    public Text(String text, int size){
        this.text = text;
        this.size = size;

    }

    public void act()
    {
        setImage(new GreenfootImage(this.text, this.size, Color.WHITE, new Color(0,0,0,0)));
    }

    public void setText(String text){
        this.text = text;
    }

    public void setSize(int size){
        this.size = size;
    }
}
