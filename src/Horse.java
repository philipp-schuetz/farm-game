import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Horse class adds functionality
 */
public class Horse extends Animal
{
    public void act()
    {
        if(Greenfoot.mouseClicked(this)) {
            // feed a carrot to a horse
            this.feedHorse();
        }
    }

    // code executed when feeding horse
    private void feedHorse(){
        Data data = new Data();
        if (data.items[1] > 0){
            // remove one carrot from inventory for feeding
            data.items[1] -= 1;
            data.write();

            Carrot carrot = new Carrot();
            getWorld().addObject(carrot, 25, 2);
            
            Greenfoot.delay(80);
            getWorld().removeObject(carrot);
            
            // turn horse on feeding
            this.turn(20);
            Greenfoot.delay(20);
            this.turn(-20);
        }
    }
}
