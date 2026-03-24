public class HellowWorldAppUC3 {
    public static void main(String[] args) {

        String name;

        if (args.length == 0) {
            name = "Adarsh";
        } else {
            name = args[0];
        }

        System.out.println("----------------------------------------");
        System.out.println("Greeting Application - UC3");
        System.out.println("----------------------------------------");

        System.out.println("Hello, " + name + ", Greetings.");


    }
}