import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Farm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Farm extends World
{
    int[][] fields = {
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        };
    int[] fieldsStartPos = new int[]{2,2};
    /**
     * Constructor for objects of class Farm.
     * 
     */
    public Farm()
    {    
        // Create a new world with 32x16 cells with a cell size of 32x32 pixels.
        super(32, 16, 32);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        InventoryButton inventoryButton = new InventoryButton();
        addObject(inventoryButton,1,14);
        
        addObject(new Inventory(), 0, 0);
        
        // set fields into world
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
