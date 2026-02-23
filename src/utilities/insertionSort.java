package utilities;
import java.util.Comparator;

public final class insertionSort {
    // ---------- 1) Insertion Sort using Comparable ----------

	public static <T extends Comparable<? super T>> void insertionSort(T[] arr) {
		for (int i = 1;i<arr.length;i++) {
			T key = arr[i];
			int j = i-1;
			while(j>0 && arr[j].compareTo(key)<0) {
				arr[j+1] = arr[j];
				j-=1;
			}
			arr[j] = key;
		}
	}
	
    // ---------- 2) insertion using Comparator ----------
	public static <T> void insertionSort(T[] arr, Comparator<? super T> comp) {
		for (int i=1;i<arr.length;i++) {
			T key = arr[i];
			int j = i-1;
			while(j>0 && comp.compare(arr[j],key) < 0) {
				arr[j+1]= arr[j];
				j-=1;
			}
			arr[j]= key;
		}
	}
}
