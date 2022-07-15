import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int counter = 0;
            int summ = 0;

            while (counter < 10) {
                System.out.println("Enter number #" + (counter + 1) + ":");
                boolean hasNextInt = scanner.hasNextInt();

                if (hasNextInt) {
                    int numberEntered = scanner.nextInt();
                    scanner.nextLine();
                    summ += numberEntered;
                    counter++;
                    System.out.println();
                } else {
                    System.out.println("Invalid number.");
                    scanner.nextLine();
                }

            }
            System.out.println("The summ equals " + summ);
            scanner.close();

        }
}
