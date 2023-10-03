import java.util.*;

class Book {
    private int bookId;
    private String bookTitle;
    private int yearOfPublication;
    private String authorName;
    private String publisherName;
    private int numberOfAvailableCopies;
    private static int totalCopies;

    Book() {
        bookId = 0;
        bookTitle = "";
        yearOfPublication = 0;
        authorName = "";
        publisherName = "";
        numberOfAvailableCopies = 0;
        totalCopies = 0;
    }

    void setDetails(int bId, String bTitle, int y, String aName, String pName, int avCopies) {
        bookId = bId;
        bookTitle = bTitle;
        yearOfPublication = y;
        authorName = aName;
        publisherName = pName;
        numberOfAvailableCopies = avCopies;
        totalCopies++;
    }

    void getDetails(int id) {
        System.out.println("\nBook id: " + bookId);
        System.out.println("Book title: " + bookTitle);
        System.out.println("Year of publication: " + yearOfPublication);
        System.out.println("Author name: " + authorName);
        System.out.println("Publisher name: " + publisherName);
        System.out.println("Number of available copies: " + numberOfAvailableCopies);
    }

    void issueBook(int id) {
        numberOfAvailableCopies--;
        System.out.println("Book issued: " + bookTitle);
        System.out.println("Current number of available copies: " + numberOfAvailableCopies);
    }

    void returnBook(int id) {
        numberOfAvailableCopies++;
        System.out.println("Book returned: " + bookTitle);
        System.out.println("Current number of available copies: " + numberOfAvailableCopies);
    }

    int findTotalCopies() {
        return totalCopies++;
    }

    int getBookId() {
        return bookId;
    }
}

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of initial records: ");
        n = sc.nextInt();

        int bId, y, avCopies;
        String bTitle, aName, pName;
        ArrayList<Book> bookList = new ArrayList<Book>();

        for (int i = 0; i < n; i++) {
            Book obj = new Book();
            System.out.println("");
            System.out.print("Enter the book id: ");
            bId = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the book title: ");
            bTitle = sc.nextLine();
            sc.nextLine();
            System.out.print("Enter the year of publication: ");
            y = sc.nextInt();
            System.out.print("Enter the author name: ");
            aName = sc.nextLine();
            sc.nextLine();
            System.out.print("Enter the publisher name: ");
            pName = sc.nextLine();
            System.out.print("Enter the number of available copies: ");
            avCopies = sc.nextInt();

            obj.setDetails(bId, bTitle, y, aName, pName, avCopies);
            bookList.add(obj);
        }

        int ch;
        char ans = 'y';
        while (ans == 'y' || ans == 'Y') {
            System.out.println("\n1.Set details");
            System.out.println("2.Get details");
            System.out.println("3.Issue book");
            System.out.println("4.Return book");
            System.out.println("5.Total copies");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            int id;
            boolean flag = false;

            switch (ch) {
                case 1:
                    Book object = new Book();

                    System.out.print("\nEnter the id: ");
                    bId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the book title: ");
                    bTitle = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Enter the year of publication: ");
                    y = sc.nextInt();
                    System.out.print("Enter the author name: ");
                    aName = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Enter the publisher name: ");
                    pName = sc.nextLine();
                    System.out.print("Enter the number of available copies: ");
                    avCopies = sc.nextInt();

                    object.setDetails(bId, bTitle, y, aName, pName, avCopies);
                    bookList.add(object);
                    break;

                case 2:
                    System.out.print("\nEnter the id: ");
                    id = sc.nextInt();

                    for (int i = 0; i < bookList.size(); i++) {
                        if (bookList.get(i).getBookId() == id) {
                            bookList.get(i).getDetails(id);
                            flag = true;
                        }
                    }
                    if (!flag)
                        System.out.println("ID not found");
                    break;

                case 3:
                    flag = false;
                    System.out.print("\nEnter the id: ");
                    id = sc.nextInt();

                    for (int i = 0; i < bookList.size(); i++) {
                        if (bookList.get(i).getBookId() == id) {
                            bookList.get(i).issueBook(id);
                            flag = true;
                        }
                    }
                    if (!flag)
                        System.out.println("ID not found");
                    break;

                case 4:
                    flag = false;
                    System.out.print("\nEnter the id: ");
                    id = sc.nextInt();

                    for (int i = 0; i < bookList.size(); i++) {
                        if (bookList.get(i).getBookId() == id) {
                            bookList.get(i).returnBook(id);
                            flag = true;
                        }
                    }
                    if (!flag)
                        System.out.println("ID not found");
                    break;

                case 5:
                    int tc = 0;
                    for (int i = 0; i < bookList.size(); i++) {
                        tc = bookList.get(i).findTotalCopies();
                    }
                    System.out.println("Total number of books are: " + tc);
                    break;

                default:
                    System.out.println("Invalid case");
            }
            System.out.print("\nDo you want to continue? ");
            ans = sc.next().charAt(0);
        }
        sc.close();
    }
}