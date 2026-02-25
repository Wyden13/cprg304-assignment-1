package sortingAlgorithms;
import java.util.Comparator;
import shapes.Shape;
import utilities.Comparision;

public class heapSort {
	private static void swapElements(Shape[] arr, int i, int j) {
		Shape temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void heapify(Shape[] arr,int n, int i,char t) {
		int smallest = i;
		int left = 2*i+1;
		int right = 2*i+2;
		
		// if left child is smaller than root
		if(left < n && Comparision.compare(arr[left],arr[smallest], t) < 0) {
			smallest = left;
		}
		
		// if right child is smaller than smaller
		if(right <n&& Comparision.compare(arr[right],arr[smallest],t)<0) {
			smallest = right;
		}
		
		//if smallest is not root
		if(smallest != i) {
			swapElements(arr,smallest,i);
			// Recursively heapify the affected sub-tree
			heapify(arr,n,smallest,t);
		}
	}
	public static void heapSort(Shape[] arr,char t) {
		int n = arr.length;
		for(int i= n/2-1;i>=0;i--) {
			heapify(arr,n,i,t);
		}
		  // One by one extract an element from heap
	    for (int i = n - 1; i > 0; i--) {
	        // Move current root to end
	        swapElements(arr, 0,i);
	        // Call max heapify on the reduced heap
	        heapify(arr, i, 0,t);
	    }
	}
}
	
	
	
		
		
		
		
			
