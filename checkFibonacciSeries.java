class checkFibonacciSeries{
         public static void main(String[] args){
            int number = 15;
            int a = 0 , b = 1;
            System.out.print(a + " , " + b);
             int nextterm = 0;
            for(int i = 2; i <= number; i++){
               nextterm = a+b;
               a = b;
               b = nextterm;
               System.out.print( ", " + nextterm);

            }
           
}
}