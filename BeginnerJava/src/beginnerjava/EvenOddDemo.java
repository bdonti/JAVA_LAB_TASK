
package beginnerjava;

import java.util.Scanner;

public class EvenOddDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.print("Enter any positive integer: ");
        num= input.nextInt();
        
        if(num%2==0){
            System.out.println("EVEN");
        }
        
        else{
            System.out.println("ODD");
        }
        
    }
}
