package java_Strings;
public class StringCharacterArrayConversion {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // String to char array
        char[] charArray = str.toCharArray();
        for (char ch : charArray) {
            System.out.print(ch);
        }
        System.out.println();
        
        // Char array to String
        String newStr = new String(charArray);
        System.out.println("New String: " + newStr);
    }
}
