import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Radish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Radish extends Item
{
    private static int sellPrice = 20;
    private static String name = "Radish";
    public static int id = 0;
    private int seedId = 2;

    // four growth stages
    int growthStage = 0;
    GreenfootImage[] growthStageImages = {
            new GreenfootImage("radish-0.png"),
            new GreenfootImage("radish-1.png"),
            new GreenfootImage("radish-2.png"),
            new GreenfootImage("radish-3.png")};
    int counter = 0;
    /**
     * Act - do whatever the Radish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (getWorld() instanceof Farm) {
            counter = counter + 1;
            // change growth change after certain time period
            if (counter % 100 == 0 && growthStage < 3) {
                this.growthStage = this.growthStage + 1;
            }
            this.setImage(this.growthStageImages[growthStage]);

            // right click to harvest crop (add to inventory, add seed to inventory, then remove from world)
            if(Greenfoot.mouseClicked(this) && Greenfoot.getMouseInfo().getButton() == 3 && this.growthStage == 3) {
                Data data = new Data();
                data.addItem(this.id, 1);
                data.addItem(this.seedId, 1);
                getWorld().removeObject(this);
            }
        }
        if (getWorld() instanceof InventoryUi) {
            this.setImage(new GreenfootImage("radish-inv.png"));
            if (Greenfoot.mouseClicked(this)){this.sell();}
        }
    }

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
