public class checkperfectnumber {
      public static void main(String[] args) {
        int num = 6;
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0)
            sum = sum +i;
        } 
        if(sum == num)
          System.out.println("The number is prefect");
          else
          System.out.println("The number is not prefect");
           System.out.println(sum);
      }
}
