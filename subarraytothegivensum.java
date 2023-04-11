public class subarraytothegivensum {
// subarray two the given sum
	 static void subarraySum(int arr[], int n, int s)
	{
		for(int i=0;i<n;i++){
			int currentsum=arr[i];
       if(currentsum==s){
		System.out.print("the index no is" + i);
		return;
	   } 
	   

       for(int j=i+1;j<n;j++){
		currentsum+=arr[j];
		if(currentsum==s){
System.out.print("from index    "   + i + "  to  " + j);
return;
		}
	   }
		}
		System.out.print(" nkot fotn");
		return;
	}

	public static void main(String[] args)
	{
		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 20 };
		int n = arr.length;
		int s = 37;
		subarraySum(arr,n,s);
	}
}

    

