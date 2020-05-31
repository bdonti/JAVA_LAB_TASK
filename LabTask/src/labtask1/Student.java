
package labtask1;

public class Student {
    private String name;
    private String id;
    private String dept;
    private Double cgpa;
    
    Student(){
        System.out.println("Info not showing");
    }
    
    Student(String n, String i, String d, Double cg){
        this.name=n;
        this.id=i;
        this.dept=d;
        this.cgpa=cg;
    }
    
    public void setName(String a){
        this.name=a;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setID(String b){
        this.id=b;
    }
    
    public String getID(){
        return this.id;
    }
    
    public void setDept(String c){
        this.dept=c;
    }
    
    public String getDept(){
        return this.dept;
    }
    
    public void setCGPA(Double d){
        this.cgpa=d;
    }
    
    public Double getCGPA(){
        return this.cgpa;
    }
    
    public void displayInfo(){
        System.out.println("Name: "+this.name);  
        System.out.println("ID: "+this.id);  
        System.out.println("Department: "+this.dept);  
        System.out.println("CGPA: "+this.cgpa);  
        
    }

   

   
}
