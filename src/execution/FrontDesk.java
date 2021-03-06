/*  User: Divyam goel
 *  Date: 30/08/20
 *  Time: 10:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private final static int ISSUE_NEW_BOOK = 1;
    private final static int RETURN_BOOK = 2;
    private final static int SHOW_ALL_BOOKS = 3;
    private final static int EXIT = 4;

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        Student student = new Student("Divyam", 191500272L, 6);
        String bookName;
        int studentInput;
        do {
            System.out.println("-=-=--=-=-" + "\"" + "Welcome to the Front Desk" + "\"" + "-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return the previously issued book for me.");
            System.out.println("3. Show all my issued books.");
            System.out.println("4. Exit.");
            System.out.println("Enter your choice (1..4): ");
            studentInput = scannerObject.nextInt();
            switch (studentInput) {
                case ISSUE_NEW_BOOK:
                    System.out.println("Enter the name of the book you want to issue: ");
                    scannerObject.nextLine();
                    bookName = scannerObject.nextLine();
                    student.issueBook(bookName);
                    break;
                case RETURN_BOOK:
                    System.out.println("Enter the name of the book you want to return: ");
                    scannerObject.nextLine();
                    bookName = scannerObject.nextLine();
                    student.doReturn(bookName);
                    break;
                case SHOW_ALL_BOOKS:
                    student.showAllBooks();
                    break;
                default:
                    break;
            }
        } 
        while (studentInput != EXIT);
        scannerObject.close();
    }
}
