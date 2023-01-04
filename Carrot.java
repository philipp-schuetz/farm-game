import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Carrot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carrot extends Item
{
    public static int sellPrice = 20;
    static int buyPriceSeed = 10;

    // four growth stages
    int growthStage = 0;
    GreenfootImage[] growthStageImages = {
            new GreenfootImage("carrot-0.png"),
            new GreenfootImage("carrot-1.png"),
            new GreenfootImage("carrot-2.png"),
            new GreenfootImage("carrot-3.png")};

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

            // right click to harvest crop (add to inventory, then remove from world)
            if(Greenfoot.mouseClicked(this) && Greenfoot.getMouseInfo().getButton() == 3 && this.growthStage == 3) {
                ((Farm)getWorld()).addItem(1, 1);
                getWorld().removeObject(this);
            }
        }
        if (getWorld() instanceof InventoryUi) {
            this.setImage(new GreenfootImage("carrot-inv.png"));
        }
    }
}
