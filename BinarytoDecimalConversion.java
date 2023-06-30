import java.util.*;
import java.util.Scanner;
public class BinarytoDecimalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        // inter the binary number

        int binary = sc.nextInt();

        // input for exponent on binary digit 2

        int n = sc.nextInt(); 

        int decimal = 0;
        
        while(binary > 0){
            int temp = binary % 10;
            decimal += temp*Math.pow(2,n);
            binary = binary/10;
            n++;
        }
        System.out.println(decimal);
    }
}
