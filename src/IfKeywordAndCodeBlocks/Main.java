package IfKeywordAndCodeBlocks;

public class Main {
    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Final score: " + highScore);

        //Challenge
        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Final score: " + highScore);
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
