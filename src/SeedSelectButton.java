import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SeedSelectButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SeedSelectButton extends Interface
{
    Data data = new Data();

    Text seedSelectText;
    boolean[] seeds = {true, false};
    // 0 - radish
    // 1 - carrot

    int selected = 0;

    public SeedSelectButton(Text text) {
        this.seedSelectText = text;
        
        if(this.data.getSeedSelected() != -1){
            for (int i = 0; i < this.seeds.length; i++) {
                if (i==this.data.getSeedSelected()) {
                    this.seeds[i] = true;
                    this.selected = i;
                } else{
                    this.seeds[i] = false;
                }
            }
            this.updateText();
        } else{
            // set to standard value
            this.data.setSeedSelected(0);
            this.selected = 0;
        }
    }

    public void act()
    {

        if(Greenfoot.mouseClicked(this)){
            // save index where true and set to false
            for (int i = 0; i < this.seeds.length; i++) {
                if(this.seeds[i] == true) {
                    selected = i;
                    this.seeds[i] = false;
                    break;
                }
            }

            try {
                this.selected += 1;
                this.seeds[selected] = true;
            }
            catch(ArrayIndexOutOfBoundsException e) {
                this.seeds[0] = true;
                this.selected = 0;
            }

        }
        
        this.updateText();
        
        this.data.setSeedSelected(selected);
    }

    private void updateText() {
        if(this.seeds[0]) {
            this.seedSelectText.setText("Radish");
        }
        else if(this.seeds[1]) {
            this.seedSelectText.setText("Carrot");
        }
    }
}
