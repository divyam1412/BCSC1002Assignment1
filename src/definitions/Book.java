/*  User: Divyam goel
 *  Date: 30/08/20
 *  Time: 10:30
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String bookAuthor;
    private String bookIsbnNumber;

    public Book() {
        this.bookName = "Mathematics";
        this.bookAuthor = "R.D Sharma";
        this.bookIsbnNumber = "1234567000000";
    }

    public Book(String bookName) {
        this.bookName = bookName;
        this.bookAuthor = "William Shakespeare";
        this.bookIsbnNumber = "1234512349876";
    }

    public Book(String bookName, String bookAuthor, String bookIsbnNumber) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookIsbnNumber = bookIsbnNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookIsbnNumber() {
        return bookIsbnNumber;
    }

    public void setBookIsbnNumber(String bookIsbnNumber) {
        this.bookIsbnNumber = bookIsbnNumber;
    }

    /**
     * This method allows the student to issue a book.
     */
    public void issueBook() {
        System.out.println("Thank you for issuing.");
    }

    /**
     * This method allows the student to return a previously issued book.
     */
    public void doReturn() {
        System.out.println("Thank You for returning.");
    }

    @Override
    public String toString() {
        return String.format("Book name: %s, Book Author: %s, ISBN number of Book: %s",
                getBookName(), getBookAuthor(), getBookIsbnNumber());
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * @param o the reference object with which to compare.
     * @return {@code true} if this object is the same as the obj
     * argument; {@code false} otherwise.
     */
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getBookAuthor(), book.getBookAuthor()) &&
                Objects.equals(getBookIsbnNumber(), book.getBookIsbnNumber());
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return a hash code value for this object.
     */

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getBookAuthor(), getBookIsbnNumber());
    }
}
