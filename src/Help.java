import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class to show help.
 */
public class Help extends World
{
    World farmWorld;
    public Help(Farm world)
    {    
        // Create a new world with 32x16 cells with a cell size of 32x32 pixels.
        super(32, 16, 32);

        //save farm world to preserve state
        this.farmWorld = world;
        prepare();
    }

    private void prepare()
    {
        // add exit button to return to Farm later
        addObject(new ExitButton(this.farmWorld),1008,16);

        // add help texts
        addObject(new Text("Ui", 40), 16,0);
        addObject(new Text("Backpack on Farm = Inventory", 20), 16,1);
        addObject(new Text("Coin on Farm = Shop", 20), 16,2);
        addObject(new Text("only the icons are clickable in shop- and inventory ui", 20), 16,3);

        addObject(new Text("Crops", 40), 16,4);
        addObject(new Text("left click on field to plant", 20), 16,5);
        addObject(new Text("right click on field to harvest", 20), 16,6);
        addObject(new Text("change crop type in inventory (click on seed bag)", 20), 16,7);
        addObject(new Text("you can buy your first seeds in the shop", 20), 16,8);

        addObject(new Text("Buy", 40), 16,9);
        addObject(new Text("buy items in the shop (click on the icon)", 20), 16,10);

        addObject(new Text("Sell", 40), 16,11);
        addObject(new Text("sell items in the inventory (click on the icon)", 20), 16,12);
    }
}
