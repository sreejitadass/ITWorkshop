import java.util.*;

class Account {
    private int accountNumber;
    private String accountType;
    private String servicebranchIFSC;
    private float minimumBalance;
    private float availableBalance;
    private int customerID;
    private String customerName;
    private static int totalAccountsCreated;

    Account() {
        accountNumber = 0;
        accountType = "";
        servicebranchIFSC = "";
        minimumBalance = 0;
        availableBalance = 0;
        customerID = 0;
        customerName = "";
        totalAccountsCreated = 0;
    }

    void setDetails(int accountNumber, String accountType, String servicebranchIFSC, float minimumBalance,
            float availableBalance, int customerID, String customerName) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.servicebranchIFSC = servicebranchIFSC;
        this.minimumBalance = minimumBalance;
        this.availableBalance = availableBalance;
        this.customerID = customerID;
        this.customerName = customerName;
    }

    void getDetails(int an) {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account type: " + accountType);
        System.out.println("Service branch IFSC: " + servicebranchIFSC);
        System.out.println("Minimum balance: " + minimumBalance);
        System.out.println("Available balance: " + availableBalance);
        System.out.println("Customer ID: " + customerID);
        System.out.println("Customer name: " + customerName);
    }

    void updateDetails(int an) {
        String newAccountType, newServiceBranchIFSC;
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter updated account type: ");
        newAccountType = sc1.nextLine();
        System.out.print("Enter new service branch: ");
        newServiceBranchIFSC = sc1.nextLine();

        accountType = newAccountType;
        servicebranchIFSC = newServiceBranchIFSC;
    }

    float[] getBalance(int an) {
        float balance[] = new float[2];
        balance[0] = minimumBalance;
        balance[1] = availableBalance;

        return balance;
    }

    float deposit(int an, float amt) {
        availableBalance += amt;
        return availableBalance;
    }

    float withdraw(int an, float amt) {
        availableBalance -= amt;
        return availableBalance;
    }

    static int countTotalAccounts() {
        totalAccountsCreated++;
        return totalAccountsCreated;
    }

    int getAccountNumber() {
        return accountNumber;
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter initial number of records: ");
        n = sc.nextInt();

        int an, cID;
        String at, sb, cname;
        float min, av;

        Account accountList[] = new Account[n];
        for (int i = 0; i < n; i++) {
            accountList[i] = new Account();
            System.out.println("\nFor record " + (i + 1) + ": ");
            System.out.print("Enter the account number: ");
            an = sc.nextInt();
            System.out.print("Enter the account type: ");
            at = sc.nextLine();
            sc.nextLine();
            System.out.print("Enter the service branch: ");
            sb = sc.nextLine();
            System.out.print("Enter minimum balance: ");
            min = sc.nextFloat();
            System.out.print("Enter the available balance: ");
            av = sc.nextFloat();
            System.out.print("Enter the customer ID: ");
            cID = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the customer name: ");
            cname = sc.nextLine();

            accountList[i].setDetails(n, at, sb, min, av, cID, cname);
        }

        char ans = 'y';
        int ch;
        while (ans == 'y' || ans == 'Y') {
            System.out.println("\n1.Get details");
            System.out.println("2.Update details");
            System.out.println("3.Get balance");
            System.out.println("4.Deposit");
            System.out.println("5.Withdraw");
            System.out.println("6.Total created accounts");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            int input_an;
            boolean flag = false;
            switch (ch) {
                case 1:
                    System.out.print("\nEnter the account number: ");
                    input_an = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (accountList[i].getAccountNumber() == input_an) {
                            accountList[i].getDetails(input_an);
                            flag = true;
                        }
                    }
                    if (!flag)
                        System.out.println("Account number does not exist");
                    break;

                case 2:
                    System.out.print("\nEnter the account number: ");
                    input_an = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (accountList[i].getAccountNumber() == input_an) {
                            accountList[i].updateDetails(input_an);
                            flag = true;
                        }
                    }
                    if (!flag)
                        System.out.println("Account number does not exist");
                    break;

                case 3:
                    System.out.print("\nEnter the account number: ");
                    input_an = sc.nextInt();
                    float balance[] = new float[2];
                    for (int i = 0; i < n; i++) {
                        if (accountList[i].getAccountNumber() == input_an) {
                            balance = accountList[i].getBalance(input_an);
                            System.out.println("Minimum balance: " + balance[0]);
                            System.out.println("Available balance: " + balance[1]);
                            flag = true;
                        }
                    }
                    if (!flag)
                        System.out.println("Account number does not exist");
                    break;

                case 4:
                    System.out.print("\nEnter the account number: ");
                    input_an = sc.nextInt();
                    System.out.println("Enter amount: ");
                    float amt = sc.nextFloat();
                    for (int i = 0; i < n; i++) {
                        if (accountList[i].getAccountNumber() == input_an) {
                            System.out.println("New balance: " + accountList[i].deposit(input_an, amt));
                            flag = true;
                        }
                    }
                    if (!flag)
                        System.out.println("Account number does not exist");
                    break;

                case 5:
                    System.out.print("\nEnter the account number: ");
                    input_an = sc.nextInt();
                    System.out.println("Enter amount: ");
                    float amt1 = sc.nextFloat();
                    for (int i = 0; i < n; i++) {
                        if (accountList[i].getAccountNumber() == input_an) {
                            System.out.println("New balance: " + accountList[i].withdraw(input_an, amt1));
                            flag = true;
                        }
                    }
                    if (!flag)
                        System.out.println("Account number does not exist");
                    break;

                case 6:
                    int tot_acc = 0;
                    for (int i = 0; i < n; i++) {
                        tot_acc = accountList[i].countTotalAccounts();
                    }
                    System.out.println("Total accounts: " + tot_acc);
                    break;

                default:
                    System.out.println("Invalid");
            }
            System.out.print("\nDo you want to continue? (y/n): ");
            ans = sc.next().charAt(0);
        }
    }
}