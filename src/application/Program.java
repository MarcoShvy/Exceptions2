package application;
import model.entites.Account;
import model.exceptions.DomainExceptions;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            Double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.print("Enter amount for withdraw: ");
            Double withdraw = sc.nextDouble();
            account.withdraw(withdraw);
            System.out.printf("New balance: %.2f", account.getBalance());
        }
        catch (DomainExceptions e) {
            System.out.println("Withdraw error: "+ e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpect Error!");
        }
    }
}
