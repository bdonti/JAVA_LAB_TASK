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
public class CounterB extends Thread{
    boolean running=true;
    String output="";
    public void run(){
        increment();
    }
    public void increment(){
        for(int c=10000;c>=0;c--){
            if (running==true){
                
         output="CounterA: decrement()" +c +"\n" +output;  
        System.out.println("CounterA: decrement()"+c);
    
        try{
            Thread.sleep(250);
        }
        catch(InterruptedException e){
            System.out.println("Decrement Exception"+e);
        }
            }else{
                break;
                }
        }
}
    public void stopDecrement(){
        this.running=false;
    }
    public String getOutput(){
        return output;
    }
}
