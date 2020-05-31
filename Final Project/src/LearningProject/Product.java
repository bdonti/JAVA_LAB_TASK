/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearningProject;

/**
 *
 * @author RAHID
 */
public class Product {
    private int id;
    private String name;
    private float price;
    private String addDate;
    private byte[] picture;
    
    public Product(int pID,String pName,float pPrice,String pAddDate,byte[] pimg){
        this.id=pID;
        this.name=pName;
        this.price=pPrice;
        this.addDate=pAddDate;
        this.picture=pimg;
    }
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public float getPrice(){
        return price;
    }
    public String getAddDate(){
        return addDate;
    }
    public byte[] getImage(){
        return picture;
    }
}
