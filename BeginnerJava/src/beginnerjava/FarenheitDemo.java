
package beginnerjava;

import java.util.Scanner;

public class FarenheitDemo {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double celcius,Farenheit;
        System.out.print("Enter Temperature: ");
        celcius=input.nextDouble();
        Farenheit= 1.8*celcius+32;
        System.out.println("Enter celcius in Farenheit: "+Farenheit);
        
        
    }
}
