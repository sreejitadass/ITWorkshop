import java.util.*;

class Book {
    private int bookid;
    private String bookTitle;
    private int yearOfPublication;
    private String authorName;
    private String publisherName;
    private int numberOfAvailableCopies;
    private static int totalCopies;

    Book() {
        bookid = 0;
        bookTitle = "";
        yearOfPublication = 0;
        authorName = "";
        publisherName = "";
        numberOfAvailableCopies = 0;
        totalCopies = 0;
    }

    Book(int totalCopies) {
        totalCopies++;
    }

    public void setDetails(int id, String title, int year, String author, String publisher, int count) {
        bookid = id;
        bookTitle = title;
        yearOfPublication = year;
        authorName = author;
        publisherName = publisher;
        numberOfAvailableCopies = count;
        Book ob = new Book(totalCopies);
    }

    public void getDetails(int id) {
        System.out.println("Book details: ");
        System.out.println("Book id: " + bookid);
        System.out.println("Book title: " + bookTitle);
        System.out.println("Year of publication: " + yearOfPublication);
        System.out.println("Author name: " + authorName);
        System.out.println("Publisher name: " + publisherName);
        System.out.println("Number of available copies: " + numberOfAvailableCopies);
        System.out.println("Total books: " + totalCopies);
    }

    public int issueBook(int id) {
        System.out.println("Name of book issued is: " + bookTitle);
        numberOfAvailableCopies--;
        return numberOfAvailableCopies;
    }

    public int returnBook(int id) {
        System.out.println("Name of book returned is: " + bookTitle);
        numberOfAvailableCopies++;
        return numberOfAvailableCopies;
    }

    public int getBookID() {
        return bookid;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        int id, count, year;
        String title, author, publisher;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of initial records: ");
        int n = sc.nextInt();

        ArrayList<Book> bookList = new ArrayList<Book>();
        for (int i = 0; i < n; i++) {
            Book obj = new Book();
            System.out.println("\nFor record " + (i + 1) + ": ");
            System.out.print("Enter the book ID: ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the book title: ");
            title = sc.nextLine();
            System.out.print("Enter the year: ");
            year = sc.nextInt();
            System.out.print("Enter the author name: ");
            author = sc.nextLine();
            sc.nextLine();
            System.out.print("Enter the publisher name: ");
            publisher = sc.nextLine();
            System.out.print("Enter the number of available copies: ");
            count = sc.nextInt();

            obj.setDetails(id, title, year, author, publisher, count);
            bookList.add(obj);
        }

        char ans = 'Y';
        int ch;
        while (ans == 'Y' || ans == 'y') {
            System.out.println("\n1.Set details");
            System.out.println("2.Get details");
            System.out.println("3.Issue book");
            System.out.println("4.Return book");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    Book obj = new Book();

                    System.out.print("\nEnter the book ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the book title: ");
                    title = sc.nextLine();
                    System.out.print("Enter the year: ");
                    year = sc.nextInt();
                    System.out.print("Enter the author name: ");
                    author = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Enter the publisher name: ");
                    publisher = sc.nextLine();
                    System.out.print("Enter the number of available copies: ");
                    count = sc.nextInt();

                    obj.setDetails(id, title, year, author, publisher, count);
                    bookList.add(obj);
                    break;

                case 2:
                    int ID = 0;
                    boolean flag = false;
                    System.out.print("\nEnter the id: ");
                    ID = sc.nextInt();

                    for (int i = 0; i < bookList.size(); i++) {
                        if (bookList.get(i).getBookID() == ID) {
                            bookList.get(i).getDetails(ID);
                            flag = true;
                            break;
                        }
                    }
                    if (!flag)
                        System.out.println("ID does not exist");
                    break;

                case 3:
                    ID = 0;
                    flag = false;
                    System.out.print("\nEnter the id: ");
                    ID = sc.nextInt();

                    for (int i = 0; i < bookList.size(); i++) {
                        if (bookList.get(i).getBookID() == ID) {
                            int nC = bookList.get(i).issueBook(ID);
                            System.out.println("Number of available copies of the book: " + nC);
                            flag = true;
                            break;
                        }
                    }
                    if (!flag)
                        System.out.println("ID does not exist");
                    break;

                case 4:
                    ID = 0;
                    flag = false;
                    System.out.print("\nEnter the id: ");
                    ID = sc.nextInt();

                    for (int i = 0; i < bookList.size(); i++) {
                        if (bookList.get(i).getBookID() == ID) {
                            int nC = bookList.get(i).returnBook(ID);
                            System.out.println("Number of available copies of the book: " + nC);
                            flag = true;
                            break;
                        }
                    }
                    if (!flag)
                        System.out.println("ID does not exist");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
            sc.nextLine();
            System.out.print("Do you want to continue?(y/n): ");
            ans = sc.nextLine().charAt(0);
        }

        sc.close();
    }
}
