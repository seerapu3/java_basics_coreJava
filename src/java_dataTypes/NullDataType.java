package java_dataTypes;
public class NullDataType {
    public static void main(String[] args) {
        String data = null;
        System.out.println("Data: " + data);

        // Accessing methods or properties on a null object will result in a NullPointerException
        // : data.length();
    }
}
