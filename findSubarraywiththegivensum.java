import javax.lang.model.util.ElementScanner14;

public class findSubarraywiththegivensum {
    void findsum(int arr[], int N, int sum){
        for(int i = 0; i<N; i++){
                  int currentsum = arr[i];


                    if(currentsum == sum){
                            System.out.print("   and the given sum found at the index is" + i);
                                       
                                   return;
                    }  
                          else {
                                 for(int j = i+1; j<N; j++){
                                        currentsum += arr[j];
                                        if(currentsum == sum)
                                               
                                               System.out.print( " the given sum found at the index is  " + i + " between " + j);
                                 }

                  }             
        }
    }
     public static void main(String[] args) {
        findSubarraywiththegivensum array = new findSubarraywiththegivensum();
               int arr[] = {23, 2, 4, 8, 9, 5, 10 };
               int N = arr.length;
               int sum = 23;
               array.findsum(arr,N,sum);
     }
}