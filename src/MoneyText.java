import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MoneyText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoneyText extends Interface
{
    public void act()
    {
        Data data = new Data();
        setImage(new GreenfootImage("" + data.getMoney(), 40, Color.WHITE, new Color(0,0,0,0)));
        if(Greenfoot.mouseClicked(this)) {
            data.addMoney(100);
        }
    }
}