import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RadishSeed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadishSeed extends Item
{
    private static int sellPrice = 0;
    public static int buyPrice = 10;
    private static String name = "Radish Seed";

    public String getName() {return this.name;}

    public int getSellPrice() {return this.sellPrice;}

    private void sell(){
        Data data = new Data();
        data.addMoney(this.sellPrice);
    }
}
