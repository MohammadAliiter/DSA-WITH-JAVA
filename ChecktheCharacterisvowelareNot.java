import java.util.Scanner;
public class ChecktheCharacterisvowelareNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char first = sc.next().charAt(0);
        if( first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u' ||  first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U'){
              System.out.println(first + " " + " is vowel");
        }
        else{
            System.out.println(first + " " + " is constant");
        }
    } 
}