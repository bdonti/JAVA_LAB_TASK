
package labtask2;

public class Book {
   private String bookName;
   private String bookAuthor;
   private String bookId;
   private String bookType;
   private static int bookCopy=0;
   static int count=0;
   
    
    public Book(){
       
       
       
   }
   
   public Book(String n, String a,String i,String t){
       this.bookName=n;
       this.bookAuthor=a;
       this.bookId=i;
       this.bookType=t;
       
       count++; 
      
   }
   
   public void showInfo(){
       System.out.println("***********************");
       System.out.println("Book Name: "+this.bookName);
       System.out.println("Author: "+this.bookAuthor);
       System.out.println("ID: "+this.bookId);
       System.out.println("Type: "+this.bookType);
   }
   
   public void addBookCopy(int x){
       
       Book.bookCopy=this.bookCopy+x;
       
       
   }
   
   public  static  int bookCounter(){
       System.out.print("Current Total Book:");
       return count;
}
   
    public static void showTotalCopy(){
       System.out.println("Total Number of Copies(includes previous object): " +bookCopy);
        System.out.println("***********************");
       System.out.println("\n");
   }
   
    
}

