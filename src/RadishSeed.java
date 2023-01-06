import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * RadishSeed is a subclass to Items, which contains the data for RadishSeed objetcs.
 */
public class RadishSeed extends Item
{   
    public RadishSeed(){
        this.sellPrice = 0;
        this.buyPrice = 10;
        this.name = "Radish\nSeed";
        this.id = 2;
        this.inventoryImage = new GreenfootImage("radish-0.png");
    }

    @Override
    public void act(){
        // set image when in inventory or shop
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
