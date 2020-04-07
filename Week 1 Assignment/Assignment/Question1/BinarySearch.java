package Assignment;

public class BinarySearch {
	public static int binarySearchRecursive(int arr[],int start,int end,int key) {
		if(start < end) {
			int mid = start + (end-start)/2;
			if(key < arr[mid]) {
				return binarySearchRecursive(arr,start,mid,key);
			}
			else if(key > arr[mid]) {
				return binarySearchRecursive(arr,mid+1,end,key);
			}
			else {
				return mid;
			}
		}
		return -(start+1);
		
	}
	public static void main(String[] args) {
		int arr[] = {26,35,434,667,976,990,986,989};
		int index = binarySearchRecursive(arr,0,arr.length,35);
		System.out.println("index is" +index);
		 
	}

}
