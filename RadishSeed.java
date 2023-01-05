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
    private static String name = "Radish\nSeed";
    public static int id = 2;

    public String getName() {return this.name;}

    public int getSellPrice() {return this.sellPrice;}

    private void sell(){
        Data data = new Data();
        if (data.items[this.id] > 0){
            data.addMoney(this.sellPrice);
            data.items[this.id] -= 1;
            data.write();
        }
        Farm farmWorld = ((InventoryUi)getWorld()).farmWorld;
        Greenfoot.setWorld(new InventoryUi(farmWorld));
    }
}
