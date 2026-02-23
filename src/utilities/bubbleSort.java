package utilities;

import java.util.Comparator;

import shapes.Shape;

public final class bubbleSort {
	private static boolean flag;
	private static <T> void swapElements(T[] arr, int i,int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static <T> void bubbleSort(T[] arr) {
		for(int i = 0; i<arr.length-1;i++) {
			flag = false;
			for(int j = 0; j <arr.length-1-i;j++) {
				if(((Shape) arr[j]).compareTo((Shape)arr[j+1]) == -1) {
					swapElements(arr,j,j+1);
					flag = true;
				}
			}
			if(!flag) {
				return;
			}
		}
	}
	public static <T> void bubbleSort(T[] arr, Comparator<? super T> comp) {
		for (int i = 0; i< arr.length-1; i ++) {
			flag = false;
			for(int j = 0; j<arr.length -1 -i; j++ ) {
				if(comp.compare(arr[j], arr[j+1]) == -1) {
					T temp = arr[j];
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
