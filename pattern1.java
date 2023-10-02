public class pattern1{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n*2-1; i++){
            if(i <= n/2 + 1){
                for(int j =1; j <= n; j++){
                    if(j>=(n/2+1)-(i-1) && j<= (n/2+1)+(i-1)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            if(i>n/2+1 && i<=n+1){
                for(int j=1; j<=n; j++){
                    if(j==1 || j == n){
                        System.out.print("@");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            if(i>n+1 && i<=n*2-1){
                for(int j =1; j <=n; j++){
                    if(j>=(n/2+1)-(i-(n+1)-1) && j<= (n/2+1)+(i-(n+1)-1)){
                        System.out.print("*");
                    }
                  else if(j == 1 || j == n){
                    System.out.print("@");
                  }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            

            System.out.println();
        }
    }
}