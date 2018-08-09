package HackerRank;

import java.util.ArrayList;
import java.util.Random;

public class TwoSum {
	
	/*
	 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	 * You may assume that each input would have exactly one solution.
	 * @Author HeavyTech 2018
	 * 
	 */

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int randomArray [] = setRandomArray();

		ArrayList<Integer> result = twoSum(randomArray,3,arr);
		print(result);
		
	}

	public static ArrayList<Integer> twoSum(int[] nums, int target, ArrayList<Integer> arr) {
		for(int i = 0; i < nums.length-1; i ++) {
			for(int j = 1 ; j < nums.length-1; j++) {
				if(nums[i] + nums[j] == target) {
					arr.add(i);
					arr.add(j);
				}	
			}
		}
		return arr;
	}
	public static int []  setRandomArray() {
		Random rand = new Random();
		int[] arr = new int[4];
		
		for (int i = 0; i < arr.length; i++) {
			int randNumber = rand.nextInt((5-1) + 1) +1;
		    arr[i] = randNumber;
		}
		return arr;
	}

	public static void print(ArrayList<Integer> arr) {
		for(Integer x : arr) {
			System.out.print(x + " ");
		}
	}

}
