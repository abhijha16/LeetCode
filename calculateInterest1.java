
import java.util.Scanner;

class Account {
    private int id;
    private double balance;
    private double interestRate;

    // Constructor with parameters
    public Account(int id, double balance, double interestRate) {
        this.id = id;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    // Getters
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

public class calculateInterest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int id = scanner.nextInt();
        double balance = scanner.nextDouble();
        double interestRate = scanner.nextDouble();
        int noOfYears = scanner.nextInt();

        // Create Account object
        Account account = new Account(id, balance, interestRate);

        // Calculate interest
        double interestAmount = calculateInterest(account, noOfYears);

        // Display result rounded to three decimal places
        System.out.printf("%.3f\n", interestAmount);
        scanner.close();
    }

    public static double calculateInterest(Account account, int noOfYears) {
        double rate = account.getInterestRate();
        // Calculate additional percentage based on years
        double additionalPercentage = (rate * noOfYears) / 100.0;
        // Calculate final interest rate
        double finalInterestRate = rate + additionalPercentage;
        // Calculate interest amount
        double interestAmount = (account.getBalance() * finalInterestRate) / 100.0;
        return interestAmount;
    }
}

