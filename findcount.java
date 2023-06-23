public class findcount {
    public static int findCount(int arr[], int num , int diff, int n){
        int count =0;
        for(int i=0; i<n; i++){
            if(Math.abs(arr[i]-num) <= diff)
                count++;
            
        }
        if(count>0)
        return count;
        else
        return -1;

    }
       public static void main(String[] args) {
        int arr[] = {1,3,14,56,77,13};
        int n = arr.length;
        int num = 13;
        int diff = 2;
        System.out.print(findCount(arr,num,diff , n));
       }
}
