//Create a class Utility with a static method convertToUpper(String str)
// that takes a string as input and returns it in uppercase. Test this method in the main functio

package Day_c_Three.Variables_and_Methods;

class Utility {
    public static String convertToUpper(String str) {
        if (str != null) {
            return str.toUpperCase();
        } else {
            return null;
        }
    }
}

public class UtilityDemo {
    public static void main(String[] args) {
        String input = "hello, world!";
        String result = Utility.convertToUpper(input);

        System.out.println("Original String: " + input);
        System.out.println("Uppercase String: " + result);
    }
}

