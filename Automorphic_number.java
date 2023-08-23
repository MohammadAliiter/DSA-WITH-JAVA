import java.util.Scanner;
public class Automorphic_number{
    static boolean AutomorphicNumber(int num){
        int sq = num*num;
        while(num > 0){
            if(num % 10 != sq % 10)

               return false;

            num /= 10;
            sq /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        System.out.println(AutomorphicNumber(num));

        
    }
}