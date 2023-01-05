import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CarrotSeed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarrotSeed extends Item
{
    private static int sellPrice = 0;
    public static int buyPrice = 10;
    private static String name = "Carrot Seed";

    public String getName() {return this.name;}

    public int getSellPrice() {return this.sellPrice;}

    private void sell(){
        ((Farm)getWorld()).addMoney(this.sellPrice);
    }
}
