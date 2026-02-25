import java.util.Scanner;

public class NameGreeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";

        System.out.println("--- Welcome to the Infinite Greeter ---");
        System.out.println("(Type 'exit' to stop the program)");

        // This loop runs as long as the user doesn't type "exit"
        while (!name.equalsIgnoreCase("exit")) {
            System.out.print("\nPlease enter a name: ");
            name = input.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye! Closing program...");
            } else if (name.trim().isEmpty()) {
                System.out.println("You didn't type anything! Try again.");
            } else {
                System.out.println("Hello, " + name + "! Hope you're having a great day.");
            }
        }

        input.close();
    }
}
