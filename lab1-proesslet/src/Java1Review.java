/**
 * Implement each of the 10 methods tested in JUnitTests.java. Study the tests
 * to determine how the methods should work.
 */
public class Java1Review {

	public static void main(String[] args) {
		// If you want to write your own tests, do so here. (Do not modify
		// JUnitTests.java.) To run this method in Eclipse, right-click
		// Java1Review.java in the Package Explorer and select "Run As" >
		// "Java Application" from the context menu.
	
	}
	
	static double divide(double num1, double num2) {
		double answer = num1 / num2;
		return answer;
	}
	
	static int divide(int num1, int num2) {
		int answer = num1 / num2;
		return answer;
	}
	
	static boolean isDivisibleBy7(double num) {
		boolean divisibleBy7;
		double remainder = num % 7.0;
		if (remainder == 0.0) {
			divisibleBy7 = true;
			return divisibleBy7;
		}
		else {
			divisibleBy7 = false;
			return divisibleBy7;
		}
	}
	
	static String main(String enteredString) {
		String stringToReturn = "Overloaded main method was passed \"" + enteredString + "\".";
		
		return stringToReturn;
	}
	
	static int findMin(int num1, int num2, int num3) {
		int smallestInt = num1;
		if (num2 < smallestInt) {
			smallestInt = num2;
		}
		if (num3 < smallestInt) {
			smallestInt = num3;
		}
		
		return smallestInt;
	}
	
	static int findMin(int[] array) {
		// Set smallestInt as first number in array to begin
		int smallestInt = array[0];
		int currentInt;
		// Set previousInt as first number in array to begin
		int previousInt = array[0];
		
		for (int i = 0; i < array.length; i++) {
			currentInt = array[i];
			
			if (currentInt < previousInt) {
				smallestInt = currentInt;
			}
			
			previousInt = currentInt;
			
		}
		
		
		return smallestInt;
	}
	
	static double average(int[] array) {
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			total = total + array[i];
		}
		
		double average = total / array.length;
		
		return average;
	}
	
	static String[] toLowerCase(String[] array) {
		
		
		for (int i = 0; i < array.length; i++) {
			String currentWord = array[i];
			array[i] = currentWord.toLowerCase();
		}
		
		return array;
	}
	
	static String[] toLowerCaseCopy(String[] Strings) {
		String[] newArray = new String[Strings.length];
		
		for (int i = 0; i < Strings.length; i++) {
			String currentWord = Strings[i];
			newArray[i] = currentWord.toLowerCase();
		}
		
		return newArray;
	}
	
	static int[] removeDuplicates(int[] array) {
		// Only check for duplicates if more than 1 number exists in the array
		if (array.length > 1) {
			for (int i = 0; i < array.length; i++) {
				int numToCompare = array[i];
				for (int j = 0; j < array.length; j++) {
					// Don't compare an index to itself
					if (i != j) {
						if (numToCompare == array[j]) {
							array[j] = 0;
							array[i] = 0;
						}
					}
				}
			}
		}
		
		return array;
	}

}
