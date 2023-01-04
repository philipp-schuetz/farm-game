import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MoneyText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoneyText extends Interface
{
    Farm farmWorld;
    
    public MoneyText(Farm farmWorld) {
        this.farmWorld = farmWorld;
    }
    
    public void act()
    {
        setImage(new GreenfootImage("" + this.farmWorld.getMoney(), 40, Color.WHITE, new Color(0,0,0,0)));
        if(Greenfoot.mouseClicked(this)) {
            this.farmWorld.addMoney(10);
        }
    }
}
