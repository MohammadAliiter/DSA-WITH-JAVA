import java.util.*;

public class AdvancePattern{
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(" ");
        for(int i = 1; i <= n/2+1; i++){
           for(int j = 1; j<=n/2; j++){
              System.out.print("  ");
           }
          for(int j = 1; j <= n+1; j++){
            if((j >= i && j<=  n-i+1)){
            System.out.print(" @");
            }
            else{
              System.out.print("  ");
            }
          }
          System.out.println();
        }
        
        for(int i = 1; i <= n; i++){
          for(int j = 1; j <= n; j++){
            if( i == 1 || (j == 1 || j == n )){
            System.out.print(" *");
            }
            else{
              System.out.print("  ");
            }
          }
          System.out.println();
        }  
          
  }
}