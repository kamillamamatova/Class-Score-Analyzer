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
