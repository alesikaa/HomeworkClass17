package HomeworkClass17;

public class Book {
    /*Write Book class that will have instance variables and 2 Constructors.
       While creating an object make sure:
       Instance variables are being initialized
       Both Constructors are being executed  */
     String title;
    String author;

     Book(String title, String author) {
        this.title = title;
        this.author = author;
        System.out.println("Upgrade your Brain");
    }

    public Book(String title) {
        this(title, "Jim Kwik");
        System.out.println("Learn everything faster");
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        Book book = new Book("Limitless");
        book.displayInfo();
    }
}
