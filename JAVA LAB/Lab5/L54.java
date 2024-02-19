package Lab5;
import java.util.Scanner;

public class L54 {
    public static void main(String[] args) {
        Bank_Account a = new Bank_Account();
        a.getAccountDetails();
        a.displayAccountDetails(); 
    }
}

class Bank_Account {
    int accountNo;
    String userName;
    String email;
    String accountType;
    int accountBalance;

    void getAccountDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your account no.: ");
        accountNo = sc.nextInt();

        System.out.print("Enter your Username: ");
       sc.nextLine();// Consume newline character left by previous nextInt()
        userName = sc.nextLine();

        System.out.print("Enter your email: ");
        email = sc.nextLine();

        System.out.print("Enter your account type: ");
        accountType = sc.nextLine();

        System.out.print("Enter your account balance: ");
        accountBalance = sc.nextInt();
    }

    void displayAccountDetails() { 
        System.out.println("Account No.: " + accountNo);
        System.out.println("Username: " + userName);
        System.out.println("Email: " + email);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBalance);
    }
}
