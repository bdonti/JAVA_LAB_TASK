
package labtask1;
 public class Triangle {
    private int x;
    private int y;
    private int z;
    
    public Triangle(){
        
    }
    
    public Triangle(int a,int b,int c){
        this.x=a;
        this.y=b;
        this.z=c;
    }
    
    public void displayInfo(){
        if(x==y && y==z){
            System.out.println("EQUILATERAL TRIANGLE");
            
        }
       
         else if ((x==y && y!=z ) || (z==x && x!=y) || (z==y && z!=x)){
            System.out.println("ISOSCLES TRIANGLE");
         }
        
        else if(x!=y && y!=z && z!=x){
            System.out.println("SCALENE TRIANGLE");
        }
    }
}
