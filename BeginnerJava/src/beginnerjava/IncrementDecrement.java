
package beginnerjava;

public class IncrementDecrement {
    public static void main(String[] args) {
        int x=25;
        int y;
        
        y=x++; //post increment=25
        System.out.println("y= "+y);
        
        y=x; //value after post increment=26
        System.out.println("y= "+y);
        
        y=++x; //pre increment=27
        System.out.println("y= "+y);
        
        y=x--; //post decrement=27
        System.out.println("y= "+y);
        
        y=x; //value after post decrement=26
        System.out.println("y= "+y);
        
        y=--x; //pre decrement=25
        System.out.println("y= "+y);
    }
}
