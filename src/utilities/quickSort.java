package utilities;
import java.util.Comparator;

import shapes.Shape;

public final class quickSort {
	private static <T> void swapElements(T[] arr, int i,int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
    // ---------- 1) QuickSort using Comparable (natural ordering) ----------
	public static <T> void quickSort(T[]arr,int left,int right) {
		if(left<right) {
			int pivot = partition(arr, left,right);
			quickSort(arr,left,pivot-1);
			quickSort(arr,pivot+1,right);
		}
	}
	private static <T> int partition(T[] arr, int left, int right) {
	        int i = left - 1;
	        T pivot = arr[right];

	        for (int j = left; j < right; j++) {
	            if (((Shape) arr[j]).compareTo((Shape)pivot) < 0) {
	                i++;
	                swapElements(arr, i, j);
	            }
	        }

	        swapElements(arr, i + 1, right);
	        return i + 1;
	    }
    // ---------- 2) QuickSort using Comparator ----------
	public static <T> void quickSort(T[] arr, int left,int right, Comparator<T> comp) {	
		if(left <right) {
			int pivot = partition(arr,left,right,comp);
			quickSort(arr,left,pivot-1,comp);
			quickSort(arr,pivot+1,right,comp);
		}
	}
	
	public static <T> int partition(T[]arr, int left,int right, Comparator<? super T> comp) {
		// TODO: compare using comparators (BaseArea, Volume)
		int i = left-1;
		T pivot = arr[right];
		for(int j= left;j<right;j++) {
			if(comp.compare(arr[i],pivot) < 0) {
				i++;
				swapElements(arr,i,j);
			}
		}
		swapElements(arr,i+1,right);
		return i+1;
	}
}
