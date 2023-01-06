import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Carrot is a subclass to Items, which contains the data for Carrot objetcs.
 */
public class Carrot extends Item
{   
    public Carrot(){
        this.sellPrice = 20;
        this.buyPrice = 20;
        this.name = "Carrot";
        this.id = 1;
        this.seedId = 3;
        this.growthTime = 200;

        this.growthStageImages[0] = new GreenfootImage("carrot-0.png");
        this.growthStageImages[1] = new GreenfootImage("carrot-1.png");
        this.growthStageImages[2] = new GreenfootImage("carrot-2.png");
        this.growthStageImages[3] = new GreenfootImage("carrot-3.png");
        
        this.inventoryImage = new GreenfootImage("carrot-inv.png");
    }
}
