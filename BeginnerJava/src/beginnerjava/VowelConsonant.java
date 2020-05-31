
package beginnerjava;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch;
        System.out.print("Enter any character: ");
        ch= input.next().charAt(0); //0th index character
        
        if(ch=='a'){
            System.out.println("Vowel");
        }
        else if(ch=='e'){
            System.out.println("Vowel");
        }    
        
        else{
            System.out.println("Consonant");
        }
    }
}
