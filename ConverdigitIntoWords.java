import java.util.*;
 public class ConverdigitIntoWords {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inter your number");
        int n = sc.nextInt();
        if(n < 0 || n > 999){
        System.out.println("please Inter Number who is less than 999.");
        }
         else {
         
           int u = n % 10;   //last digit(u means unit digit)
           int tt = n / 10;      // tens for digit;
           int t = tt % 10; // this tens value ;
           int h = n /100;
           String uw[] = {" ", "One","Two","Three","Four","Five","six","seven","eight","nine","ten","eleven","twelve","thirteen",  "fourteen","fifteen", "sixteen ","seventeen", "eighteen","nineteen"};
           String tw[] = { " ","ten ","tuwenty",  "thirty","fourty",  "fifty", "sixty", "seventy", "eighty", "ninty",};
           String hw = "hundered";
           if(n < 20){
               System.out.println(uw[n] + "   ");
           }
           else if(n < 100){
                  System.out.println(tw[t]+ "   " + uw[u] + "   ");
           }
           else {
             System.out.println(uw[h] + "   " + hw + "  " + tw[t] + "  " +uw[u] );
           }
         }


    }
}