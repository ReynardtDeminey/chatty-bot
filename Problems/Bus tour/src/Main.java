import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int numBridges = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < numBridges; i++) {
            int bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= height) {
                System.out.println("Will crash on bridge " + (i + 1));
                count++;
                break;
            }
        }

        if (count == 0) {
            System.out.println("Will not crash");
        }


    }
}