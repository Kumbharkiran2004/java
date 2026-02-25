import java.util.Scanner; // Import the Scanner class to read input

public class HelloWorld {
    public static void main(String[] args) {
        // Create a Scanner object to read from the console
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Enter your name:");

        // Read user input
        String userName = myObj.nextLine();

        // Check if the name is empty and respond accordingly
        if (userName.trim().isEmpty()) {
            System.out.println("Hello, Stranger!");
        } else {
            System.out.println("Hello, " + userName + "! Welcome to Java.");
        }
        
        myObj.close(); // Good practice to close the scanner
    }
}
