public class ReverseStringusinReccursion {
    
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        String reversedString = reverseString(inputString);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseString(String str) {
        // Base case: if the string is empty or has only one character
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }
        
        // Recursive case: reverse the substring from index 1 to end and append the first character at the end
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}


