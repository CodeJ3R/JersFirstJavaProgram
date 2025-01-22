/* 
 * Name:Jeremy Paruch
 * Student Number: W0222971
 * Date January 22, 2025
 * Instructor: Nadia Gouda
 * Class: PROG 1400 - Introduction to Object-Oriented Programming
 * Exercise 3: Using Constructors in Java
 */

public class Main{
    public static void main(String[] args) {
        Book myInspiration = new Book();
        Book dmGuide = new Book("Dungeons Master Guide 2024");
        Book playerHandBook = new Book ("Players HandBook", 2014);
        Book myPythonBook = new Book("Python Crash Course",2023,"Eric Matthes");
        Book favBook = new Book("How To Win At Chess",2023,"Levy Rozman",true);

        System.out.println("******** Here is a Display for my  initial values BUT with no arguments**********\n");
        myInspiration.display();

        System.out.println("******** Here is a Display for initial values BUT there's ONE parameters **********\n");
        dmGuide.display();
  
        System.out.println("********Here is a Display for initial values BUT there's TWO parameters **********\n");
        playerHandBook.display();
  
        System.out.println("********Here is a Display for initial values BUT there's THREE parameters **********\n");
        myPythonBook.display();

        System.out.println("********Here is a Display for initial values BUT there's FOUR parameters**********\n");   
        favBook.display();
  
        System.out.println("********Horray! We made it to the end! #Final Fantasy 7 victory music.mp3# **************" );
    


        
    }
}

        /* Code from Exercise 2 
        // This is my favourite book! Also this is the object created for step 3
        Book favBook = new Book();
        //This is the title of the book
        favBook.setTitle("How To Win At Chess");
        // This is the year it was published in!
        favBook.setPublished(2023);
        // This is the author of the book, he's a fantastic chess teacher!
        favBook.setAuthor("Levy Rozman");

        // A getter for...getting the title of the book!
        System.out.println(favBook.getTitle());
        // A getter for...getting the year of the book!
        System.out.println(favBook.getPublished());
        // A getter for...getting the author of the book!
        System.out.println(favBook.getAuthor());
        */


/*    public static void main(String[] args) {
        System.out.println("Hello, World!");*/ 