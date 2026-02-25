package sortingAlgorithms;

import shapes.Shape;
import utilities.Comparision;

public final class bubbleSort {

	public static void bubbleSort(Shape[] arr, char t) {
		for(int i = 0; i<arr.length-1;i++) {
			boolean flag = false;
			for(int j = 0; j <arr.length-1-i;j++) {
				if(Comparision.compare(arr[j],arr[j+1],t) < 0) {
					Shape temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
			}
			if(!flag) {
				return;
			}
		}
	}					
}
