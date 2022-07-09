package KeywordsAndExpressions;

public class Main {
    public static void main(String[] args) {
        // a mile is equal to 1.609344 kilometers
        // Everything after data type (double) is the expression
        double kilometers = 100 * 1.609344;

        int highScore = 50;
        // highScore == 50 is the expression in this case
        if (highScore == 50) {
            System.out.println("This is an expression");
        }

        // Challenge
        // In the following code, write down what parts of the code are expressions.
        int score = 100;
        if (score > 90) {
            System.out.println("You got the high score!");
            score = 0;
        }

        /*
        score = 100
        score > 90
        "You got the high score!"
        score = 0
         */
    }
}
