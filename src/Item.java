import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Items superclass holds all items used in the games as subclasses.
 */
public abstract class Item extends Actor
{
    int sellPrice;
    int buyPrice;
    String name;
    int id;
    int counter = 0;
    int growthStage = 0;
    int growthTime = 0;
    int seedId;

    GreenfootImage[] growthStageImages = new GreenfootImage[4];
    GreenfootImage inventoryImage;

    public void act()
    {
        if (getWorld() instanceof Farm) {
            this.counter += 1;
            // change growth change after certain time period
            if (counter % growthTime == 0 && growthStage < 3) {
                this.growthStage += 1;
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
        // set image when in inventory or shop
        if (getWorld() instanceof InventoryUi) {
            this.setImage(this.inventoryImage);
            // add sell option when in inventory
            if (Greenfoot.mouseClicked(this)){this.sell();}
        }
        if (getWorld() instanceof ShopUi) {
            this.setImage(this.inventoryImage);
            // add buy option when in shop
            if (Greenfoot.mouseClicked(this)){this.buy();}
        }
    }

    String getName() {return this.name;}

    int getSellPrice() {return this.sellPrice;}

    int getBuyPrice() {return this.buyPrice;}

    // sell action for items in inventory
    void sell(){
        Data data = new Data();
        if (data.items[this.id] > 0){
            // add money, remove item from inventory and save to file
            data.addMoney(this.sellPrice);
            data.items[this.id] -= 1;
            data.write();
        }
        // refresh inventory after selling
        Farm farmWorld = ((InventoryUi)getWorld()).farmWorld;
        Greenfoot.setWorld(new InventoryUi(farmWorld));
    }

    // buy action for items in shop
    void buy(){
        // add item to inventory, remove money and save to file
        Data data = new Data();
        if(data.getMoney() >= this.buyPrice) {
            data.items[this.id] += 1;
            data.setMoney(data.getMoney()-this.buyPrice);
            data.write();
        }
    }
}
