import java.util.Scanner;

public class HelloWorldAppUC5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("Greeting Application - UC5");
        System.out.println("========================================");

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n <= 0) {
            System.out.println("Hello, World.");
        } else {
            String[] names = new String[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter name " + (i + 1) + ":");
                names[i] = sc.nextLine();
            }

            System.out.println("\nSending greetings to:\n");

            int count = 1;
            for (String name : names) {
                System.out.println(count + ". Hello, " + name + ".");
                count++;
            }
        }

        System.out.println("========================================");

        sc.close();
    }
}