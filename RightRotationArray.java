public class RightRotationArray {
    static void Rightrotate(int arr[], int L, int K){
        int k=K%L;
        for(int i=0;i<L;i++){
            if(i<k){
                System.out.println(arr[L+i-k]);
            }
            else{
                System.out.println(arr[i-k]);
            }
        }
    }
public static void main(String args[]){
    int arr[]={1,2,3,4,5,7,8,9};
    int L=arr.length;
    int K=3;
    Rightrotate(arr,L,K);
}
}
