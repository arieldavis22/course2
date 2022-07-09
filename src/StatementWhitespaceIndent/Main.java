package StatementWhitespaceIndent;

public class Main {
    public static void main(String[] args) {
        // This following lines are statements
        int myVar = 50;
        myVar++;
        myVar--;
        System.out.println("This is a test");

        // Can be on more than 1 line
        System.out.println("this is a" +
                " another" +
                " another other");
    }
}
