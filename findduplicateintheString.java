public class findduplicateintheString {
    public static void findDuplicateCharacters(String str) {
        System.out.println("Duplicate characters in the string '" + str + "':");
        char[] charArray = str.toCharArray();
        int length = charArray.length;

        for (int i = 0; i < length; i++) {
            // Ignore spaces and previously processed characters
            if (charArray[i] == ' ' || charArray[i] == '\0') {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < length; j++) {
                if (charArray[i] == charArray[j]) {
                    count++;
                    // Mark the duplicate character as processed
                    charArray[j] = '\0';
                }
            }

            // Print the duplicate character and its count
            if (count > 1) {
                System.out.println(charArray[i] + " - " + count + " occurrences");
            }
        }
    }

    public static void main(String[] args) {
        String inputString = "MOHAMMAD , ALI";
        findDuplicateCharacters(inputString);
    }
}
