import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Money here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoneyIcon extends Interface
{
    int counter = 0;
    int image = 0;
    GreenfootImage[] images = {
            new GreenfootImage("coin_01.png"),
            new GreenfootImage("coin_02.png"),
            new GreenfootImage("coin_03.png"),
            new GreenfootImage("coin_04.png"),
            new GreenfootImage("coin_05.png"),
            new GreenfootImage("coin_06.png"),
            new GreenfootImage("coin_07.png"),
            new GreenfootImage("coin_08.png")
        };
    boolean animation = false;
    public void act()
    {
        if (animation != false) {
            if(this.counter % 10 == 0) {
                this.setImage(this.images[this.image]);
                this.image = this.image+1;
                if (this.image == 8) {
                    this.image = 0;
                }
            }
            this.counter = this.counter+1;
        }
    }
}
