import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * CarrotSeed is a subclass to Items, which contains the data for CarrotSeed objetcs.
 */
public class CarrotSeed extends Item
{
    public CarrotSeed(){
        this.sellPrice = 0;
        this.buyPrice = 10;
        this.name = "Carrot\nSeed";
        this.id = 3;
        this.inventoryImage = new GreenfootImage("carrot-0.png");
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
