package seleniumPractise;

import java.util.Arrays;

public class JavaQuestionsPractise {

	public static void main(String[] args) {

		JavaQuestionsPractise p = new JavaQuestionsPractise();

//		p.swapTwoNumber(3, 7);
//		p.findFactorial(5);
//		p.checkPrimeNumber(2);
//		p.reverseString("LearnCoding");
//		p.checkPalindrome("Madams");
//		int[] numArray = { 1, 4, 9, 2, 7 };
//		p.largestInArray(numArray);
		p.findCountOfVowels("LearningJavau");

	}

	// Program to Find Factorial of a Number in Java
	public void findFactorial(int number) {

		int facto = 1;
		if (number == 0) {
			System.out.println("Zero is invalid");
		} else {

			for (int i = 1; i <= number; i++) {

				facto = facto * i;

			}
			System.out.println("Factorial of the given number is:" + " " + facto);

		}

	}

	// Program to check if a given number is prime

	public boolean isPrime(int number) {

		for (int i = 2; i <= Math.sqrt(number); i++) {

			if (number % i == 0) {
				return false;
			}

		}
		return true;

	}

	// Program to check if a given number is prime or not prime
	public void checkPrimeNumber(int pnumber) {

		if (this.isPrime(pnumber) == true) {
			System.out.println(pnumber + " " + "is a Prime number");
		} else {
			System.out.println(pnumber + " " + "is a not Prime number");
		}
	}

	// Program to Swap Two Numbers
	public void swapTwoNumber(int a, int b) {

		int temp = a;
		a = b;
		b = temp;

		System.out.println("Now a is:" + a + " " + "and" + " " + "b is:" + b);

	}

	// program to reverse a string without using built-in functions

	public String reverseString(String givenString) {

		// String givenString = "LearningJava";

		char[] charArray = givenString.toCharArray();

		int left = 0;
		int right = charArray.length - 1;
		char temp;

		while (left <= right) {

			temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;

			left++;
			right--;
		}
		String reveresedString = new String(charArray);

		System.out.println(reveresedString);
		return reveresedString;

	}

	public void checkPalindrome(String givenString) {

		String reveresedString = this.reverseString(givenString);

		if (reveresedString.equalsIgnoreCase(givenString)) {
			System.out.println(givenString + " " + "is a Palindrome");
		} else {
			System.out.println(givenString + " " + "is Not a Palindrome");
		}

	}

	// Program to find the largest and smallest number in an array.

	public void largestInArray(int[] numbers) {

		Arrays.sort(numbers);

		int last = numbers.length - 1;

		System.out.println(numbers[last] + " " + "is the largest number in the array");

	}

	// Java program to count the number of vowels and consonants in a string.

	public void findCountOfVowels(String givenWord) {

		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		char[] givenWordArray = givenWord.toCharArray();
		
		int vowelCount = 0;

		for (int i = 0; i <= givenWordArray.length - 1; i++) {

			for (int j = 0; j <= vowels.length - 1; j++) {

				if (givenWordArray[i] == vowels[j]) {

					System.out.println(givenWordArray[i] + " " + "is a vowel");
					
					vowelCount++;
					
					//System.out.println(vowelsFound.length());
					
					
				}

			}

		}

	}

}
