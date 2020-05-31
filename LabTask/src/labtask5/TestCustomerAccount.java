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
public class TestCustomerAccount {
    public static void main(String[] args) {
        Customer c1=new Customer("Mr.Rahid","Segunbagicha");
        Account a1=new Account("12-33124-56",1000);
        Savings s1=new Savings("12-33124-56",200);
        
     
        
        c1.addAccount(a1,s1);
        c1.printMiniStatement();
        c1.showAllAccount();
        
        
    }
    
}
