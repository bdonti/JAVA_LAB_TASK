
package labtask2;

public class Rectangle {
    private int a;
    private int b;
    private int c;
    private int d;
    
    public Rectangle(){
        
    }
    
    public Rectangle(int w,int x,int y,int z){
        this.a=w;
        this.b=x;
        this.c=y;
        this.d=z;
    }
    
    public void DisplayInfo(){
        if(a==c && b==d){
            System.out.println("RECTANGLE PROVED AS OPPOSITES SIDES ARE EQUAL");
        }
        else{
            System.out.println("Not a rectangle");
        }
    }
}
