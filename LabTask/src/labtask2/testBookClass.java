
package labtask2;

public class testBookClass {
    public static void main(String[] args) {
        Book b1=new Book("Game Of Thrones","George R.R. Martin","1331-22","Action,Adventure,Drama,Fantasy");
        b1.showInfo();
        b1.addBookCopy(10);
        System.out.println(Book.bookCounter());
        Book.showTotalCopy();
        
        Book b2=new Book("Harry Potter","J.K.Rowling","1215-14","Drama,Fantasy,Family");
        b2.showInfo();
        b2.addBookCopy(16);
        System.out.println(Book.bookCounter());
        Book.showTotalCopy();
    }
}
