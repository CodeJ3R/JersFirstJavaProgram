/*
 * Name:Jeremy Paruch
 * Student Number: W0222971
 * Date January 22, 2025
 * Instructor: Nadia Gouda
 * Class: PROG 1400 - Introduction to Object-Oriented Programming
 * Exercise 3: Using Constructors in Java
 */
// Class created from Exercise 2 step 2!
public class Book {
    // title String is set to private based on the instructions of the assignment
    private String title;
    // published int is set to private based on the instructions of the assignment
    private int published;
    // author string is set to private based on the instrutions of the assignment
    private String author;
    // A boolean variable to show if I own the book. It's set to false first to show which books I dont own
    private boolean owned=false;

    // These are the getters set up for the main 

    public String getTitle() {
        return title;
    }
    public int getPublished() {
        return published;
    }
    public String getAuthor() {
        return author;
    }
    public Boolean getOwned(){
        return owned;
    }

    // These are the setters for the main
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPublished(int published) {
        this.published = published;
    }    
        
    public void setAuthor(String author){
        this.author = author;
    }
    public void setOwned(Boolean owned){
        this.owned = owned;
    }

    // A constructor but with no arguments aka the default state!
     public Book () {
     this.title = "There's No Author listed";
     this.published = 0;
     this.author = "I can't find an author...";
     this.owned = owned;
     }

     // Method Overloading!

     // Method with ONE Parameter!
     public Book (String t){
     this.title = t;
     this.published = 0;
     this.author ="I cant find an author";
     this.owned = owned;
     } 
      // Method with TWO Parameters!
     public Book (String t, int p){
        this.title = t;
        this.published =p;
        this.author ="I cant find an author";
        this.owned = owned;
     }
     // Method with THREE Parameters!
     public Book (String t, int p, String a){
        this.title = t;
        this.published =p;
        this.author = a;
        this.owned = owned;
    } 
     // Method with FOUR Parameters!    
    public Book (String t, int p, String a, boolean o ){
        this.title = t;
        this.published =p;
        this.author = a;
        this.owned = !owned;
    }
        // Display method for the parameters
        public void display() {
        System.out.println(" The Title of this Book is : "  + this.title);
        System.out.println(" The year published is in: "  + this.published);
        System.out.println(" The Author for this book is: "  + this.author );
        System.out.println(" DO I own this book? "  + this.owned  );
    }
}    
    

















