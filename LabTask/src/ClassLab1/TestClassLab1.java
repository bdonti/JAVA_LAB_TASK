/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassLab1;

/**
 *
 * @author RAHID
 */
public class TestClassLab1 {
    
public static void main(String[] args) {
        Grandfather g1=new Grandfather("Grandfather");
        g1.printInfo();
        Parent p1=new Parent("Parent");
        Child c1=new Child("Child");
        p1.printInfo();
        c1.printInfo();
    }
}