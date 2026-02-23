package utilities;

import java.util.ArrayList;

public final class mergeSort {
	
	public static <T> void mergeSort(T[] arr, int left, int right){
	    if (left >= right)
	        return;
	    int mid = left + (right - left) / 2;
	    mergeSort(arr, left, mid);
	    mergeSort(arr, mid + 1, right);
	    merge(arr, left, mid, right);
	}
	private static <T extends Comparable<? super T>> void merge(T[] arr, int left,int mid, int right) {
		 int n1 = mid - left + 1;
		 int n2 = right - mid;
		 
		 ArrayList<T> leftArr, rightArr = new ArrayList<>();

		 // Copy data to temp vectors L[] and R[]
		 for (int i = 0; i < n1; i++)
			leftArr[i].add(arr[left + i]);
		 for (int j = 0; j < n2; j++)
		    rightArr[j].add( arr[mid + 1 + j]);

		 int i = 0, j = 0;
		 int k = left;

		 // Merge the temp vectors back 
		 // into arr[left..right]
		 while (i < n1 && j < n2) {
		        if (leftArr[i].compareTo(rightArr[j]) < 0) {
		            arr[k] = leftArr[i];
		            i++;
		        }
		        else {
		            arr[k] = rightArr[j];
		            j++;
		        }
		        k++;
		    }

		    // Copy the remaining elements of L[], 
		    // if there are any
		    while (i < n1) {
		        arr[k] = leftArr[i];
		        i++;
		        k++;
		    }

		    // Copy the remaining elements of R[], 
		    // if there are any
		    while (j < n2) {
		        arr[k] = rightArr[j];
		        j++;
		        k++;
		    }

	}

}
