import java.util.Scanner;

public class GFG {

    // Function that implements the number guessing game
    public static void guessingNumberGame() {
        // Scanner Class
        Scanner sc = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int number = 1 + (int)(100 * Math.random());

        int trials = 0; // To count the number of trials

        System.out.println("A number is chosen between 1 to 100. Try to guess it!");

        for(;;){
            System.out.println("Guess the number:");
            trials++; // Increment trial count
            int guess = sc.nextInt(); // Take input for guessing

            // Check if the guessed number is correct
            if (guess == number) {
                System.out.println("Congratulations! You guessed the number.");
                System.out.println("Your score: " + (100 - trials)); // Calculate score
                break;
            } else if (guess < number) {
                System.out.println("The number is greater than " + guess);
            } else {
                System.out.println("The number is less than " + guess);
            }
        }
        sc.close(); // Close the Scanner
    }

    // Driver Code
    public static void main(String[] args) {
        guessingNumberGame(); // Call the game function
    }
}
