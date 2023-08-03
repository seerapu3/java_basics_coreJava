package java_DataTypes;
public class EnumDataType {
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.TUESDAY;

        switch (day) {
            case MONDAY:
                System.out.println("It's Monday!");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday!");
                break;
            // Other cases for each day of the week...
            default:
                System.out.println("It's not a weekday!");
                break;
        }
    }

    enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
