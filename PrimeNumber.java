import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	 int Number;
		
	  Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter Number1");
	    Number = sc.nextInt();
	   
	   if(Number==0)
		   System.out.println(Number+" "+"is Neither prime nor composite");
	   
	   else if(Number>0)
		   System.out.println(Number+" "+"is a prime num");
	   
	   else
		   System.out.println(Number+" "+"is not a prime Number");
	}
}
		
