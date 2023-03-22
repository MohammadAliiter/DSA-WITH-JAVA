//left Rotate Array one by one.
public class LeftRotateArray{
    static int rotate(int arr[], int L, int K){
        int p=1;
        while(p<=K){
            int last=arr[0];
            for(int i=0;i<L-1;i++){
                arr[i]=arr[i+1];
            }
            arr[L-1]=last;
            p++;
        }
        return L;

    }
    static void print(int arr[], int L){
        for(int i=0;i<L;i++){
        System.out.println(arr[i]);
     }
     
    }
    public static void main(String args[]){
     int arr[]={1,2,3,4,5};
     int L=arr.length;
     int K=2;
        System.out.println("before rotation");
        print(arr,L);
     rotate(arr,L,K);
        System.out.println("after Rotation");
        print(arr,L);

    }
}
        