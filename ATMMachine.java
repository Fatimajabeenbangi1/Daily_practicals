package ATMMachine;

import java.util.Scanner;

class ATM{
	float Balance;
	int PIN = 7465;
	
	public void checkpin() {
		System.out.println("Enter your PIN:");
		Scanner sc = new Scanner(System.in);
		int enterpin = sc.nextInt();
		if(enterpin==PIN) {
			menu();
		}
		else {
			System.out.println("Enter a valid Pin");
			}
		}
		
		public void menu () {
			System.out.println("Enter your choice: ");
			System.out.println("1.Check A/C Balance");
			System.out.println("2.Withdraw Money");
			System.out.println("3.Deposite Money");
			System.out.println("4.Exit");
			
			Scanner sc = new Scanner(System.in);
					int  opt = sc.nextInt();
					
					if(opt == 1) {
						CheckBalance();
					}
					if (opt == 2) {
						WithdrawMoney();
					}
					else if(opt == 3) {
						depositMoney();
					}
					else if (opt == 4) {
						return;
					}
						System.out.println("Enter a valid choice");
					
		}
		public void CheckBalance() {
			System.out.println("Balance: " + Balance);
			menu();
		}
		
		public void WithdrawMoney() {
			System.out.println("Enter Amount to Withdraw :");
			Scanner sc = new Scanner(System.in);
			float amount = sc.nextFloat();
			if(amount > Balance) {
				System.out.println("Insufficient Balance");
			}
			else {
				Balance = Balance - amount;
				System.out.println("Money Withdrawl Successful");
			}
			
			menu();
		}
		
		public void depositMoney() {
			System.out.println("Enter the Amount : ");
			Scanner sc = new Scanner(System.in);
			float amount = sc.nextFloat();
			Balance = Balance * amount;
			System.out.println("Money Deposite Successfully");
			
		
		
	}

	private void menu1() {
		// TODO Auto-generated method stub
		
	}
	
}

public class ATMMachine {

	public static void main(String[] args) {
      ATM obj = new ATM();
      obj.checkpin();
	}

}
