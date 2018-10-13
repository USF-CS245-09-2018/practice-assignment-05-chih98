/** 

	MergeSort
	-implemenets SortingAlgorithm 
	- Performs merge sort
	
	@author Marko Crnkovic
*/

public class MergeSort implements SortingAlgorithm {

	/**
	
		Implementation
		@param a - array passed to sort

	*/
	public void sort(int[] a) {
		if (a.length > 1) 
			sort(a, 0, a.length - 1);
	}


	/** 
		
		Sort
		@param arr - array passed to srot
		@param left 
		@param right
	*/
	int[] sort(int[] arr, int left, int right) {

		if (left < right) {
			int split = (right+left) / 2;

			sort(arr, left, split);
			sort(arr, split++, right);
			sort(arr, left, right, split);
		}

		return arr;
	} 

	int[] sort(int[] arr, int left, int right, int split) {

		int[] r = new int[right-split++];
		int[] l = new int[split-left];

		int i = 0;
		left = 0;
		right = 0;

		while (left < l.length && right < r.length) {
			if (l[left] < r[right])
				arr[i++] = l[left++];
			else 
				arr[i++] = r[right++];
		}

		while (left < l.length)
			arr[i++] = l[left++];

		while (right < r.length) 
			arr[i++] = r[right++];

		return arr;
	}

}