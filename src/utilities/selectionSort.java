package utilities;

import java.util.Comparator;

public final class selectionSort {
	private static <T> void swapElements(T[] arr, int i,int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp; 
	}
	
    // ---------- 1) Selection sort using Comparable ----------
	public static <T extends Comparable<? super T>> void selectionSort(T[] arr) {
		for (int i = 0;i<arr.length;i++) {
			T min = arr[i];
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
	
	public static <T> void selectionSort(T[] arr, Comparator<? super T> comp) {
		for (int i=0;i<arr.length;i++) {
			T min = arr[i];
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
