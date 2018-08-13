package HackerRank;
import java.util.Random;


public class MergingTwoLIst {

	public static void main(String[] args) {
		int arr1[] = randArray(20);
		int arr2[] = randArray(20);
		int mergedArr[] = mergeArray(arr1, arr2);
		
		System.out.println();
		for(Integer x: mergedArr) {
			System.out.print(x + " ");
		}

	}
	public static int[] mergeArray(int[] arr1, int[] arr2) {
		int tempArr[] = new int[arr1.length+arr2.length];
		int x = 0;
		
		for(int i = 0; i < arr1.length; i++) {
				tempArr[x++] = arr1[i];
				tempArr[x++] = arr2[i];		
		}
		return tempArr;
	}

	public static int[] randArray(int size) {
		Random rand = new Random();
		int arr[] = new int[size];
		for(int x = 0; x < size; x++) {
			int randNumber = rand.nextInt((20-1) + 1) +1;
		    arr[x] = randNumber;
		}
		return arr;
	}
	
}
