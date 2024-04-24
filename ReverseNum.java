import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number =sc.nextInt();
		int rev =0;
		
		while(number !=0)
		{
			int rem = number %10;
			rev = rev *10 + rem;
			number /=10;
		}
		System.out.println(rev);

	}

}
