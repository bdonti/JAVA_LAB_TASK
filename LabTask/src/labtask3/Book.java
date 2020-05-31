
package labtask3;

public class Book {
private String bookName;
   private String bookAuthor;
   private String bookId;
   private String bookType;
   private int bookCopy;
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
       
       System.out.println("Book Name: "+this.bookName);
       System.out.println("Author: "+this.bookAuthor);
       System.out.println("ID: "+this.bookId);
       System.out.println("Type: "+this.bookType);
       
       
   }
   
  public void addBookCopy(int x) {
		if(x <= 0) {
			System.out.println("Negative value not acceptable, try again.");
		}else{
			this.bookCopy = this.bookCopy + x;
			System.out.println(x + " Book added to " + bookName);
			System.out.println("Total book copy : " + bookCopy);
			System.out.println("");
		}
		
	}
   
   public  static  int bookCounter(){
       System.out.print("Current Total Book:");
       return count;
}
   
    public void showTotalCopy(){
       System.out.println("Total Number of Copies(includes previous object): " +bookCopy);
        System.out.println("***********************");
       System.out.println("\n");
   }
   
    
}
    

