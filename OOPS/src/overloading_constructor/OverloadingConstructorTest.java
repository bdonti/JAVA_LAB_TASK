
package overloading_constructor;

public class OverloadingConstructorTest {
    public static void main(String[] args) {
        Teacher teacher1=new Teacher();
        
        Teacher teacher2=new Teacher("Kamruddin","Male");
        teacher2.displayInfo();
        
        Teacher teacher3=new Teacher("Juena","Female",1733);
        teacher3.displayInfo();
    }
}
