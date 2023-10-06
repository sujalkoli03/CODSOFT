//TASK 3 ATM INTERFACE

import java.util.Scanner;

class Account {
    private double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited amount : " + amount);
        } else {
            System.out.println("Enter valid Amount.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Amount : " + amount);
            return true;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
            return false;
        }
    }
}

class Opertaion {
    private Account account;

    public Opertaion(Account account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println();        
        System.out.println("******** Menu of ATM machine ********");
        System.out.println();
        System.out.println("1. Withdraw Money : ");
        System.out.println("2. Deposit Money : ");
        System.out.println("3. Current Balance : ");
        System.out.println("4. Exit");
        System.out.println();
    }

    public void operate() {
        Scanner sc = new Scanner(System.in);
        double withdrawalAmount;
        double depositAmount;
        double balance;
        int choice; 
        do {
            displayMenu();
            System.out.print("Enter your option: ");
             choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to be withdrawn: ₹");
                    withdrawalAmount = sc.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 2:
                    System.out.print("Enter the amount to be deposited: ₹");
                    depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    
                    balance = account.getBalance();
                    System.out.println("Your current balance is : ₹" + balance);
                    break;
                case 4:
                    System.out.println("Thank you see you again.");
                    sc.close();
                    return;
                default:
                    System.out.println("Wrong choice, Please select valid option.");
            }
        }while (choice!=0);
    }
}


public class ATM{

public static void main(String[] args) {
    System.out.println("************************************-----------------------------****************************************");
    System.out.println("*************************************** Welcome To ATM machine ******************************************");
    System.out.println("************************************-----------------------------****************************************");
    Account NewUser = new Account(5000.0);
    Opertaion ATM_1 = new Opertaion(NewUser);
    ATM_1.operate();
}

}
