import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InventoryUi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InventoryUi extends World
{

    /**
     * Constructor for objects of class InventoryUi.
     * 
     */
    public InventoryUi()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 512, 1);
        prepare();
    }
    private void prepare()
    {
        addObject(new ExitButton(),1008,16);
        
        addObject(new MoneyIcon(),750,120);
        
        addObject(new Money(),850,120);
    }
}
