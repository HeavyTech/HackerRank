package HackerRank;

import java.util.Scanner;

public class SummingNthTerm {

	
	static int mod = 1000000007;
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter the test cases");
		int T = input.nextInt(); // Number of test cases
		long n; // Evaluate the integer 
		long sum = 0; //Holding the sum 
		

		for(int i = 0; i < T; i++) {
			//System.out.println("Testing the Test Cases");
			n = input.nextLong();
			//sum += (n*n) % mod;
			sum = (n * n) % mod;
			System.out.println(sum);
		}
		
		input.close();
	}

}
