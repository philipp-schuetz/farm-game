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
    private static String name = "Carrot\nSeed";
    public static int id = 3;

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
