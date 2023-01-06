import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RadishSeed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadishSeed extends Item
{   
    public RadishSeed(){
        this.sellPrice = 0;
        this.buyPrice = 10;
        this.name = "Radish\nSeed";
        this.id = 2;
        this.inventoryImage = new GreenfootImage("radish-inv.png");
    }

    @Override
    public void act(){
        if (getWorld() instanceof InventoryUi) {
            this.setImage(this.inventoryImage);
            if (Greenfoot.mouseClicked(this)){this.sell();}
        }
        if (getWorld() instanceof ShopUi) {
            this.setImage(this.inventoryImage);
            if (Greenfoot.mouseClicked(this)){this.buy();}
        }
    }
}
