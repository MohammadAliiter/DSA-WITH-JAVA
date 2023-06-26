import java.util.Arrays;
class anagramString{
    public static void main(String[] args) {
        
    String str1 = "cat";
    String str2 = "act";

    if(str1.length()==str2.length())
    {
          char[] arr1 = str1.toCharArray();
           Arrays.sort(arr1);
         System.out.println(Arrays.toString(arr1));
          char[] arr2 = str2.toCharArray();
           Arrays.sort(arr2);
           System.out.println(Arrays.toString(arr2));
           System.out.println(Arrays.equals(arr1,arr2));
           if(Arrays.equals(arr1,arr2)){
           System.out.println(" the given string is anagram");
           }
           else
           {
           System.out.println(" the given string are not anagram");
           }

    }
}
}