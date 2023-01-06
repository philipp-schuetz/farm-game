import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Fields on which crops are planted.
 */
public class Field extends Actor
{
    private int seedSelected;
    // 0 - radish seed
    // 1 - carrot seed
    public void act()
    {
        if(Greenfoot.mouseClicked(this) && Greenfoot.getMouseInfo().getButton() == 1){
            Data data = new Data();

            seedSelected = data.getSeedSelected();

            if (data.items[seedSelected+2] <= 0) {
                //if no seeds in inventory alert
                getWorld().addObject(new Alert("you need to buy seeds first", 20, 128), 10, 0);
            } else {
                MouseInfo mouse = Greenfoot.getMouseInfo();
                if (seedSelected == 0){
                    getWorld().addObject(new Radish(), mouse.getX(), mouse.getY());
                    
                } else if (seedSelected == 1){
                    getWorld().addObject(new Carrot(), mouse.getX(), mouse.getY());
                } else if (seedSelected == -1){ //use default crop when unset
                    seedSelected = 0;
                    getWorld().addObject(new Radish(), mouse.getX(), mouse.getY());
                }
                
                // use seed
                data.items[seedSelected+2] -= 1;
                data.write();
            }
        }
    }
}
