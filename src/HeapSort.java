
public class HeapSort {

	public void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public void heapify(int[] arr,int n,int i){
		int largest = i;
		int l = 2*i+1;
		int r = 2*i+2;
		if(l<n && arr[l]>arr[largest]){
			largest = l;
		}
		if(r<n && arr[r]>arr[largest]){
			largest = r;
		}

		if(i!=largest){
			swap(arr, i, largest);
			heapify(arr, n, largest);
		}
	}

	public void sort(int[] arr,int n){
		for(int i = n/2-1;i>=0;i--){
			heapify(arr, n, i);
		}
		for(int i=n-1;i>=0;i--){
			swap(arr, 0, i);
			heapify(arr, i, 0);
		}
	}

	void printArray(int[] arr, int n)
	{
		for (int i=0; i<n; ++i)
			System.out.println(arr[i]);
	}

	public static void main(String[] args) {
		int[] arr = {2,5,10,13,7,8,3};
		HeapSort heapSort = new HeapSort();
		heapSort.sort(arr, arr.length);
		heapSort.printArray(arr, arr.length);
	}

}
