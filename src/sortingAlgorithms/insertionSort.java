package sortingAlgorithms;

import shapes.Shape;
import utilities.Comparision;

public final class insertionSort {
	// public insertionSort() {};
	public static void insertionSort(Shape[] arr, char t) {
		for (int i = 1; i < arr.length; i++) {
			Shape key = arr[i];
			int j = i - 1;
			while (j >= 0 && Comparision.compare(arr[j], key, t) < 0) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
}
