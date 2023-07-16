public class pattern3 {
    public static void main(String[] args) {
        
    
    int n = 5;
    int p = 'A';
   for(int i = 1; i<=n; p++, i++){
    for(int j = i; j<=n; j++){
        System.out.print("  ");
    }
    for(int j = 1; j<=i; j++){
        System.out.print((char)p + " ");
    }
    for(int j = 1; j<i; j++){
        System.out.print("*" + " ");
    }
    System.out.println();
   }

    }
}
