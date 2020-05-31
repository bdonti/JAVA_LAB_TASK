
package labtask3;

public class Library {
    
    private String libName;
    private String libAddress;
    Book[] listOfBook;  
     int totalBook;
    
     int maxNumOfBook=10000;
     
    
    public Library()
    {
        
    }
    
    public Library(String name,String address)        
    {
        this.libName=name;
        this.libAddress=address;
        this.totalBook=0;
        this.listOfBook =new Book[maxNumOfBook];
        
        
    }
    
    public void showLibInfo()
    {
        
        System.out.println("Name:"+ this.libName);
        System.out.println("Address:" + this.libAddress);
        
        
        System.out.println("Current Total Avaliable Books: " + this.totalBook);
        
        for(int i=0;i<this.totalBook;i++)
        {
           this.listOfBook[i].showInfo();
        }
        
        
        System.out.println("\n");
        
    }
public void addBook(Book book) {

    this.listOfBook[this.totalBook]=book;
    this.totalBook++;
    
}

public void deleteBook(Book book){
   this.listOfBook[this.totalBook-1]=book;
   this.totalBook--;
   
}

public void addNewCopy(Book book,int copy){
    
    this.totalBook=this.totalBook+copy;
    System.out.println(copy + " Book added to " + book);
			System.out.println("Total book copy : " + copy);
			System.out.println("");
}
}


















