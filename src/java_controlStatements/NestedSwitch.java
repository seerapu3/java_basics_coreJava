package java_controlStatements;
public class NestedSwitch {
    public static void main(String[] args) {
        int floor = 2;
        int room = 202;

        switch (floor) {
            case 1:
                System.out.println("First Floor");
                switch (room) {
                    case 101:
                        System.out.println("Room 101");
                        break;
                    case 102:
                        System.out.println("Room 102");
                        break;
                    default:
                        System.out.println("Unknown Room");
                        break;
                }
                break;
            case 2:
                System.out.println("Second Floor");
                switch (room) {
                    case 201:
                        System.out.println("Room 201");
                        break;
                    case 202:
                        System.out.println("Room 202");
                        break;
                    default:
                        System.out.println("Unknown Room");
                        break;
                }
                break;
            default:
                System.out.println("Unknown Floor");
                break;
        }
    }
}
