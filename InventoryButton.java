import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inventory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InventoryButton extends Interface
{
    /**
     * Act - do whatever the Inventory wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new InventoryUi(getWorld()));
        }
        // change image of button on hover
        if (Greenfoot.mouseMoved(this)){
            setImage(new GreenfootImage("backpack-outline.png"));
        }
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)){
            setImage(new GreenfootImage("backpack.png"));
        }
    }
}
