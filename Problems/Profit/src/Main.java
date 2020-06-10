import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        double amount =  scanner.nextInt();
        double interest = scanner.nextInt();
        double target = scanner.nextInt();
        int years = 0;

        while (amount < target) {
            amount = amount + (amount * interest/100);
            years++;
        }

        System.out.print(years);
    }
}