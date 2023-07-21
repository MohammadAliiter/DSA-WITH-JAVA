public class pattern8 {
    public static void main(String[] args) {
        
     int n = 4;
     int p = 1;
     for(int i = 1; i<=n+1;  i += 1){
        for( int j = i; j<=n; j++){
            System.out.print("  ");
        }
        for(int j = 1; j<=i; j++){
           if(j==1 || j == i){
            System.out.print(p + " ");
            p = p+1;
            }
          else {
            System.out.print("* ");
            }
        }
        for(int j = 1; j<i; j++){
            if(j == i-1){
            System.out.print(p + " ");
            p = p+1;
            }
            else{
                System.out.print("* ");
            }
        }
        if(i == 1){
            i = i+1;
        }
        System.out.println();
     }                      
    }
}
