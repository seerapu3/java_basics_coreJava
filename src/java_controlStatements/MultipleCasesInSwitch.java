package java_controlStatements;
public class MultipleCasesInSwitch {
    public static void main(String[] args) {
        int number = 5;
        switch (number) {
            case 1, 3, 5, 7, 9:
                System.out.println("Odd number");
                break;
            case 2, 4, 6, 8, 10:
                System.out.println("Even number");
                break;
            default:
                System.out.println("Other number");
        }
    }
}
