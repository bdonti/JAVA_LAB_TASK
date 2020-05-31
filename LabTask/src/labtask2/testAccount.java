
package labtask2;

public class testAccount {
    public static void main(String[] args) {
        Account a1 = new Account(820,"Standard Chartered Bank","15-454");
        a1.DisplayInfo();
        
        
        Account a2= new Account(650,"UCBL Bank","55-167");
        a2.DisplayInfo();
        
        a1.deposit(670);
        a2.withdrawl(280);
       
        a1.Transfer(210, a2);
        
    }
}
