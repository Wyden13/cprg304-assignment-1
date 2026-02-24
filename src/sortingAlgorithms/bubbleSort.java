package sortingAlgorithms;

import java.util.Comparator;

import shapes.Shape;

public final class bubbleSort {
//	private static boolean flag;
	private static void swapElements(Shape[] arr, int i,int j) {
		Shape temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	// ----------------- Comparable (default)---------------//
	public static void bubbleSort(Shape[] arr) {
		for(int i = 0; i<arr.length-1;i++) {
			boolean flag = false;
			for(int j = 0; j <arr.length-1-i;j++) {
				if(arr[j].compareTo(arr[j+1]) == -1) {
					swapElements(arr,j,j+1);
					flag = true;
				}
			}
			if(!flag) {
				return;
			}
		}
	}
	// ----------------- Comparator ---------------//
	public static void bubbleSort(Shape[] arr, Comparator<Shape> comp) {
		for (int i = 0; i< arr.length-1; i ++) {
			boolean flag = false;
			for(int j = 0; j<arr.length -1 -i; j++ ) {
				if(comp.compare(arr[j], arr[j+1]) == -1) {
					Shape temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
			}
			if(!flag) {
				return;
			}
		}
	}
}
