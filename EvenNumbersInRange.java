import java.util.Scanner;

public class EvenNumbersInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the minimum value: ");
		int minVal = sc.nextInt();
		
		System.out.println("Enter the maximum value: ");
		int maxVal = sc.nextInt();
		
		System.out.println("Even numbers between " + minVal + " and " + maxVal + " are:");
		displayEvenNumbers(minVal, maxVal);
	

	}
	public static void displayEvenNumbers(int minVal, int maxVal) {
		for (int num = minVal; num <=maxVal; num++) {
			if (num % 2 ==0) {
				System.out.println(num + " " );
			}
		}
	}

}
