public class RemoveVowelfromstring {
    public static void main(String[] args) {
        String str = "alibhai";
        String str1 = "";
        str1 = str.replaceAll("[aeiou]" , "");
        System.out.println(" the new string will be  " + str1);
    }
}
