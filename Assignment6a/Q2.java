import java.util.*;

class Account {
    int accountNumber;
    String accountType;
    String serviceBranchIFSC;
    float minimumBalance;
    float availableBalance;
    int customerID;
    String customerName;
    static int totalAccountsCreated;

    Account() {
        accountNumber = 0;
        accountType = "";
        serviceBranchIFSC = "";
        minimumBalance = 0;
        availableBalance = 0;
        customerID = 0;
        customerName = "";
        totalAccountsCreated = 0;
    }

    void setDetails(int an, String at, String sb, float mb, float ab, int cid, String cn) {
        accountNumber = an;
        accountType = at;
        serviceBranchIFSC = sb;
        minimumBalance = mb;
        availableBalance = ab;
        customerID = cid;
        customerName = cn;
    }

    void getDetails(int an) {
        System.out.println("\nDetails: ");
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account type: " + accountType);
        System.out.println("Service branch: " + serviceBranchIFSC);
        System.out.println("Minimum balance: " + minimumBalance);
        System.out.println("Available balance: " + availableBalance);
        System.out.println("Customer ID: " + customerID);
        System.out.println("Customer name: " + customerName);
    }

    void updateDetails(int an) {
        int newAccountNumber, newCustomerID;
        String newAccountType, newServiceBranchIFSC, newCustomerName;
        float newMinimumBalance, newAvailableBalance;

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter updated details: ");
        System.out.print("Enter the new account number: ");
        newAccountNumber = sc1.nextInt();
        System.out.println();
        System.out.print("Enter new account type: ");
        newAccountType = sc1.nextLine();
        System.out.println();
        System.out.print("Enter the new service branch: ");
        newServiceBranchIFSC = sc1.nextLine();
        System.out.print("Enter the new minimum balance: ");
        newMinimumBalance = sc1.nextFloat();
        System.out.print("Enter the new available balance: ");
        newAvailableBalance = sc1.nextFloat();
        System.out.print("Enter the new customer ID: ");
        newCustomerID = sc1.nextInt();
        System.out.print("Enter the new customer name: ");
        newCustomerName = sc1.nextLine();

        accountNumber = newAccountNumber;
        accountType = newAccountType;
        serviceBranchIFSC = newServiceBranchIFSC;
        minimumBalance = newMinimumBalance;
        availableBalance = newAvailableBalance;
        customerID = newCustomerID;
        customerName = newCustomerName;
    }

    float[] getBalance(int an) {
        float balance[] = new float[2];
        balance[0] = minimumBalance;
        balance[1] = availableBalance;

        return balance;
    }

    void deposit(int an, float amt) {
        availableBalance += amt;
        System.out.println("Amount deposited: " + amt);
        System.out.println("New available balance: " + availableBalance);
    }

    void withdraw(int an, float amt) {
        availableBalance -= amt;
        System.out.println("Amount withdrawn: " + amt);
        System.out.println("New available balance: " + availableBalance);
    }

    static int totalAccounts() {
        totalAccountsCreated++;
        return totalAccountsCreated;
    }

    int getAccountNumber() {
        return accountNumber;
    }

}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of objects: ");
        int n = sc.nextInt();
        Account objects[] = new Account[n];
        int i;

        int accnum, cID;
        String acctype, cname, sbIFSC;
        float minB, avB;

        for (i = 0; i < n; i++) {
            objects[i] = new Account();
            System.out.print("Enter the account number: ");
            accnum = sc.nextInt();
            System.out.println();
            System.out.print("Enter account type: ");
            acctype = sc.nextLine();
            System.out.println();
            System.out.print("Enter the service branch: ");
            sbIFSC = sc.nextLine();
            System.out.print("Enter the minimum balance: ");
            minB = sc.nextFloat();
            System.out.print("Enter the available balance: ");
            avB = sc.nextFloat();
            System.out.print("Enter customer ID: ");
            cID = sc.nextInt();
            System.out.print("Enter the customer name: ");
            cname = sc.nextLine();
            objects[i].setDetails(accnum, acctype, sbIFSC, minB, avB, cID, cname);
        }

        int ch;
        char ans = 'y';
        while (ans == 'y' || ans == 'Y') {
            System.out.println("1.Get details");
            System.out.println("2.Update details");
            System.out.println("3.Get balance");
            System.out.println("4.Deposit");
            System.out.println("5.Withdraw");
            System.out.println("6.Total accounts created");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter the required ID: ");
                    int id1 = sc.nextInt();
                    for (i = 0; i < n; i++) {
                        if (objects[i].getAccountNumber() == id1) {
                            objects[i].getDetails(id1);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter the required ID: ");
                    int id2 = sc.nextInt();
                    for (i = 0; i < n; i++) {
                        if (objects[i].getAccountNumber() == id2) {
                            objects[i].updateDetails(id2);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter the required ID: ");
                    int id3 = sc.nextInt();
                    float[] balance = new float[2];
                    for (i = 0; i < n; i++) {
                        if (objects[i].getAccountNumber() == id3) {
                            System.out.println("Minimum balance: " + balance[0]);
                            System.out.println("Available balance: " + balance[1]);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter the required ID: ");
                    int id4 = sc.nextInt();
                    System.out.println("Enter amount to be deposited: ");
                    float amt_d = sc.nextFloat();
                    for (i = 0; i < n; i++) {
                        if (objects[i].getAccountNumber() == id4) {
                            objects[i].deposit(id4, amt_d);
                        }
                    }
                    break;

                case 5:
                    System.out.print("Enter the required ID: ");
                    int id5 = sc.nextInt();
                    System.out.println("Enter amount to be withdrawn: ");
                    float amt_w = sc.nextFloat();
                    for (i = 0; i < n; i++) {
                        if (objects[i].getAccountNumber() == id5) {
                            objects[i].deposit(id5, amt_w);
                        }
                    }
                    break;

                case 6:
                    int tot = 0;
                    for (i = 0; i < n; i++) {
                        tot = objects[i].totalAccounts();
                    }
                    System.out.println("Total number of accounts: " + tot);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
            System.out.print("Do you want to continue? (y/n): ");
            ans = sc.next().charAt(0);
        }

    }
}
