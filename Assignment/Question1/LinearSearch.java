package Assignment;

public class LinearSearch {
	public static int linearSearch(int arr[],int key) {
		int n =arr.length;
		for(int i = 0;i < n;i++) {
			if(key == arr[i]) {
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,7,8,12,68,75};	
		int searchKey = 7;
		System.out.println(" key "+searchKey+ " index is present at: "+linearSearch(arr,searchKey));
	}

}
