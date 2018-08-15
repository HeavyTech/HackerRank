package HackerRank;
import java.util.Arrays;
public class MedianSortedArray {

	/*
	 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
	Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
	You may assume nums1 and nums2 cannot be both empty.
	 * nums1 = [1, 2]
	   nums2 = [3, 4]

       The median is (2 + 3)/2 = 2.5
       @Author HeavyTech 2018
	 */
	
	public static void main(String[] args) {
		int [] nums1 = {1,2};
		int [] nums2 = {3,4};
		
		int [] mergedArray = mergeArray(nums1,nums2);
		Arrays.sort(mergedArray);
		print(mergedArray);
		System.out.println("median is : " + median(mergedArray));

	}
	
	public static double median(int [] arr) {
		double median;
		if (arr.length % 2 == 0) {
		    median = (double)(arr[arr.length/2] + arr[arr.length/2 -1])/2;
		}else {
		    median = arr[arr.length/2];
		}
		return median;
		
	}
	
	public static int []  mergeArray(int[] nums1, int[] nums2) {
		int temp [] = new int [nums1.length + nums2.length];
		int x = 0;	
		
		for(int i = 0; i < nums1.length; i++) {
				temp[x] = nums1[i];
				x++;
		}
		for(int i = 0; i < nums2.length;i++) {
			temp[x++] = nums2[i];
					
		}
		return temp;  
    }
	public static void print(int [] arr) {
		for(Integer x : arr) {
			System.out.print(x + " ");
		}
	}

}
