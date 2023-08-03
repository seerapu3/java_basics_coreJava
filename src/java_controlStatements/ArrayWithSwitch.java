package java_controlStatements;
public class ArrayWithSwitch {
    public static void main(String[] args) {
        char[] grades = {'A', 'B', 'C', 'D', 'F'};

        for (char grade : grades) {
            switch (grade) {
                case 'A':
                    System.out.println("Excellent");
                    break;
                case 'B':
                    System.out.println("Good");
                    break;
                case 'C':
                    System.out.println("Average");
                    break;
                case 'D':
                    System.out.println("Below Average");
                    break;
                case 'F':
                    System.out.println("Fail");
                    break;
                default:
                    System.out.println("Unknown Grade");
                    break;
            }
        }
    }
}
