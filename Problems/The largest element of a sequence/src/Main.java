import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int max = 0;

        while(scanner.hasNext()) {
            int i = scanner.nextInt();
            if (i > max) {
                max = i;
            }
        }

        System.out.println(max);
    }
}