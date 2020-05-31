
package labtask3;

public class TestMobile {
    public static void main(String[] args) {
        Mobile m1=new Mobile("Rahid","01797775766",50,"Android",false);
        m1.displayInfo();
        m1.recharge(25);
        m1.callSomeone(1.5);  //in minutes
        
    }
    
    
}
