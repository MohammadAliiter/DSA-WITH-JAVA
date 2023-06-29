import java.util.*;
class HcfofTwoNumber{
       public static void main(String[] args) {
           /*  int a = 36;
            int b = 60;
            int hcf = 0;
            for(int i = 1; i <= a && i <= b; i++){
                 if(a %  i == 0 && b % i == 0)
                      hcf = i;
            }
            System.out.println(" the hcf of two number is " + hcf);
            */
               Scanner sc = new Scanner(System.in);
               System.out.println("Enter first Number ");
               int a = sc.nextInt();
               System.out.println("Enter Second Number ");
               int b = sc.nextInt();
               System.out.println("The output will be ");
               int hcf = 0;
                        for(int i = 1; i <= a && i <= b; i++){

                              if(a %  i == 0 && b % i == 0)

                                        hcf = i;
            }
                       System.out.println(" the hcf of two number is " + hcf );
       }
}