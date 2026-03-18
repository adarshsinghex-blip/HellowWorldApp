public class DisplayName {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println(" Please provide your name as a command-line argument.");
            System.out.println("Example: java DisplayName Adarsh");
            return;
        }

        String name = args[0];

        System.out.println("----------------------------------------");
        System.out.println("Welcome to UC2 Greeting Program ");
        System.out.println("----------------------------------------");
        System.out.println("Hello, " + name + "! ");
        System.out.println("Glad to have you here. Keep coding and learning! 🚀");
        System.out.println("----------------------------------------");
    }
}
