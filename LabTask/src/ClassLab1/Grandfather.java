/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassLab1;

/**
 *
 * @author RAHID
 */
public class Grandfather {
protected String whoami="";
    protected String name="";
    
    public Grandfather(){
        this.whoami="Grandfather";
    }    
    public Grandfather(String n){
        this.whoami="Grandfather";
         this.name=n;
    }
    public void printInfo(){
    System.out.println("I am a "+this.whoami);
    System.out.println("My name is "+this.name);
        System.out.println("\n");
}
    
}