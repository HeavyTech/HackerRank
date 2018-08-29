package HackerRank;

import java.util.Scanner;

/*Program will do a binary search. List HAS to be sorted. 
 * @Author HeavyTech 2018
 */

public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		int arr [] = new int [size];
		
		
		for(int i = 0; i < size;i ++) {
		
			arr[i] = (i*2) +1;
		}	
		System.out.println("Target is " + 3);
		print(arr);
		System.out.println("Target found at index : " + binarySearch(arr,3));
		input.close();

	}
	
	public static int binarySearch(int [] arr, int target) {
		//function will retun -1 if no target found. 
		int low = 0;
		int high = arr.length-1;
		
		while(low <= high) {
			int mid = ((low + high)/2);
			
			if(arr[mid] == target){
				return mid;
			}
			else if(arr[mid] < target) {
				low = mid + 1;
			}
			else if(arr[mid] > target) {
				high = mid-1;
			}	
		}
		return -1;
	}
	public static void print(int arr []) {
		for(Integer x : arr) {
			System.out.print(x + " ");
		}
	}

}
