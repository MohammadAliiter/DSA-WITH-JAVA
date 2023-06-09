class SearchinSortedArray {
	// function to implement
	// binary search
	static int binarySearch(int arr[], int low, int high,
							int key)
	{
		if (high < low)
			return -1;

		int mid = (low + high) / 2;
		if (key == arr[mid])
			return mid;
		if (key > arr[mid])
			return binarySearch(arr, (mid + 1), high, key);
		return binarySearch(arr, low, (mid - 1), key);
	}

	public static void main(String[] args)
	{
		int arr[] = { 5, 6, 7, 8, 9, 10 };
		int n,key;
		n = arr.length;
        key=10;
      int S = binarySearch(arr, 0, n, key);
      if(S==-1){
      System.out.print("Element not present int array");
      } else{
		System.out.println("Index: "
						+S);
      }
	}
}

