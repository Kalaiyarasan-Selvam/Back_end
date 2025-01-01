//Create a program to manage a library system using OOP concepts,
// including classes for Book, Member, and Librarian.

package Day_b_two.Additional_challenges;

import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private boolean isIssued;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book \"" + title + "\" has been issued.");
        } else {
            System.out.println("Book \"" + title + "\" is already issued.");
        }
    }

    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book \"" + title + "\" has been returned.");
        } else {
            System.out.println("Book \"" + title + "\" was not issued.");
        }
    }
}

class Member {
    private String name;
    private int memberId;


    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void displayMemberDetails() {
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberId);
    }
}

class Librarian {
    private String name;
    private ArrayList<Book> books;

    public Librarian(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }


    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book \"" + book.getTitle() + "\" has been added to the library.");
    }

    public void removeBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                System.out.println("Book \"" + title + "\" has been removed from the library.");
                return;
            }
        }
        System.out.println("Book \"" + title + "\" not found in the library.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println("- " + book.getTitle() + " by " + book.getAuthor() +
                        (book.isIssued() ? " [Issued]" : " [Available]"));
            }
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Librarian librarian = new Librarian("Alice");

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        librarian.addBook(book1);
        librarian.addBook(book2);

        librarian.displayBooks();

        Member member = new Member("Bob", 101);
        member.displayMemberDetails();

        book1.issueBook();

        book1.issueBook();

        book1.returnBook();

        librarian.displayBooks();
    }
}

