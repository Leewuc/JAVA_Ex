package ch01;

public class PracticeSwitchExpressionEx01 {
    public static void main(String[] args) {
        int dayOfWeek = 3;
        String dayName = switch (dayOfWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day of the week";
        };
        System.out.println("Day: " + dayName);
    }
}

