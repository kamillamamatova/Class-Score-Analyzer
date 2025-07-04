import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String input;

        // Calls the method that processes class scores
        processClassScores(myScanner);

        // Asks the user if they want to process another class
        System.out.print("\nWould you like to process another class? (Y or N): ");
        input = myScanner.next();

        // Repeat until user says "n" or "N"
        while (input.equalsIgnoreCase("Y")) {
            processClassScores(myScanner);

            // Ask the user if they want to process another class
            System.out.print("\nWould you like to process another class? (Y or N): ");
            input = myScanner.next();
        }

        System.out.println("Goodbye!");

        // Close the scanner
        myScanner.close();
    }

    // This method processes the class scores
    public static void processClassScores(Scanner myScanner){
        System.out.println("Welcome to my program. You will be asked to enter the scores of a test one by one, and to enter -1 to stop.");

        int score = 0;

        // How many scores there are
        int scoreCount = 0;

        // How many score that passed there are (>= 70)
        int passCount = 0;

        // Sum of all scores
        int sum = 0;

        // Counter for each grade letter
        int gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0, gradeF = 0;
