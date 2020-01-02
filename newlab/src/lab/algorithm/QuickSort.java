package lab.algorithm;

public class QuickSort {

	private int arr[];
	
	static int i=0;
	public QuickSort(int[] arr) {
		this.arr = arr;
		quickSort(arr, 0, arr.length-1);
	}
	
	public void getQuickSort() { 
		for(int val : this.arr) {
			System.out.print(val + " ");			
		}
	}
	
	private void quickSort(int[] arr, int left, int right) {
		if(left < right) {
			int pivot = partition(arr, left, right);
			quickSort(arr, left, pivot-1);
			quickSort(arr, pivot+1, right);
		}
	}

	private int partition(int[] arr, int left, int right) {
		
		int pivot = (int)(left+right)/2;
		int idxLeft = left;
		int idxRight = right;
		while(idxLeft < idxRight) {
			while((arr[idxLeft] <= arr[pivot]) && (idxLeft <= idxRight)) idxLeft++;
			while((arr[idxRight] > arr[pivot]) && (idxLeft <= idxRight)) idxRight--;
			
			if(idxLeft <= idxRight) {
				swap(arr, idxLeft, idxRight);
				if(idxRight==pivot) { 
					return idxLeft;
				}
			}
			
		}
		swap(arr, pivot, idxRight);
		return idxRight;
	}
	
	private void swap(int[] arr, int idxLeft, int idxRight) {
		int temp = arr[idxLeft];
		arr[idxLeft] = arr[idxRight];
		arr[idxRight] = temp;
	}
	
}
