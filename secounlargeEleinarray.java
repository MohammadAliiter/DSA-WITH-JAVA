class secounlargeEleinarray {
    static void print2largest(int arr[], int n) {
        int first, secound;
        first=secound=0;
        for(int i=0;i<n;i++){
            if(arr[i]>first){
                secound=first;
                first=arr[i];
            }
            else if(arr[i]>secound){
                secound=arr[i];
            }
        }
        System.out.print("the secouns largest value is " + " " + secound);

    }
    public static void main(String args[]){
        int arr[]={12,35,1,10,34,23};
        int n=arr.length;
        print2largest(arr,n);
        
    }
}