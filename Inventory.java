import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inventory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inventory extends Actor
{
    static int[] items = new int[24];
    // inventory ids
    // 0 - radish
    
    /**
     * Act - do whatever the Inventory wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void addItem(int id, int count) {
        this.items[id] = this.items[id] + count;
        System.out.println(this.items[0]);
    }
}
