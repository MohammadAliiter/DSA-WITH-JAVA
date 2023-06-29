 import java.util.*;
public class LCMofTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
       // String str = sc.next();
        int hcf = 0;
        for(int i = 1; i <= num1 && i <= num2; i++){
              if(num1 % i == 0 && num2 % i == 0)
                      
                           hcf = i;
                 
          }
        int Lcm = num1 * num2/hcf;
        System.out.println("this is the Lcm of both number    " + Lcm);
                  
          
    }
}
