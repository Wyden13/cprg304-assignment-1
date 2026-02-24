package sortingAlgorithms;
import java.util.Comparator;
import shapes.Shape;

public class heapSort {
	private static void swapElements(Shape[] arr, int i, int j) {
		Shape temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	//--------------------------Comparable--------------------------//
	public static void heapify(Shape[] arr,int n, int i) {
		int smallest = i;
		int left = 2*i+1;
		int right = 2*i+2;
		
		// if left child is smaller than root
		if(left < n && (arr[left].compareTo(arr[smallest]) < 0)) {
			smallest = left;
		}
		
		// if right child is smaller than smaller
		if(right <n&& (arr[right].compareTo(arr[smallest])<0)) {
			smallest = right;
		}
		
		//if smallest is not root
		if(smallest != i) {
			swapElements(arr,smallest,i);
			// Recursively heapify the affected sub-tree
			heapify(arr,n,smallest);
		}
	}
	public static void heapSort(Shape[] arr) {
		int n = arr.length;
		for(int i= n/2-1;i>=0;i--) {
			heapify(arr,n,i);
		}
		  // One by one extract an element from heap
	    for (int i = n - 1; i > 0; i--) {
	        // Move current root to end
	        swapElements(arr, 0,i);
	        // Call max heapify on the reduced heap
	        heapify(arr, i, 0);
	    }
	}
	//---------------------------- Comparator---------------------------------//
	public static void heapSort(Shape[] arr, Comparator<Shape> comp) {
		int n = arr.length;
		for(int i = n/2 -1;i>=0;i--) {
			heapify(arr,n,i,comp);
		}
		for (int i= n - 1; i>0;i--) {
			swapElements(arr,0,i);
			heapify(arr,i,0,comp);
		}
	}
	
	public static <T> void heapify(Shape[] arr, int n, int i, Comparator<Shape> comp) {
		int smallest = i;
		int left  = i * 2 + 1;
		int right = i * 2 + 2;
		
		if (left < n && comp.compare(arr[left], arr[smallest]) < 0) {
			smallest = left;
		}
		if( right < n && comp.compare(arr[right], arr[smallest])< 0 ) {
			smallest = right;
		}
		if(smallest != i) {
			swapElements(arr, smallest, i);
			heapify(arr,n,smallest, comp);
		}
	}
	
	
}
