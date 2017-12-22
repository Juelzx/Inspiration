import java.util.Random;
import java.util.Scanner;

public class MainGame {

    public static void main(String[] args) {

        /*Result is wrong when userGuess > Solution. needs fixing. */

        boolean gameIsRunning = true;

        while (gameIsRunning) {
            System.out.print("Welcome\n" +
                    "We will show you 2 random numbers you have to guess the answer \n" +
                    "The closer you get to the solution the more points you achieve!\n");


            System.out.print("Please select a difficulty level\n");
            Scanner difficultyLevel = new Scanner(System.in);
            System.out.print("Enter 1 for EASY difficulty\n" +
                             "Enter 2 for MEDIUM difficulty\n" +
                             "Enter 3 for HARD difficulty\n");
            int userDifficulty = difficultyLevel.nextInt();
            int setDifficulty;

            if(userDifficulty == 1) {
                setDifficulty = 15;
            } else if(userDifficulty == 2) {
                setDifficulty = 50;
            } else if(userDifficulty == 3) {
                setDifficulty = 100;
            } else {
                System.out.print("Please only enter 1 for easy 2 for med and 3 for hard");
                return;
            }

            Random randomOne = new Random();
            Random randomTwo = new Random();
            int firstNumber = randomOne.nextInt(setDifficulty);
            int secondNumber = randomTwo.nextInt(setDifficulty);
            System.out.print("Number 1 is: " + firstNumber + " \n");
            System.out.print("Number 2 is: " + secondNumber + " \n");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Please guess a number now: ");
            int userGuess = scanner.nextInt();
            int solution = firstNumber * secondNumber;
            int difference = solution - userGuess;

            MainGame mainGame = new MainGame();
            mainGame.setDifficulty(setDifficulty);
            mainGame.IFtoCheckHowCloseUserGuessed(solution, userGuess, difference, setDifficulty);


            Scanner tryAgain = new Scanner(System.in);
            System.out.print("\nPress 1 to try again. Press 2 to exit.");
            int TryAgainOrExit = tryAgain.nextInt();

            switch (TryAgainOrExit) {
                case 1:
                    gameIsRunning = true;
                    break;
                case 2:
                    gameIsRunning = false;
                    break;
                default:
                    System.out.print("Unrecognized input. Game will finish.");
                    gameIsRunning = false;
                    break;
            }
        }
    }

    public void IFtoCheckHowCloseUserGuessed(int solution, int userGuess, int difference, int setDifficulty) {

      int difficulty = setDifficulty;


        if (solution - userGuess < difficulty) {
            System.out.print("\nYou were pretty close");
            System.out.print("\nThe solution was: " + solution);
            System.out.print("\nYour guess was: " + userGuess);
            System.out.print("\nThe difference was: " + difference);
        } else if (solution - userGuess < (difficulty+difficulty)) {
            System.out.print("\nThat was ok! Keep trying!");
            System.out.print("\nThe solutin was: " + solution);
            System.out.print("\nYours guess was: " + userGuess);
            System.out.print("\nThe difference was: " + difference);
        } else {
            System.out.print("\nPoor try! Better luck next time!");
            System.out.print("\nThe solution was: " + solution);
            System.out.print("\nYour guess was: " + userGuess);
            System.out.print("\nThe difference was: " + difference);
        }
    }

    public int setDifficulty(int setDifficulty) {
        int difficulty = 1;
        if(setDifficulty == 1) {
            difficulty = 30;
            return difficulty;
        } else if(setDifficulty == 2) {
            difficulty = 200;
            return difficulty;
        } else if(setDifficulty == 3) {
            difficulty = 500;
            return difficulty;
        }
        return difficulty;
    }
}
