package sortingAlgorithms;

import shapes.Shape;
import utilities.Comparision;

public final class quickSort {
	private static void swapElements(Shape[] arr, int i,int j) {
		Shape temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void quickSort(Shape[]arr,int left,int right,char t) {
		if(left<right) {
			int pivot = partition(arr, left,right,t);
			quickSort(arr,left,pivot-1,t);
			quickSort(arr,pivot+1,right,t);
		}
	}
	private static int partition(Shape[] arr, int left, int right,char t) {
	        int i = left - 1;
	        Shape pivot = arr[right];

	        for (int j = left; j < right; j++) {
	            if (Comparision.compare(arr[j], pivot, t)>0) {
	                i++;
	                swapElements(arr, i, j);
	            }
	        }
	        swapElements(arr, i + 1, right);
	        return i + 1;
	    }
}
