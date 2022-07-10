package IfKeywordAndCodeBlocks;

public class Main {
    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Final score: " + highScore);

        //Challenge
        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Final score: " + highScore);

        /*
        Challenge:
        create method called displayHighScorePosition
        should take players name as a param, and a 2nd param as a position in the high score table
        should display players name along with message like " managed to get into position"
        and the position they got plus " on the high score table"

        2nd method called calculateHighScorePosition
        take 1 argument, player score
        return an int
        1 if score is >1000
        2 if score is >500 and < 1000
        3 if score is > 100 and < 500
        4 other cases
        call both methods and display results for the following
        1500 900 400 50
         */

        displayHighScorePosition("Name", calculateHighScorePosition(50));

    }
    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }
    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }
}
