package HackerRank;

public class ShiftingArray {
	/*Program will shift the array to the left by any given rotation 
	 * @Author HeavyTech 2018
	 * 
	 */

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,7};
		print(arr);
		shiftArrayRight(arr,2);
		print(arr);
	
	}
	
	public static void shiftArrayRight(int [] arr ,int n) {
		int temp;
		for(int i = 0; i < n; i ++) {
			for(int j = arr.length-1; j > 0;j--) {
				temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
			}
		}
}
	public static void shiftArrayLeft(int [] arr , int n) {
		int temp; 
		for(int i = 0; i < n;i ++) {
			for(int j = 0; j < n;j++) {
				temp = arr[j];
				arr[j] = arr[j+1]; 
				arr[j+1]= temp;
			}
		}
		
	}
	public static void print(int [] arr) {
		for(Integer x : arr) {
			System.out.print(x + " ");
		}
	}

}


