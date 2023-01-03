import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExitButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExitButton extends Interface
{
    World exitTo;
    public ExitButton(World world) {
        this.exitTo = world;
    }
    
    /**
     * Act - do whatever the ExitButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this) || Greenfoot.isKeyDown("escape")) {
            if (getWorld() instanceof InventoryUi) {
                Greenfoot.setWorld(exitTo);
            }
        }
    }
}
