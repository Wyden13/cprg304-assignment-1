package sortingAlgorithms;

import shapes.Shape;
import utilities.Comparision;

public class heapSort {
	private static void swapElements(Shape[] arr, int i, int j) {
		Shape temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void heapify(Shape[] arr, int n, int i, char t) {
		int smallest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if (left < n && Comparision.compare(arr[left], arr[smallest], t) < 0) {
			smallest = left;
		}

		if (right < n && Comparision.compare(arr[right], arr[smallest], t) < 0) {
			smallest = right;
		}

		if (smallest != i) {
			swapElements(arr, smallest, i);
			heapify(arr, n, smallest, t);
		}
	}

	public static void heapSort(Shape[] arr, char t) {
		int n = arr.length;
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i, t);
		}
		for (int i = n - 1; i > 0; i--) {
			swapElements(arr, 0, i);
			heapify(arr, i, 0, t);
		}
	}
}
