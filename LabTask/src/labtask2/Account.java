package labtask2;
public class Account {
    private String accName;
    private String acid;
    private int balance;
    
    public Account(){
        System.out.println("Account is unavaliable");
        System.out.print("\n");
    }
    
    public Account(int a, String n,String i){
        this.balance=a;
        this.accName=n;
        this.acid=i;
    }
    
    public void DisplayInfo(){
        System.out.println("*************************");
        System.out.println("A/C Name: "+this.accName);
        System.out.println("A/C Balance: TK."+this.balance);
        System.out.println("A/C Id: "+this.acid);
         System.out.println("*************************");
        System.out.println("\n");
    }
    public void deposit(int amount){
        
        System.out.println("*************************");
        System.out.println("A/C Balance before : TK."+balance);
        balance=balance+amount;
        System.out.println("A/C Balance after: TK."+balance);
        System.out.println("A/C Name: "+this.accName);
        System.out.println("A/C Balance: TK."+this.balance);
        System.out.println("A/C Id: "+this.acid);
        
        System.out.println("*************************");
        System.out.println("\n");
    }
    
   public void withdrawl(int amount){
        
        System.out.println("A/C Balance before : TK."+balance);
        balance=balance-amount;
        System.out.println("Balance after: TK."+balance);
        System.out.println("A/C Name: "+this.accName);
        System.out.println("A/C Balance: TK."+this.balance);
        System.out.println("A/C Id: "+this.acid);
        System.out.println("*************************");
        System.out.println("\n");
    }
    
    
    public void Transfer(int amount,Account a){
        
    
     a.deposit(amount);
     System.out.println("*************************");
     System.out.println("A/C Balance before: TK."+balance);
     balance=balance-amount;
     System.out.println("A/C Balance after: TK."+balance);
     System.out.println("A/C Name: "+accName);
     System.out.println("A/C ID: "+acid);
     System.out.println("*************************");
     System.out.println("\n");
     
    }
    
}
