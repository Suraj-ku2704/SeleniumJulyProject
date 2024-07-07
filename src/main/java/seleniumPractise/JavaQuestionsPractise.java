package seleniumPractise;

public class JavaQuestionsPractise {

	public static void main(String[] args) {

		JavaQuestionsPractise p = new JavaQuestionsPractise();
		
		p.swapTwoNumber(3, 7);
		p.findFactorial(5);
		p.CheckPrimeNumber();
		p.reverseString("LearnCoding");

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

	//Program to check if a given number is prime or not prime
	public void CheckPrimeNumber() {
		int pnumber = 2;

		JavaQuestionsPractise c = new JavaQuestionsPractise();

		if (c.isPrime(pnumber) == true) {
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

	public void reverseString(String givenString) {

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
		
	}

}
