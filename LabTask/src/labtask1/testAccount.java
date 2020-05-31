
package labtask1;

public class testAccount {
    public static void main(String[] args) {
        
       Account a1 = new Account(820,"Standard Chartered Bank","15-454");
        a1.DisplayInfo();
        a1.deposit(250);
        
        Account a2= new Account(650,"UCBL Bank","55-167");
        a2.DisplayInfo();
        a2.withdrawl(300);
       
       
        
    
    }
}
