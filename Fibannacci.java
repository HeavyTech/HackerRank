package HackerRank;

import java.util.Scanner;
/*
 * 3) Write a function that computes the list of the first 100 Fibonacci numbers.
 *  By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each
 * subsequent number is the sum of the previous two. As an example, here are the first 10 Fibonnaci 
 * numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, and 34.
 * 
 * 
 */
public class Fibannacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter A Fibonacci");
		
		int num = input.nextInt();
		System.out.println(fibonacciSeries(num));
		
		input.close();
		
	
	}
	
	public static int fibonacciSeries(int n) {
		if(n < 0) {
			return n;
		}
		if(n < 1) {
			return 1;
		}
		return fibonacciSeries(n-1) + fibonacciSeries(n-2);
		
	}

}
