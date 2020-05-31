
package labtask3;

public class Mobile {
    String mobileOwnerName;
    String mobileNumber;
    double mobileBalance;
    String mobileOSName;
    boolean lock;
    
    public Mobile(){
        
    }
    
    public Mobile(String owname,String mnumber,double mbalance,String OS,boolean l){
        this.mobileOwnerName=owname;
        this.mobileNumber=mnumber;
        this.mobileBalance=mbalance;
        this.mobileOSName=OS;
        this.lock=l;
        
    }
    
    public void displayInfo(){
        System.out.println("Owner Name:"+this.mobileOwnerName);
        System.out.println("Mobile Number:"+this.mobileNumber);
        System.out.println("Mobile Balance: TK."+this.mobileBalance);
        System.out.println("OS:"+this.mobileOSName);
        System.out.println("Is the mobile switched off? "+this.lock);
        
    }
    
    public void recharge(double amount){
        this.mobileBalance=this.mobileBalance+amount;
        System.out.println("Current Balance: TK."+this.mobileBalance);
    }
    
    public void callSomeone(double timeDuration){           // in minutes
        this.mobileBalance=this.mobileBalance-timeDuration*1;
        System.out.println("Balance after calling: TK."+this.mobileBalance);
    }
    
    
}
