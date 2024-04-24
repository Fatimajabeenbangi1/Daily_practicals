import java.util.Scanner;

public class palindromeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int r,sum=0,temp;
		temp=num;
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum)
			System.out.println("it is a palindrome number");
		else
			System.out.println("it is not a palindrome number");

	}

}