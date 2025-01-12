import java.util.ArrayList;

public class Library {

    ArrayList<Book> recordsOfBooksInLibrary = new ArrayList<Book>();

    ArrayList<Author> recordsOfAuthorsInLibrary = new ArrayList<Author>();

    Library() {
        System.out.println("default");
    }

    public void addBook(String title, String publicationYear, String authorName) {

        // find author ya create author
        Author author = findOrCreateAuthor(authorName);

        Book newBook = new Book(title, publicationYear, author);

    }

    // create a function to find or create author
    private Author findOrCreateAuthor(String authorName) {
        // it will etheir find the author object in the lib reccord. when it is not able
        // to find it will create a
        // record for the author and will add in the lib record

        // find the author in the record using the author name
        for (Author author : recordsOfAuthorsInLibrary) {
            if (author.name == authorName) {
                return author;
            }
        }

        Author author = new Author(authorName);

        return author;
    }

    class Book {

        String title;
        String publication;
        Author author;

        public Book(String title, String publication, Author author) {
            this.title = title;
            this.publication = publication;
            this.author = author;

        }
    }

    class Author {

        String name;
        ArrayList<Book> booksByAuthor = new ArrayList<Book>();
        // constructor
        Author(String authorName){

        }

    }

}
