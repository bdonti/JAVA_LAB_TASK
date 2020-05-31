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
public class Customer {
  private String cusname;
  private String cusadd;
  private Account[] listOfAccount;
  
  private int totalNumOfAccount;
  
  public Customer(){}
  
  public Customer(String cn,String cid){
      this.cusname=cn;
      this.cusadd=cid;
      this.listOfAccount=new Account[25];
      
  }
  public void addAccount(Account account,Savings saving){
      
      this.listOfAccount[this.totalNumOfAccount]=account;
      
      this.totalNumOfAccount++;
      
  
  }
      
  public void showAllAccount(){
       
      for (Account listOfAccount1 : listOfAccount) {
          if (listOfAccount1 != null) {
              listOfAccount1.DisplayInfo();
          }
      }
  }
  
  public void printMiniStatement(){
    
    System.out.println("Customer Name:" + this.cusname);
    System.out.println("Customer Address:" + this.cusadd);
  
    }
  
}
