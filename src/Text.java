import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ui class to simplify displaying text.
 */
public class Text extends Interface
{
    private String text = "";
    private int size = 10;
    public Text(String text, int size){
        this.text = text;
        this.size = size;

    }

    public void act(){
        // set image to text with given parameters
        setImage(new GreenfootImage(this.text, this.size, Color.WHITE, new Color(0,0,0,0)));
    }

    public void setText(String text){
        this.text = text;
    }

    public void setSize(int size){
        this.size = size;
    }
}
