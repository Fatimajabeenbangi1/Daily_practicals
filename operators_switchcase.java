import java.util.Scanner;

public class operators_switchcase {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Arithmetic\n 2. Assignment\n 3.Bitwise\n 4.Logical\n 5.Ternary");
        int choice = sc.nextInt();
        
        switch(choice) {
        case 1:
        	System.out.println("You selected Arithmetic operator Addition");
        	System.out.println("Enter a two numbers:");
        	int num1 = sc.nextInt();
        	int num2 = sc.nextInt();
        	System.out.println("Addition result:" + num1+num2);
        	System.out.println("Substraction result:" + (num1-num2));
        	System.out.println("Multiplication result:" + (num1*num2));
        	System.out.println("Division result:" + (num1/num2));
        	System.out.println("Modulus result:" + (num1%num2));
        	break;
        	
        case 2:
        	System.out.println("You selected Assignment operator Assignment:");
        	int value;
        	System.out.println("Enter the value to be assigned");
        	value = sc.nextInt();
        	System.out.println("Assigned value:" + value);
        	value += 5;
        	System.out.println("value is: " +value);
        	value -= 5;
        	System.out.println("value is: " +value);
        	break;
        case 3:
        	System.out.println("you selected Bitwise operator AND:");
        	System.out.println("Enter two numbers num1 and num2: ");
        	int num3 =sc.nextInt();
        	int num4 =sc.nextInt();
        	int result = num3 & num4;
        	System.out.println("Bitwise AND result: " +result);
        	result= num3^num4;
        	System.out.println("Bitwise XOR result: " +result);
        	result= num3 | num4;
        	System.out.println("Bitwise OR result: " +result);
        	break;
        case 4:
        	System.out.println("you selected Logical operator Logical AND:");
        	boolean bool1 = true;
        	boolean bool2 = false;
        	boolean result2 = bool1 && bool2;
        	System.out.println("Logical AND result: "+result2);
        	result2 = bool1 || bool2;
        	System.out.println("Logical OR result: "+result2);
        	result2 =!( bool1 || bool2);
        	System.out.println("Logical NOT result: "+result2);
        	break;
        case 5:
        	System.out.println("You selected Ternary operator(check if positive or not):");
        	System.out.println("Enter a number");
        	int number = sc.nextInt();
        	String result3 = (number >=0) ? "positive" : "Negative";
        	System.out.println("Number is: " +result3);
        	break;
        	default:
        		System.out.println("Invalid choice....");
        	
        	
        }
	}

}
