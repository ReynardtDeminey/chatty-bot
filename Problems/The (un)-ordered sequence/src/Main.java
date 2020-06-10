import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int count = 0;

        while (scanner.hasNext()) {
            int j = scanner.nextInt();
            if (i > j) {
               count++;
            }
            i = j;
        }

        if (count == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}