package Assignment;
import java.util.Arrays;
public class Question2 {
	public static void main(String[] args) {
		int arr1[] = {5,15,25,35,45,55,65};
		int arr2[] = {10,20,30,40,50,60};
		int  i = 0, j = 0, k = 0;
		int arr3[] = new int[arr1.length+arr2.length];
		while(i<arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]){
				arr3[k] = arr1[i];
				i++;
			}
			else {
				arr3[k] = arr2[j];
			}
		}
		if(i < arr1.length) {
			System.arraycopy(arr1, i, arr3, k, (arr1.length - i));
		}
		if(j < arr2.length) {
		 System.arraycopy(arr2,j,arr3,k,(arr2.length - j));
		}
		System.out.println("Sorted Array" + Arrays.toString(arr3));		
	}

}
