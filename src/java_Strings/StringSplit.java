package java_Strings;
public class StringSplit {
    public static void main(String[] args) {
        String str = "apple,orange,banana";
        String[] fruits = str.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
