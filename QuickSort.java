/** 

	QuickSort
	-implemenets SortingAlgorithm 
	- Performs quick sort
	
	@author Marko Crnkovic
*/
public class QuickSort implements SortingAlgorithm {

	/**
		implementation
		@param a - array of int
	*/
	public void sort(int[] a) {

		int l = 0;
		int r = a.length - 1;
		sort(a, l, r);

	}

	/**
		helper function that performs quicksort
		@param a - array to sort
		@param left - left int
		@param right - right int 
	*/
	private int[] sort(int[] a, int left, int right) {

		// It's bad practice to directly mutate parameters 
		int[] arr = a;

		int s = split(arr, left, right); 

		if (left > right) {

			sort(arr, left, s - 1);
			
		} else {

			sort(arr, s + 1, right);
		
		}

		return arr;
	}

	/**
		splits the array
		@param arr - the array
		@param left - left side of split
		@param right - right side of split
	*/
    int split(int[] arr, int left, int right){
        int p = arr[right];

        int i = left - 1;
       
        for (int j = left; j <= right; j++){
           
            if (arr[j] <= p) {
                
                i++;

                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;

            }
        }
        return p;
    }

}