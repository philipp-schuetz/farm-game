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
    private static int buyPrice;
    private static String name;
    private static int id;

    public String getName() {return this.name;}

    public int getSellPrice() {return this.sellPrice;}
    public int getBuyPrice() {return this.buyPrice;}

    private void sell(){
        Data data = new Data();
        if (data.items[this.id] > 0){
            data.addMoney(this.sellPrice);
            data.items[this.id] -= 1;
        }
    }
}
