package sortingAlgorithms;

import java.util.Comparator;
import java.util.Arrays;
import shapes.Shape;

public final class mergeSort {
	
	public static void mergeSort(Shape[] arr, int left, int right){
	    if (left >= right)
	        return;
	    int mid = left + (right - left) / 2;
	    mergeSort(arr, left, mid);
	    mergeSort(arr, mid + 1, right);
	    merge(arr,left,mid,right);
	}
	//------------------ Comparable (Default sorting - height)-----------------------//
	private static void merge(Shape[] arr, int left,int mid, int right) {
		 Shape[] leftArr  = Arrays.copyOfRange(arr, left, mid + 1);
		 Shape[] rightArr = Arrays.copyOfRange(arr, mid + 1, right + 1);
		 
		 int i = 0, j = 0, k = left;

		 while (i < leftArr.length && j < rightArr.length) {
		        if (leftArr[i].compareTo(rightArr[j]) < 0) {
		            arr[k++] = leftArr[i++];
		        }
		        else {
		            arr[k++] = rightArr[j++];
		        }
		 }
		    // Copy the remaining elements of L[], if there are any
		 while (i < leftArr.length) arr[k++] = leftArr[i++];
		 while (j < rightArr.length) arr[k++] = rightArr[j++];
	}
	
	//------------------ comparator -----------------------//
	public static void mergeSort(Shape[] arr, int left,int right, Comparator<Shape> comp) {
		if (left>= right)
			return;
		int mid = left +(right-left) / 2;
		mergeSort(arr,left,mid,comp);
		mergeSort(arr,mid+1,right,comp);
		merge(arr,left,mid,right,comp);
	}
	
	private static void merge(Shape[] arr,int left,int mid, int right,Comparator<Shape> comp) {
		Shape[] leftArr = Arrays.copyOfRange(arr,left,mid+1);
		Shape[] rightArr = Arrays.copyOfRange(arr, mid+1,right+1);
		
		int i=0,j=0,k =left;
		while(i<leftArr.length && j<rightArr.length) {
			if(comp.compare(leftArr[i], rightArr[j]) < 0) {
				arr[k++] = leftArr[i++];
			}else {
				arr[k++] = rightArr[j++];
			}
		}
	}

}
