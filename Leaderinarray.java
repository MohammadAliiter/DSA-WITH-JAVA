class Leaderinarray {
    public static void Leaderarr(int arr[], int L){
        for(int i = 0; i<L; i++){

            int j;
            for(j = i+1; j<L; j++){

                if(arr[i] <= arr[j]) // check the element is leader are not
                break;
            }
            
            if(j == L)
            System.out.print( arr[i]+ " ");//print the leader element in array
        }
    }
    public static void main(String[] args) {
        int arr[] = {12,45,43,12,79,2,56,5,4,3 };
        int L = arr.length;
        Leaderarr(arr,L);
    }
}
