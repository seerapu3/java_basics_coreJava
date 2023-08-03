package java_strings;
public class UnicodeCodePoints {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Code point at index 4
        int codePoint = str.codePointAt(4);
        System.out.println("Code point at index 4: " + codePoint);
        
        // Unicode representation
        String unicodeRepresentation = str.codePoints()
                                        .mapToObj(cp -> String.format("U+%04X", cp))
                                        .reduce("", (result, cp) -> result + cp + " ");
        System.out.println("Unicode representation: " + unicodeRepresentation);
    }
}
