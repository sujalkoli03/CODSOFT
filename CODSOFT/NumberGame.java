import java.util.Random;
import java.util.Scanner;

public class NumberGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int startnum = 1;
        int endnum = 100;
        int Total_Attempts = 3;
        int score = 0;
        int Target;
        int attempts = 0;
        System.out.println();

        System.out.println("************************************-----------------------------****************************************");
        System.out.println("********************************** Welcome To Number Guessing Game **************************************");
        System.out.println("************************************-----------------------------****************************************");
        System.out.println();
        boolean play_more = true;

        while (play_more) {
            Target = random.nextInt(endnum - startnum + 1) + startnum;
            
            System.out.println("There is a Number selected between 1 and 100, try to guess it.");
            System.out.println();

            while (attempts < Total_Attempts) {
                System.out.print("Enter your guess("+(attempts+1)+"): ");
                int userGuess = sc.nextInt();

                if (userGuess == Target) {
                    System.out.println("Congratulations You Won!!!!");
                    score++;
                    break;
                } else if (userGuess < Target) {
                    System.out.println("Greater than this!");
                } else {
                    System.out.println("Lower than this!");
                }

                attempts++;
            }

            if (attempts == Total_Attempts) {
                System.out.println();
                System.out.println("You lost the Number was " + Target );
            }
            System.out.println();

            System.out.print("Do you want to play again? yes or no: ");
            String playAgainResponse = sc.next().toLowerCase();

            if (!playAgainResponse.equals("yes")) {
                play_more = false;
            }
        }
System.out.println();
        System.out.println("Your score is : " + score);
        sc.close();
    }
}