package sortingAlgorithms;

import java.util.Arrays;
import shapes.Shape;
import utilities.Comparision;

public final class mergeSort {
	/**
	 * merge sort
	 * @param arr
	 * @param left
	 * @param right
	 * @param t
	 */
	public static void mergeSort(Shape[] arr, int left, int right,char t){
	    if (left >= right)
	        return;
	    int mid = left + (right - left) / 2;
	    mergeSort(arr, left, mid,t);
	    mergeSort(arr, mid + 1, right,t);
	}
	private static void merge(Shape[] arr, int left,int mid, int right,char t) {
		 Shape[] leftArr  = Arrays.copyOfRange(arr, left, mid + 1);
		 Shape[] rightArr = Arrays.copyOfRange(arr, mid + 1, right + 1);
		 
		 int i = 0, j = 0, k = left;

		 while (i < leftArr.length && j < rightArr.length) {
			 	if(Comparision.compare(leftArr[i],rightArr[j], t) < 0) {
		            arr[k++] = leftArr[i++];
		        }
		        else {
		            arr[k++] = rightArr[j++];
		        }
		 }
		 while (i < leftArr.length) arr[k++] = leftArr[i++];
		 while (j < rightArr.length) arr[k++] = rightArr[j++];
	}
}
