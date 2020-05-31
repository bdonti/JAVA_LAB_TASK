/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counterpackage;

/**
 *
 * @author student
 */
public class MainClass {
    public static void main(String[] args) {
         CounterAFrame frameA=new CounterAFrame();
         frameA.setDefaultCloseOperation(frameA.DISPOSE_ON_CLOSE);
         
         CounterBFrame frameB=new CounterBFrame();
         frameB.setDefaultCloseOperation(frameA.DISPOSE_ON_CLOSE);
         
         frameA.setVisible(true);
         frameB.setVisible(true);

        
    }
   
}
