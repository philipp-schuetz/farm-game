import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ui element to exit from a menu.
 */
public class ExitButton extends Interface
{
    World exitTo;
    public ExitButton(World world) {
        this.exitTo = world;
    }

    public void act()
    {
        if(Greenfoot.mouseClicked(this) || Greenfoot.isKeyDown("escape")) {
            if (getWorld() instanceof InventoryUi || getWorld() instanceof ShopUi) {
                Greenfoot.setWorld(exitTo);
            }
        }
    }
}
