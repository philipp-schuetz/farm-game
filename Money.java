import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Money here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Money extends Interface
{
    public static int money = 0;
    /**
     * Act - do whatever the Money wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(new GreenfootImage("" + this.money, 40, Color.WHITE, new Color(0,0,0,0)));
        if(Greenfoot.mouseClicked(this)){
            this.money += 20;
        }
    }
}
