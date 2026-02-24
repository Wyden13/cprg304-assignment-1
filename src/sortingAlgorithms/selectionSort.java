package sortingAlgorithms;

import java.util.Comparator;
import shapes.Shape;

public final class selectionSort {
	private static void swapElements(Shape[] arr, int i,int j) {
		Shape temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp; 
	}
	
    // ---------- 1) Selection sort using Comparable ----------
	public static void selectionSort(Shape[] arr) {
		for (int i = 0;i<arr.length;i++) {
			Shape min = arr[i];
			int idx= i;
			for(int j = i+1; j < arr.length;j++) {
				if(arr[j].compareTo(min)  < 0 ) {
					min = arr[j];
					idx = j;
				}
			}
			swapElements(arr,i,idx);
		}
	}
	
    // ---------- 2) selection sort using Comparator ----------
	
	public static void selectionSort(Shape[] arr, Comparator<Shape> comp) {
		for (int i=0;i<arr.length;i++) {
			Shape min = arr[i];
			int idx= i ;
			for (int j = i+1;j<arr.length;j++) {
				if(comp.compare(arr[j],min) < 0) {
					min = arr[j];
					idx= j;
				}
			}
			swapElements(arr,i,idx);
		}
	}

}
