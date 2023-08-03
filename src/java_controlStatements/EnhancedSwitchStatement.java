package java_controlStatements;
public class EnhancedSwitchStatement {
    public static void main(String[] args) {
        int dayOfWeek = 3;
        String dayName = switch (dayOfWeek) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid day";
        };
        System.out.println(dayName);
    }
}
