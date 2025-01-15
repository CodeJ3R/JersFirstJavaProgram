/*
 * Name:Jeremy Paruch
 * Student Number: W0222971
 * Date January 13, 2025
 * Instructor: Nadia Gouda
 * Class: PROG 1400 - Introduction to Object-Oriented Programming
 */
// Class created step 2!
public class Book {
    // title String is set to private based on the instructions of the assignment
    private String title;
    // published int is set to private based on the instructions of the assignment
    private int published;
    // author string is set to private based on the instrutions of the assignment
    private String author;

    // These are the getters set up for the main 

    public String getTitle() {
        return this.title;
    }
    public int getPublished() {
        return this.published;
    }
    public String getAuthor() {
        return this.author;
    }

    // These are the setters for the main
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }
    public void setPublished(int newPublished) {
        this.published = newPublished;
    }    
        
    public void setAuthor(String newAuthor){
        this.author = newAuthor;
    }    
}
