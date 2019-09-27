package data_structure;

public class MissNum {
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,5,6,7,8};
		System.out.println("missing number "+ findMissNum(arr));
	}
		
	public static int findMissNum(int[] arr) {
		int n = arr.length+1;
		int sum = n*(n+1)/2;
		int presum = 0 ;
		for(int i=0;i<arr.length;i++) {
			presum = presum + arr[i];
		}
		int missNum = sum - presum ; 
		return missNum;
			
	}
		
}
