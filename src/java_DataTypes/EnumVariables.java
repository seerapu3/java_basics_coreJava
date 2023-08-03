package java_DataTypes;
public class EnumVariables {
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.TUESDAY;

        System.out.println("Day: " + day);
    }

    enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
