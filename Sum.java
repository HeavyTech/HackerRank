package HackerRank;

public class Sum {
	
	/*
	 * 1) Write three functions that compute the sum of the numbers in a given list using a for-loop,
	 *  a while-loop, and recursion.
	 *  @Author HeavyTech 2018
	 */

	public static void main(String[] args) {
		
		int [] array = { 1, 4 , 6 , 7};
		
		System.out.println("Using a for loop  sum : "  + forLoopSum(array));
		System.out.println("Using a while loop sum : " + whileLoopSum(array));
		System.out.println("Using a Recursive loop sum : " + recursiveSum(array,array.length-1));
		

	}
	
	public static int forLoopSum(int [] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length ;i ++) {
			sum += arr[i];
		}
		return sum;
	}
	public static int whileLoopSum(int [] arr) {
		int sum = 0;
		int i = 0;
		while( i < arr.length) {
			sum+=arr[i];
			i++;
		}
		return sum;
	}
	public static int recursiveSum(int [] arr, int n) {
		if(n < 0) {
			return arr[n];
		}
		if(n == 0) {
			return arr[n];
		}
		return arr[n]  + recursiveSum(arr,n-1); 
	}

}
