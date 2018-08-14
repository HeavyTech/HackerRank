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
	 */
	
	public static void main(String[] args) {
		int [] nums1 = {1,2};
		int [] nums2 = {3,4};
		
		int [] mergedArray = mergeArray(nums1,nums2);
		
		print(mergedArray);
		System.out.println();
		Arrays.sort(mergedArray);
		print(mergedArray);
		System.out.println();
		
		System.out.println(findMedianSortedArrays(mergedArray));
		
		
		

	}
	 public static double findMedianSortedArrays(int[] arr) {
	        double median = arr.length /2;
	        return median;
	    }
	

	
	public static int []  mergeArray(int[] nums1, int[] nums2) {
		int temp [] = new int [nums1.length + nums2.length];
		int x = 0;
		for(int i = 0; i < nums1.length; i++) {
				temp[x++] = nums1[i];
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
