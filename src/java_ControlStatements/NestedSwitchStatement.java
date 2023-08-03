package java_ControlStatements;
public class NestedSwitchStatement {
    public static void main(String[] args) {
        int dayOfWeek = 2;
        int hourOfDay = 12;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                switch (hourOfDay) {
                    case 12:
                        System.out.println("Monday noon");
                        break;
                    default:
                        System.out.println("Monday");
                }
                break;
            default:
                System.out.println("Other day");
        }
    }
}
