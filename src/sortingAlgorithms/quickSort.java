package sortingAlgorithms;
import java.util.Comparator;

import shapes.Shape;

public final class quickSort {
	private static void swapElements(Shape[] arr, int i,int j) {
		Shape temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
    // ---------- 1) QuickSort using Comparable (natural ordering) ----------
	public static void quickSort(Shape[]arr,int left,int right) {
		if(left<right) {
			int pivot = partition(arr, left,right);
			quickSort(arr,left,pivot-1);
			quickSort(arr,pivot+1,right);
		}
	}
	private static int partition(Shape[] arr, int left, int right) {
	        int i = left - 1;
	        Shape pivot = arr[right];

	        for (int j = left; j < right; j++) {
	            if (arr[j].compareTo(pivot) < 0) {
	                i++;
	                swapElements(arr, i, j);
	            }
	        }

	        swapElements(arr, i + 1, right);
	        return i + 1;
	    }
    // ---------- 2) QuickSort using Comparator ----------
	public static void quickSort(Shape[] arr, int left,int right, Comparator<Shape> comp) {	
		if(left <right) {
			int pivot = partition(arr,left,right,comp);
			quickSort(arr,left,pivot-1,comp);
			quickSort(arr,pivot+1,right,comp);
		}
	}
	
	public static int partition(Shape[]arr, int left,int right, Comparator<Shape> comp) {
		// TODO: compare using comparators (BaseArea, Volume)
		int i = left-1;
		Shape pivot = arr[right];
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
