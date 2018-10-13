/** 

	InsertionSort
	-implemenets SortingAlgorithm 
	- Performs insertion sort
	
	@author Marko Crnkovic
*/

public class InsertionSort implements SortingAlgorithm {

	/**
		implementation
		@param a - array to be sorted.
	*/
	public void sort(int[] a) {

		for (int i = 0; i < a.length; i++) {
			for (int k = i; k > 0; k--){

				if (a[k] < a[k-1]) {
					int t = a[k];
					a[k] = a[k-1];
					a[k-1] = t;
				}

			}
		}

	}

}