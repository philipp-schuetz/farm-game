import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button to change world to Inventory.
 */
public class InventoryButton extends Interface
{
    public void act()
    {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new InventoryUi((Farm)this.getWorld()));
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
