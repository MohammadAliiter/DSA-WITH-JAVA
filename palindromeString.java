class palindromeString{
    public static boolean palindrome(String str, int L){
        if(L == 0) return false;
        int  start = 0;
        while(L>=start){
             int firstval = str.charAt(start);
             int endval = str.charAt(L);
            if(firstval !=endval)
                return false;
                start++;
                 L--;
        }
         return true;
    }
    public static void main(String[] args) {
        String str = "level";
        int L = str.length()-1;
       System.out.println(palindrome(str,L));
    }
}