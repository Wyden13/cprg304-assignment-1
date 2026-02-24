package sortingAlgorithms;
import java.util.Comparator;
import shapes.Shape;

public final class insertionSort {
    // ---------- 1) Insertion Sort using Comparable ----------

	public static void insertionSort(Shape[] arr) {
		for (int i = 1;i<arr.length;i++) {
			Shape key = arr[i];
			int j = i-1;
			while(j>0 && arr[j].compareTo(key)<0) {
				arr[j+1] = arr[j];
				j-=1;
			}
			arr[j] = key;
		}
	}
	
    // ---------- 2) insertion using Comparator ----------
	public static void insertionSort(Shape[] arr, Comparator<Shape> comp) {
		for (int i=1;i<arr.length;i++) {
			Shape key = arr[i];
			int j = i-1;
			while(j>0 && comp.compare(arr[j],key) < 0) {
				arr[j+1]= arr[j];
				j-=1;
			}
			arr[j]= key;
		}
	}
}
