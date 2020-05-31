
package datatype;

public class DataType {

   
    public static void main(String[] args) {
       boolean b=true; //dynamic initialization
       char c;
       short s=32677;
       int i=256;
       float f=0.5f; //Must be intialized with f for float
       double d=20.86;
       
       System.out.println(b);
       System.out.println("b = "+b); //Rules for writing boolean 
       
       c='a';             //Normal intilization
       System.out.println(c);
       System.out.println("c = "+c); //Rules for writing  character
       
       System.out.println(s);
       System.out.println("s= "+s); //Rules for writing short
       
       System.out.println(i);
       System.out.println("i= "+i); //Rules for writing integer
       
       System.out.println(f);
       System.out.println("f= "+f); //Rules for writing float
       
       System.out.println(d);
       System.out.println("d= "+d); //Rules for writing double
       
       //use of format specifier
       
       System.out.printf("Boolean b=%b\n",b);
       System.out.printf("Character c=%c\n",c);
       System.out.printf("Integer i=%d\n",i);
       System.out.printf("Float f=%.1f\n",f);
       System.out.printf("Double d=%.3f\n",d);
       
    }
    
}
