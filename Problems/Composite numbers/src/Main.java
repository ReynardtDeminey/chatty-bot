import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        // write your code here
        for (int i = 1; i < 10; i++) {
            if (number % i == 0 && number != i && i != 1) {
                return true;
            }
        }
        return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}