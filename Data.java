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

    public static int[] items = new int[24];
    // inventory ids
    // 0 - radish
    // 1 - carrot
    // 2 - radish seed
    // 3 - carrot seed

    private static int[] data = {0,-1};
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
            writer.write(this.arrayToString(items));
            writer.close();
            return true;
        } catch (IOException e) {return false;}
    }

    //read data
    public void read(){
        try {
            File file = new File(this.filename);
            Scanner reader = new Scanner(file);
            int i = 0;
            while (i < 3) {
                String tempdata = reader.nextLine();
                if(i<2){
                    this.data[i] = Integer.parseInt(tempdata);
                }
                else if (i==2){
                    this.items = this.stringToArray(tempdata);
                }
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
        this.data[0] += amount;
        this.write();
    }

    public int getSeedSelected(){return this.data[1];}

    public void setSeedSelected(int seed){
        this.data[1] = seed;
        this.write();
    }

    public void addItem(int id, int count) {
        this.items[id] += count;
        this.write();
    }

    private String arrayToString(int[] array){
        String string = "";
        for (int i = 0; i < array.length; i++) {
            string += Integer.toString(array[i])+",";
        }
        return string;
    }

    private int[] stringToArray(String string){
        String[] stringArr = string.split(",");
        int[] intArr = new int[24];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(stringArr[i]);
        }
        return intArr;
    }

}
