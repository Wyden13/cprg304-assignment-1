package sortingAlgorithms;

import shapes.Shape;
import utilities.Comparision;

public final class SortSwitch {

	public static final <T> void sort(Shape[] arr, char comp, char sortType) {

		switch (sortType) {
		case 'b':
			bubbleSort.bubbleSort(arr, comp);
			break;
		case 'h':
			heapSort.heapSort(arr, comp);
			break;
		case 'i':
			insertionSort.insertionSort(arr, comp);
			break;
		case 'm':
			mergeSort.mergeSort(arr,0,arr.length-1,comp);
			break;
		case 'q':
			quickSort.quickSort(arr,0,arr.length-1,comp);
			break;
		case 's':
			selectionSort.selectionSort(arr, comp);
			break;
		default:
			throw new IllegalArgumentException("Unknown sort type: " + sortType);
		}
	}

	public static <T> void someSort(Shape[] array, char comp, char sortType) {
//		while(!isSorted(array,comp)) {
//			sort(array,comp,sortType);
//		}
		sort(array,comp,sortType);
		
		
//		System.out.println(isSorted(array,comp)+" Sort completed!");
	}

//	private static <T> void randomize(Comparable<T>[] array) {
//		for (int i = 0; i < array.length; i++) {
//			swapElements(array, i, (int) Math.floor(Math.random() * i + 1));
//		}
//	}
//
//	private static <T> void swapElements(Comparable<T>[] array, int i, int j) {
//		Comparable<T> temp = array[i];
//		array[i] = array[j];
//		array[j] = temp;
//	}

	@SuppressWarnings("unchecked")
	public static boolean isSorted(Shape[] array, char comp) {
		for (int i = 0; i < array.length - 1; i++) {
			if(Comparision.compare(array[i],array[i+1],comp) < 0) {
				return false;
			}
		}
		return true;
	}
}
