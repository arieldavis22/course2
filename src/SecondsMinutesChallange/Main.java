package SecondsMinutesChallange;

public class Main {

    public static void main(String[] args) {
        String duration = getDurationString(123, 5);
        double test = area(12, 12);
        System.out.println(test);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) return "Invalid value";
        if (seconds < 0 || seconds > 59) return "Invalid value";

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    public static double area(double radius) {
        if(radius < 0) return -1;

        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        if(x < 0 || y < 0) return -1;
        return x * y;
    }
}
