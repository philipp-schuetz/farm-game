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

        addObject(new Money(),850,120);

        for (int i = 0; i < this.farmWorld.items.length; i++) {
            if (i == 0){
                Radish item = new Radish();
                this.textName = new Text("Radish: "+this.farmWorld.items[i], 20);
                this.textPrice = new Text("G: "+item.sellPrice, 20);
            }
            else if(i == 1){
                Carrot item = new Carrot();
                this.textName = new Text("Carrot: "+this.farmWorld.items[i], 20);
                this.textPrice = new Text("G: "+item.sellPrice, 20);
            }
            // if no item is assigned to inventory slot
            else {
                Placeholder item = new Placeholder();
                this.textName = new Text("N/A", 20);
                this.textPrice = new Text("N/A", 20);
            }
            // modify base values on y-axis when changing column
            if (i % 8 == 0) {
                this.baseYImg += shift;
                this.baseYName += shift;
                this.baseYPrice += shift;
                this.iMod += 8;
            }
            addObject(item, this.baseX+(i-this.iMod*this.shift), this.baseYImg);
            addObject(textName, this.baseX+(i-this.iMod*this.shift), this.baseYName);
            addObject(textPrice, this.baseX+(i-this.iMod*this.shift), this.baseYPrice);
        }
    }
}
