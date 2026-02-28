package sortingAlgorithms;

import shapes.Shape;
import utilities.Comparision;
/**
 * sort switch class includes sort options and isSorted (check if an array is sorted)
 */

public final class SortSwitch {

	/**
	 * switch case to identify argument options with exception
	 * @param arr
	 * @param comp
	 * @param sortType
	 */
	public static final void sort(Shape[] arr, char comp, char sortType) {

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
			mergeSort.mergeSort(arr, 0, arr.length - 1, comp);
			break;
		case 'q':
			quickSort.quickSort(arr, 0, arr.length - 1, comp);
			break;
		case 's':
			selectionSort.selectionSort(arr, comp);
			break;
		default:
			throw new IllegalArgumentException("Unknown sort type: " + sortType);
		}
	}

	/**
	 * this will be called to check array order; if not, call to sort function
	 * @param array
	 * @param comp
	 * @param sortType
	 */
	public static void someSort(Shape[] array, char comp, char sortType) {
		while (!isSorted(array, comp)) {
			sort(array, comp, sortType);
		}
	}

	/**
	 * Check an array order
	 * @param array
	 * @param comp
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static boolean isSorted(Shape[] array, char comp) {
		for (int i = 0; i < array.length - 1; i++) {
			if (Comparision.compare(array[i], array[i + 1], comp) < 0) {
				return false;
			}
		}
		return true;
	}
}
