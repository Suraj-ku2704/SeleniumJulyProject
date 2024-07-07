package seleniumPractise;

public class Practise02 {

	public static void main(String[] args) {

		Practise02 p = new Practise02();

		// Program to Swap Two Numbers
		p.swapTwoNumber();

	}

	public void swapTwoNumber() {

		int a = 3;
		int b = 7;

		int temp = a;
		a = b;
		b = temp;

		System.out.println("Now a is:" + a + " " + "and" + " " + "b is:" + b);

	}

}
