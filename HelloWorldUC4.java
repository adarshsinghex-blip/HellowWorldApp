import java.util.Scanner;

public class HelloWorldUC4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.println("Greeting Application");
        System.out.println("----------------------------------------");

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        System.out.println("\nPersonalized Greetings:\n");

        for (int i = 0; i < n; i++) {
            System.out.println("Hello, " + names[i] + ".");
        }

        System.out.println("----------------------------------------");

        sc.close();
    }
}