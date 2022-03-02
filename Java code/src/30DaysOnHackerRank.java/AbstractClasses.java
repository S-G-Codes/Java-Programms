import java.util.Scanner;

abstract class Book{
    String title;
     String author;
   
     Book(String title, String author){
         this.title = title;
         this.author = author;

     }
     abstract void display();
}
class MyBook extends Book{
    int price;

    MyBook(String title, String author, int price){
        super(title, author);
        this.price = price;
    }
    void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}





public class AbstractClasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();
        sc.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
