/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author student
 */
public class CounterA implements Runnable{
    boolean running=true;
    String output="";
    public void run(){
        increment();
    }
    public void increment(){
        for(int c=0;c<=10000;c++){
            if (running==true){
                
         output="CounterA: increment()" +c +"\n" +output;  
        System.out.println("CounterA: increment()"+c);
    
        try{
            Thread.sleep(250);
        }
        catch(InterruptedException e){
            System.out.println("Increment Exception"+e);
        }
            }else{
                break;
                }
        }
}
    public void stopIncrement(){
        this.running=false;
    }
    public String getOutput(){
        return output;
    }
}

