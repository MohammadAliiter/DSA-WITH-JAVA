import java.util.*;
public class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter No");
        int N = sc.nextInt();
           
        for(int i = 1 ; i<= N; i++){
            for(int j = 1; j<= i; j++){
                if(i % 2 !=0)
                System.out.print("A" + " ");
                else
                 System.out.print("B" + " ");
            }
            System.out.println();
        }
    }
}
