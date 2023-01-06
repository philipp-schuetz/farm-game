import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main world of this project.
 */
public class Farm extends World
{
    // fields which can be used for planting
    int[][] fields = {
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        };
    //start coordinates for field placement (left/top corner)
    int[] fieldsStartPos = new int[]{2,2};

    public Farm()
    {    
        // Create a new world with 32x16 cells with a cell size of 32x32 pixels.
        super(32, 16, 32);
        prepare();
        
        // give player starter money on new save
        Data data = new Data();
        if(data.getMoney()<=0){
            data.setMoney(20);
        }
    }
    
    public void act(){
        // set fixed speed, that growth speed of plants can't be influeced by player
        Greenfoot.setSpeed(50);
        
        if(Greenfoot.isKeyDown("f1")) {
            Greenfoot.setWorld(new Help(this));
        }
    }

    private void prepare()
    {
        //add buttons and horse into world
        addObject(new InventoryButton(),1,14);
        addObject(new ShopButton(),3,14);
        addObject(new Horse(),28,3);

        // place fields into world
        for (int i = 0; i < this.fields.length; i++) {
            for (int j = 0; j < this.fields[i].length; j++) {
                if(this.fields[i][j] == 1) {
                    Field field = new Field();
                    addObject(field, this.fieldsStartPos[0]+j, this.fieldsStartPos[1]+i);
                }
            }
        }
    }
}
