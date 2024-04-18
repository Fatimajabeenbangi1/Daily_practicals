
public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Digit1 =0;
		int Digit2 = 78;
		int res=1;
		
		while(Digit1<=Digit2) {
			res=Digit1+res;
			System.out.println(Digit1);
			Digit1=res;
			res++;
			
		}

	}

}
