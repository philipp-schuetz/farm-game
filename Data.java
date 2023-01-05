import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;

import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;

/**
 * Write a description of class Data here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Data extends Actor
{
    String filename = "save.txt";

    public int[] data = {-1,-1};
    // money, seedSelected

    // creates save file if one does not exist
    public Data(){
        try {
            File file = new File(this.filename);
            //read file if alredy exists
            if (!file.createNewFile()) {
                this.read();
            }
        } catch(IOException e){}
        this.write();
    }

    //write data to files, return true if successful
    public boolean write(){
        try {
            FileWriter writer = new FileWriter(this.filename);
            writer.write(Integer.toString(this.data[0]) + "\n");
            writer.write(Integer.toString(this.data[1]) + "\n");
            writer.close();
            return true;
        } catch (IOException e) {return false;}
    }

    //read and save data
    public void read(){
        try {
            File file = new File(this.filename);
            Scanner reader = new Scanner(file);
            int i = 0;
            while (i < this.data.length) {
                String tempdata = reader.nextLine();
                this.data[i] = Integer.parseInt(tempdata);
                i += 1;
            }
            reader.close();
        } catch (FileNotFoundException e) {}
    }

    public int getMoney(){return this.data[0];}

    public void setMoney(int amount){
        this.data[0] = amount;
        this.write();
    }
    
        public void addMoney(int amount){
        if (this.data[0] == -1) {this.data[0] = 0;}
        this.data[0] += amount;
        this.write();
    }

    public int getSeedSelected(){return this.data[1];}

    public void setSeedSelected(int seed){
        this.data[1] = seed;
        this.write();
    }
}
