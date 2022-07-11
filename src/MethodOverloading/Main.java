package MethodOverloading;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("name", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        double cm1 = calcFeetAndInchesToCentimeters(5d, 11d);
        System.out.println(cm1);
        double cm2 = calcFeetAndInchesToCentimeters(100d);
        System.out.println(cm2);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name no player score.");
        return 0;
    }

    //Challenge

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet < 0 || ( (inches < 0) || (inches > 12) )) return -1d;

        double allInches = (feet * 12d) + inches;
        return allInches * 2.54d;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches <= 0) return -1d;

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
