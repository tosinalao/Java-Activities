package Activity2;

public class StringMethods {
    public static void charAt() {
        String myStr = "Tosin";
        char result = myStr.charAt(2);
        System.out.println("The third letter of the name 'Tosin' is " + result);
    }

    public static void compareTo() {
        String myStr1 = "Hello";
        String myStr2 = "Hello";
        System.out.println(myStr1.compareTo(myStr2)); // Returns 0 because they are equal
    }

    public static void concat() {
        String firstName = "Tosin ";
        String lastName = "Alao";
        System.out.println(firstName.concat(lastName));
    }

    public static void contains() {
        String myStr = "Tosin";
        System.out.println(myStr.contains("Tos"));   // true
        System.out.println(myStr.contains("n"));     // true
        System.out.println(myStr.contains("on"));    // false
    }
}

