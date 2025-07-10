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

        System.out.println("");

        // Loop until user enter -1
        while(score != -1){
            System.out.print("Enter Score (Enter -1 to Stop): ");
            score = myScanner.nextInt();

            // Increase the sum and the score counter for all valid scores
            if(score != -1 && score <= 100 && score >= 0) {
                scoreCount++;
                sum += score;
            }

            // Passing scores (70 or above)
            if(score >= 70 && score <= 100){
               passCount++;
            }

             // If user entered score is more than 100 or less than 0, output that the score was rejected
            if(score > 100 || score < 0){
                System.out.println("Score " + score + " Rejected");
            }

             if(score >= 90 && score <= 100){
                 gradeA++;
            }
            else if(score >= 80 && score < 90){
                gradeB++;
            }
