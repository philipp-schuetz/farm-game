import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Placeholder acts as a placeholder for not existing items in inventory and shop.
 */
public class Placeholder extends Item
{
    private static int sellPrice = 0;
    private static String name = "N/A";
    
    public String getName() {return this.name;}
    public int getSellPrice() {return this.sellPrice;}
}
