import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InventoryUi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InventoryUi extends World
{
    Farm farmWorld;
    int baseYImg = 100;
    int baseYName = 120;
    int baseYPrice = 140;
    int baseX = 120;
    int shift = 80;
    int iMod = 0;

    Item item;
    Text textName;
    Text textPrice;
    
    /**
     * Constructor for objects of class InventoryUi.
     * 
     */
    public InventoryUi(Farm world)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 512, 1);

        //save farm world
        this.farmWorld = world;
        prepare();
    }

    private void prepare()
    {
        addObject(new ExitButton(this.farmWorld),1008,16);
        addObject(new MoneyIcon(),750,120);
        addObject(new MoneyText(this.farmWorld),850,120);

        for (int i = 0; i < this.farmWorld.items.length; i++) {
            if (i == 0){
                this.item = new Radish();
            }
            else if(i == 1){
                this.item = new Carrot();
            }
            // if no item is assigned to inventory slot
            else {
                this.item = new Placeholder();
            }
            // modify base values on y-axis when changing column
            if (i % 8 == 0 && i != 0) {
                this.baseYImg += shift;
                this.baseYName += shift;
                this.baseYPrice += shift;
                this.iMod += 8;
            }

            this.textName = new Text(this.item.name+": "+this.farmWorld.items[i], 20);
            this.textPrice = new Text("G: "+this.item.sellPrice, 20);

            int xAdd = (i-this.iMod)*this.shift;
            addObject(this.item, this.baseX+xAdd, this.baseYImg);
            addObject(this.textName, this.baseX+xAdd, this.baseYName);
            addObject(this.textPrice, this.baseX+xAdd, this.baseYPrice);
        }
    }
}
