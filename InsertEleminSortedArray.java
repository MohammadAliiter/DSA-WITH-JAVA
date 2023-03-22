 public class InsertEleminSortedArray {
	static int insertSorted(int arr[], int n, int key)
	{
            int i;
		for ( i = n-1;(i >= 0 && arr[i] > key); i--)
			arr[i+1] = arr[i];
	    	arr[i+1] = key;

		return (n + 1);
	} 
	public static void main(String[] args)
	{
		int arr[] = new int[15];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;
		int n = 6;
		int key = 9;
        n = insertSorted(arr,n,key);
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] +" ");
    }
}