/* 
 * Name:Jeremy Paruch
 * Student Number: W0222971
 * Date January 13, 2025
 * Instructor: Nadia Gouda
 * Class: PROG 1400 - Introduction to Object-Oriented Programming
 */

public class Main{
    public static void main(String[] args) {
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
    }
}




/*    public static void main(String[] args) {
        System.out.println("Hello, World!");*/ 