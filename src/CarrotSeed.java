import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CarrotSeed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarrotSeed extends Item
{
    public CarrotSeed(){
        this.sellPrice = 0;
        this.buyPrice = 10;
        this.name = "Carrot\nSeed";
        this.id = 3;
        this.inventoryImage = new GreenfootImage("carrot-inv.png");
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
