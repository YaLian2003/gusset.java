//Yangyang Lian
import java.util.*;

public class GuessingGameProgram { // class to run the code

    public static void main(String[] args) { // driver method

        int lowerBound = 1; // instance variables
        int upperBound = 10;
        char choice = 'x';
        boolean play = false;
        boolean correct = true;
        int midpoint = 0;

        RandomNumberGuesser guessNum = new RandomNumberGuesser(lowerBound, upperBound); // calling the class by passing the parameters to the constructor
        Scanner sc = new Scanner(System.in);

        do {
            guessNum.reset(); // reset the values
            System.out.println("Get a number between " + lowerBound + " and " + upperBound); // print the values to console
            correct = true;

            do {
                midpoint = guessNum.getCurrentGuess(); // get the mid value

                System.out.println("Was that number : " + midpoint + "? [Higher(h)/Lower(l)/Correct(y)]"); // as for the user
                choice = sc.next().charAt(0); // get the value

                if (choice == 'h' || choice == 'H') { // check for the choice
                    guessNum.higher();
                } else if (choice == 'l' || choice == 'L') {
                    guessNum.lower();
                } else if (choice == 'y' || choice == 'Y') {
                    correct = false;
                }

            } while (correct); // iterate

            System.out.println("You picked " + midpoint + ".\nGreat.!"); // print the result
            System.out.println("Wanna Play Again(y/n)?");
            char playAgain = sc.next().charAt(0);

            if (playAgain == 'y' || playAgain == 'Y') { // ask for a game
                play = true;
            } else {
                play = false;
            }

        } while (play); // play again

        System.out.println("Bye!"); // exit
    }
}
