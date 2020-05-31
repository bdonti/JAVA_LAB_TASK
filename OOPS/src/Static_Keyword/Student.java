
package Static_Keyword;

public class Student{
    String name;
    int id;
    static String universityName="AIUB";


Student(String n, int i){
name=n;
id=i;
}

    
void displayInfo(){
    System.out.println("Name: "+name);
    System.out.println("ID: "+id);
    System.out.println("University: "+universityName);
    System.out.println("\n");
}
}