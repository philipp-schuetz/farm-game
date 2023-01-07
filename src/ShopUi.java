import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ui class for the shop.
 */
public class ShopUi extends World
{
    public Farm farmWorld;
    // base positioning values for items
    int baseYImg = 100;
    int baseYName = 120;
    int baseYPrice = 140;
    int baseX = 120;
    // distance from one inventory slot to another
    int shift = 80;
    // modification of i to add more shift for each column
    int iMod = 0;

    Item item;
    Text textName;
    Text textPrice;

    public ShopUi(Farm world){    
        // Create a new world with 1024x512 cells with a cell size of 1x1 pixels.
        super(1024, 512, 1);

        //save farm world to preserve state
        this.farmWorld = world;
        prepare();
    }

    private void prepare(){
        // add exit button to return to Farm later
        addObject(new ExitButton(this.farmWorld),1008,16);

        // add objects for money display
        addObject(new MoneyIcon(),750,120);
        addObject(new MoneyText(),850,120);

        // place items from Data into shop
        Data data = new Data();
        for (int i = 0; i < data.items.length; i++) {
            if (i == 0){
                this.item = new Radish();
            }
            else if(i == 1){
                this.item = new Carrot();
            }
            else if(i == 2){
                this.item = new RadishSeed();
            }
            else if(i == 3){
                this.item = new CarrotSeed();
            }
            // use Placeholder if no item is assigned to inventory slot
            else {
                this.item = new Placeholder();
            }
            // modify base/positioning values on y-axis of items when changing row (when ids 8 or 16 are reached)
            if (i % 8 == 0 && i != 0) {
                this.baseYImg += shift;
                this.baseYName += shift;
                this.baseYPrice += shift;
                // "reset" shift on new row
                this.iMod += 8;
            }

            // create Text objects with data from save file
            this.textName = new Text(this.item.getName(), 15);
            this.textPrice = new Text("Cost: "+this.item.getBuyPrice(), 15);

            // shift on x-axis
            int xAdd = (i-this.iMod)*this.shift;

            addObject(this.item, this.baseX+xAdd, this.baseYImg);
            addObject(this.textName, this.baseX+xAdd, this.baseYName);
            addObject(this.textPrice, this.baseX+xAdd, this.baseYPrice);
        }
    }
}
