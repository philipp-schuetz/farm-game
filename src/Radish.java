import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Radish is a subclass to Items, which contains the data for Radish objetcs.
 */
public class Radish extends Item
{
    public Radish(){
        this.sellPrice = 20;
        this.buyPrice = 20;
        this.name = "Radish";
        this.id = 0;
        this.seedId = 2;
        this.growthTime = 100;

        this.growthStageImages[0] = new GreenfootImage("radish-0.png");
        this.growthStageImages[1] = new GreenfootImage("radish-1.png");
        this.growthStageImages[2] = new GreenfootImage("radish-2.png");
        this.growthStageImages[3] = new GreenfootImage("radish-3.png");
        
        this.inventoryImage = new GreenfootImage("radish-inv.png");
    }
}
