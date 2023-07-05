public class CountTheNumberofVowelinString {
    public static void main(String[] args) {
        String str = "ali";
        int vowel = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||  str.charAt(i) == 'o' ||  str.charAt(i) == 'u')
            vowel++;
        }
        System.out.println(" the total vowel in this string are " + vowel);
    }
}