public class threeLargelinArray {
    static void findEl(int arr[], int n){
        if(n<3){
        System.out.print("Invailid Array");
        return;
        }
        int first,secound,third;
        first=secound=third=0;
        for(int i=0;i<n;i++){
            if(arr[i]>first){
                third=secound;
                secound=first;
                first=arr[i];
            }
            else if(arr[i]>secound /*&& arr[i]!=first*/){
                third=secound;
                secound=arr[i];
            }
            else if(arr[i]>third /*&& arr[i]!=secound*/){
                third=arr[i];
            }
            
        }
        System.out.print("three largest element is  " + first + " " + secound +" " + third + " " );
    }
    public static void main(String arrgs[]){
        int arr[]={10,4,3,50,23,90,90,90};
        int n=arr.length;
        findEl(arr,n);
    }
}
