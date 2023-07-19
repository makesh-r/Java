
import java.util.Arrays;

import java.util.Comparator;

public class TestPress {

	public static void main(String[] args) {
		
		getReversedString("codec");
		
		isPrimeNumber(2);
		
		getLargestNumber(new int[] {54, 546, 548, 60});
		
		reverseNumber(899);
		
		minmaxElement(new int[] {54, 546, 548, 60});
		
	}
	
//	1. Print the reverse of the given string.
	
	public static void getReversedString(String str) {

		StringBuilder reversedString = new StringBuilder();
		int length = str.length();
		
		for(int i = length-1; i >= 0; i--) {
			reversedString.append(str.charAt(i));
		}
		
		System.out.println(reversedString.toString());
	}
	
	
//	2. Given a number, check whether it is a prime number or not.
	
	public static void isPrimeNumber(int number) {
		boolean isPrime = true;
		if(number < 2) {
			System.out.println("No");
		}
		else if(number == 2) {
			System.out.println("yes");
		}
		else {
			for(int i = 2; i <= number/2; i++) {
				if(number%i == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}

//	3. Given an array of numbers, arrange them in a way that it forms the largest value.

	public static void getLargestNumber(int[] numbers) {
		
		String[] nums = new String[numbers.length];
		
		for(int i = 0; i < numbers.length; i++) {
			nums[i] = String.valueOf(numbers[i]);
		}
		
		Comparator<String> stringComparator = new Comparator<String>() {
			public int compare(String x, String y) {
				String xy = x + y;
				String yx = y + x;
				
				return xy.compareTo(yx) > 0 ? -1 : 1;
			}
		};
		
		Arrays.sort(nums, stringComparator);
		
		StringBuilder largestNumber = new StringBuilder();
		
		for(String num : nums) {
			largestNumber.append(num);
		}
		
		System.out.println(largestNumber.toString());
		
	}
	
//	4. Given a number N, print reverse of number N.

	public static void reverseNumber(int number) {
		int reversedNumber = 0;
		
		while(number != 0){
			int lastDigit = number%10;
			reversedNumber = 10*reversedNumber + lastDigit;
			number /= 10;
		}
		
		System.out.println(reversedNumber);
	}
	
//	5. Given an array of numbers, find the maximum and minimum element in the array.
	
	public static void minmaxElement(int[] numbers) {
		
		int minElement = Integer.MAX_VALUE;
		int maxElement = Integer.MIN_VALUE;
		
		for(int num : numbers) {
			
			if(num < minElement) {
				minElement = num;
			}
			
			if(num > maxElement) {
				maxElement = num;
			}
		}
		
		System.out.println("Minimum element: " + minElement);
		System.out.println("Maximum element: " + maxElement);
	}

}
