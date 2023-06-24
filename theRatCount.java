class theRatCount{
    public static int numberofhouse(int arr[], int unit, int r, int n){
        if(n==0) return -1;
         int totalRequredfood = r*unit;
         int house = 0;
         int foodtillnow=0;
          for(house = 0;house<n; house++){
           foodtillnow  += arr[house]; 
            if(foodtillnow>=totalRequredfood){
                break;
                
            }
          }
          if(totalRequredfood > foodtillnow)
          return 0;
          return house +1;
         
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5};
        int n = arr.length;
        int unit = 2;
        int r = 7;
        int result = numberofhouse(arr,unit,r,n);
        System.out.print(result);
    }
}