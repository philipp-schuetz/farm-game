import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Items superclass holds all items used in the games as subclasses.
 * 
 * @author (Philipp Schütz) 
 * @version (a version number or a date)
 */
public class Item extends Actor
{
    private static int sellPrice;
    public static int buyPriceSeed;
    private static String name;
    
    public String getName() {return this.name;}
    public int getSellPrice() {return this.sellPrice;}
}
