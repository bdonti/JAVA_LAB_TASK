
package beginnerjava;

import java.util.Scanner;

public class AiubGrading {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double marks;
        System.out.print("Enter Marks: ");
        marks= input.nextDouble();
        
        if(marks>=90 && marks<=100){
            System.out.println("A+");
        }
        
        else if(marks>=85 && marks<90){
            System.out.println("A");
        }
        
        else if(marks>=80 && marks<85){
            System.out.println("B+");
        }
        
        else if(marks>=75 && marks<80){
            System.out.println("B");
        }
        
        else if(marks>=70 && marks<75){
            System.out.println("C+");
        }
        
        else if(marks>=65 && marks<70){
            System.out.println("C");
        }
        
        else if(marks>=60 && marks<65){
            System.out.println("D+");
        }
        
        else if(marks>=50 && marks<60){
            System.out.println("D");
        }
        
        else{
            System.out.println("F");
        }
    }
}
