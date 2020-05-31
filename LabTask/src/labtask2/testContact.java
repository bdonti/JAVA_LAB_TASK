
package labtask2;


public class testContact {
    public static void main(String[] args) {
         
        Contact Rahid=new Contact("Rahid","33107",22,"01797775766","M");
        Rahid.DisplayInfo();
        Rahid.DetectMobileOperator();
        
        Contact Ammu=new Contact("Selina Banu","22143",56,"01537758911","F");
        Ammu.DisplayInfo();
        Ammu.DetectMobileOperator();
    }
}
