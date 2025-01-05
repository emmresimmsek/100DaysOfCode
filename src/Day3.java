import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {


        // 1. Write a program that reads user input and print it to the console.
        // 2. Modify the program to read and print different data type inputs (integers, floating-point numbers, strings)
        // 3. Write a program to read the user input using Scanner class

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);


        // Prompt the user for input
        System.out.print("Please enter something: ");

        // Read the input from the user
        String userInput = scanner.nextLine();

        // Print the input to the console
        System.out.println("You entered: "  + userInput)  ;


        // ------------------------

        // Read and print an integer
        System.out.println("Please and print in integer");
        int intInput = scanner.nextInt();
        System.out.println("you entered an integer: " + intInput);


        // Close the scanner
        scanner.close();




    }
}
