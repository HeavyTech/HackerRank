package HackerRank;

public class ShiftingArray {
	/*Program will shift the array to the left by any given rotation 
	 * @Author HeavyTech 2018
	 * 
	 */

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4};
		shiftArray(arr,2);
		print(arr);
		
	}
	
	public static void shiftArray(int [] arr ,int n) {
		int temp;
		for(int i = 0; i < n; i ++) {
			for(int j = arr.length -1; j > 0;j--) {
				temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
			}
		}
}			
	public static void print(int [] arr) {
		for(Integer x : arr) {
			System.out.println(x + " ");
		}
	}
}


