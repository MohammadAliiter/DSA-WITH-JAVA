import java.util.Arrays;

public class evenposgreaterthanod {
    public static void rearrengearray(int arr[] , int L){
        //first sort the given array
          Arrays.sort(arr);
          // print sorted array
            for(int i = 0; i<L; i++){
        System.out.print(arr[i] + " ");

       }

       int newarr[] = new int[L];
          int a = 0 , b = L-1;
          for(int i= 0; i<L; i++){
            if( (i+1) % 2 == 0 ) 
            newarr[i]= arr[b--]; //assingn max in even position
            else
            newarr[i] = arr[a++]; // assingn min in odd position
          }
           // print rearrenge array
       System.out.println();
         for(int i = 0; i<L; i++){
        System.out.print(newarr[i] + " ");
       }
        
    }
    public static void main(String[] args) {
        int arr[] = {12,34,23,45,7,9,65,3,2,100};
        int L = arr.length;
        rearrengearray(arr,L);
      
    }
}
