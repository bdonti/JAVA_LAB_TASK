
package labtask3;

public class testLibrary {
    public static void main(String[] args) {
        Library L1=new Library("AIUB LIBRARY","KURIL");
        
        Book b1=new Book("Game Of Thrones","George R.R. Martin","1331-22","Action,Adventure,Drama,Fantasy");
        Book b2=new Book("Harry Potter","J.K.Rowling","1215-14","Drama,Fantasy,Family");
        Book b3=new Book("Withcer","Andrzej Sapkowski","215-41","Fantasy");
        
        L1.addBook(b1);
        L1.addBook(b2);
        L1.addBook(b3);
        
        
        L1.showLibInfo();
        
        
    }
        
}   
        
        
        
        
        
    
        
        
 
        
        
        
        
    
   
    
    

