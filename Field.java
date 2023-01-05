import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Field here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Field extends Actor
{
    private int seedSelected;
    // 0 - radish seed
    // 1 - carrot seed
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Data data = new Data();

            seedSelected = data.getSeedSelected();

            MouseInfo mouse = Greenfoot.getMouseInfo();
            if (seedSelected == 0){
                getWorld().addObject(new Radish(), mouse.getX(), mouse.getY());
                //check in inventory if have seeds
            } else if (seedSelected == 1){
                getWorld().addObject(new Carrot(), mouse.getX(), mouse.getY());
            } else if (seedSelected == -1){ //use default crop when unset
                getWorld().addObject(new Radish(), mouse.getX(), mouse.getY());
            }
        }
    }
}
