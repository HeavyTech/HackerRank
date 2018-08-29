package HackerRank;

public class LinearSearch {

	public static void main(String[] args) {
		int arr [] = {1,4,3,4,5,6,9,4,1};
		
		System.out.println("Index at : " + linearSearch(arr,5));
	}
	
	public static int linearSearch(int  [] arr,int key) {
		for(int i =0; i < arr.length-1 ;i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

}
