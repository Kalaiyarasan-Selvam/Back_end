//Create a class Book with default values for title and
// author. Write a default constructor to initialize these attributes.

package Day_b_two.constructors;

class Book {
    // Attributes
    private String title;
    private String author;

    // Default constructor
    public Book() {
        // Assigning default values
        this.title = "Unknown Title";
        this.author = "Unknown Author";
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Display method
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating a Book object using the default constructor
        Book book = new Book();
        // Displaying the details
        book.displayDetails();
    }
}

