package java_ControlStatements;
import java.util.ArrayList;
import java.util.List;

public class ArrayListWithSwitch {
    public static void main(String[] args) {
        List<Character> grades = new ArrayList<>();
        grades.add('A');
        grades.add('B');
        grades.add('C');
        grades.add('D');
        grades.add('F');

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
