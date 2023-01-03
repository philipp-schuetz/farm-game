import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Field here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Field extends Actor
{
    /**
     * Act - do whatever the Field wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            // open seeds/harvest menu
            // is still clicked when crop growing?
            MouseInfo mouse = Greenfoot.getMouseInfo();
            getWorld().addObject(new Radish(), mouse.getX(), mouse.getY());
        }
    }
}
