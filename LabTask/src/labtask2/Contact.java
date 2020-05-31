
package labtask2;



public class Contact {
   
    
    private String personName;
    private String personid;
    private int age;
    private  String mobileNumber;
    private String gender;
    
     public Contact(String n,String i,int a,String num, String g){
        
        this.personName=n;
        this.personid=i;
        this.age=a;
        
        this.mobileNumber=num;
        
        this.gender=g;       
    }
    
    public Contact(){
       
        
    }
    
    
    
    
    public void DisplayInfo(){
        System.out.println("****************************");
        System.out.println("Name: "+this.personName);
        System.out.println("Age: "+this.age);
        System.out.println("ID: "+this.personid);
        System.out.println("Number: "+this.mobileNumber);
        System.out.println("Gender: "+this.gender);
        
    }
    
    
    
   public void DetectMobileOperator()
        {
           if (this.mobileNumber.charAt(2)=='7'){
               System.out.println("He/she is using GP");
           }
           else if(this.mobileNumber.charAt(2)=='5')
          {
               System.out.println("He/she is using Robi");
           }
           else if(this.mobileNumber.charAt(2)=='9'){
               System.out.println("He/she is using Banglalink");
           }
           else{
               System.out.println("Invalid Operator");
           }
           System.out.println("****************************");
            System.out.println("\n");
         
}
}




