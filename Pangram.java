package HackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pangram {
	
	/*
	 * Program will evaluate a sentence to see if it's Pangram. 
	 * A sentence that uses every letter of the alphabet. 
	 * 
	 * @HeavyTech 2018
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();
	
		//Adding the keys and values to maps
		int counter=1;
		for( char ch = 'a'; ch <='z';ch++) {
			map.put(String.valueOf(ch), counter++);
		}
		
		String sentence = input.nextLine().toLowerCase();
		System.out.println(sentence  + " is a Pangram :  " +  checkPangram(sentence,map));
		input.close();
	}

	public static boolean checkPangram(String sentence, Map<String, Integer> map) {
		boolean isPangram = false;
		for(String name : map.keySet()) {
			String key = name.toString();
			
			//Must check that it contains all letters 
			if(sentence.length() < 26) {
				isPangram = false;
			}
			if(!sentence.contains(key)) {
				isPangram = false;
			}else {
				isPangram = true;
			}	
		}	
		return isPangram;		
	}
			
}

	

