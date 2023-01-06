import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button to change world to Shop.
 */
public class ShopButton extends Interface
{
    public void act()
    {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new ShopUi((Farm)this.getWorld()));
        }
    }
}
