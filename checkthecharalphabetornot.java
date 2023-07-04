import java.util.Scanner;
public class checkthecharalphabetornot {
       public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          char char1 = sc.next().charAt(0);
              
              if((char1 >= 'a'   && char1 <= 'z') || (char1 >= 'A' && char1 <= 'Z')){
                System.out.println(char1 + " " + " is an alphabet");
              }
              else{
                System.out.println(char1 + " " + " is not an alphabet");
                }
             }
}