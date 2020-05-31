
package overloading_constructor;

public class Teacher {
    String name,gender;
    int id;
    
    Teacher(){
        System.out.println("No Information");
        
    }
    
     Teacher(String n,String g){
         name=n;
         gender=g;
     }  
    
     Teacher(String n,String g,int i){
         name=n;
         gender=g;
         id=i;
     }

    
     
     void displayInfo(){
    System.out.println("Name: "+name);
    System.out.println("Gender: "+gender);
    System.out.println("ID: "+id);
    System.out.println("\n");
}
     
}
