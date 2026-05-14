import java.util.*;

class Customer {
    int accno;
    String name;
    int balance;

    Customer(int accno, String name, int balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }

    void showInfo() {
        System.out.println("Acc No: " + accno);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New balance: " + balance);
    }

    void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("New balance: " + balance);
    }
}

public class L4Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter accno, name, balance: ");
        Customer c = new Customer(sc.nextInt(), sc.next(), sc.nextInt());
        c.showInfo();
        System.out.print("Deposit amount: ");
        c.deposit(sc.nextInt());
        System.out.print("Withdraw amount: ");
        c.withdraw(sc.nextInt());
        sc.close();
    }
}
