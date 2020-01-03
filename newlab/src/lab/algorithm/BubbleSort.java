package lab.algorithm;

public class BubbleSort {

	private int []arr;
	
	public BubbleSort(int[] arr) {
		this.arr = arr;
		bubbleSort(arr);
	}

	public void getBubbleSort() {
		for(int val : this.arr) {
			System.out.print(val + " ");			
		}
	}
	
	private void bubbleSort(int[] arr) {
		for(int i=arr.length-1 ; i>0 ; i--) {
			for(int j=0 ; j<i ; j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
	}
	
	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
