
package labtask1;

public class testStudent {
    public static void main(String[] args) {
      Student s1=new Student(null,null,null,null);
      
      s1.displayInfo();
      s1.setName("SM RAHID HAQUE");
      System.out.print("NAME:");
      System.out.println(s1.getName());
      
      
      s1.setID("17-33107-1");
      System.out.print("ID:");
      System.out.println(s1.getID());
      
      s1.setDept("CSE");
      System.out.print("DEPARTMENT:");
      System.out.println(s1.getDept());
      
      s1.setCGPA(3.61);
      System.out.print("CGPA:");
      System.out.println(s1.getCGPA());
             
      
        
        
    
    }
    
}
