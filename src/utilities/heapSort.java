package utilities;

import java.util.Comparator;

public final class heapSort {

    private static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Descending using Comparable
    private static <T extends Comparable<? super T>> void heapifyDescending(T[] arr, int n, int i) {
        int smallest = i; // For min-heap
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left].compareTo(arr[smallest]) < 0)
            smallest = left;

        if (right < n && arr[right].compareTo(arr[smallest]) < 0)
            smallest = right;

        if (smallest != i) {
            swap(arr, i, smallest);
            heapifyDescending(arr, n, smallest);
        }
    }

    public static <T extends Comparable<? super T>> void heapSortDescending(T[] arr) {
        int n = arr.length;

        // Build min-heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapifyDescending(arr, n, i);
        }

        // Extract elements one by one
        for (int i = n - 1; i >= 0; i--) {
            swap(arr, 0, i);
            heapifyDescending(arr, i, 0);
        }
    }

    // Descending using Comparator
    private static <T> void heapifyDescending(T[] arr, int n, int i, Comparator<? super T> comp) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && comp.compare(arr[left], arr[smallest]) < 0)
            smallest = left;

        if (right < n && comp.compare(arr[right], arr[smallest]) < 0)
            smallest = right;

        if (smallest != i) {
            swap(arr, i, smallest);
            heapifyDescending(arr, n, smallest, comp);
        }
    }

    public static <T> void heapSortDescending(T[] arr, Comparator<? super T> comp) {
        int n = arr.length;

        // Build min-heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapifyDescending(arr, n, i, comp);
        }

        // Extract elements one by one
        for (int i = n - 1; i >= 0; i--) {
            swap(arr, 0, i);
            heapifyDescending(arr, i, 0, comp);
        }
    }
}