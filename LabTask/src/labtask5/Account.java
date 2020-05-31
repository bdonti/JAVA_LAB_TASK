/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtask5;

/**
 *
 * @author RAHID
 */
public class Account {
    protected String accNo="";
    protected double balance=0.0;
    protected String acctype="";
    
    public Account(){
        acctype="Acc";
    }
    
    public Account(String no,double bal){
        acctype="default";
        this.accNo=no;
        this.balance=bal;
    }
    
    public void DisplayInfo(){
        System.out.println("A/C No: "+this.accNo);
        System.out.println("A/C type: "+acctype);
        System.out.println("A/C balance: "+this.balance);
    }
    
    
}
