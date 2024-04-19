import java.util.Scanner;

public class online_food_ordering_system
 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice,choice2, total=0;
		char ans;
		String order="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to BANGI HOTEL");
		do
		{
			System.out.println("Menue.");
			System.out.println("1.Startars");
			System.out.println("2.Main course");
			System.out.println("3.Deserts");
			System.out.println("4.SoftDrink");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
					System.out.println("1.Plain Sandwitch \t\t\t\t RS.175");
					System.out.println("2.French Fries \t\t\t\t RS.106");
					System.out.println("3.Tomato soup \t\t\t\t RS.89");
					System.out.println("4.Dosa(Butter)\t\t\t\t RS.125");
					System.out.println("5.Rice Idli \t\t\t\t RS.81");
					choice2=sc.nextInt();
					switch(choice2)
					{
					case 1:
						total+=175;
						order+="\nPlain Sandwitch \t\t RS.175";
						break;
						
					case 2:
						total+=106;
						order+="\nFrench Fries \t\t RS.106";
						break;
					case 3:
						total+=89;
						order+="\nTomato Soup \t\t RS.89";
						break;
					case 4:
						total+=125;
						order+="\nDosa(Butter) \t\t RS.125";
						break;
					case 5:
						total+=81;
						order+="\nRice Idli \t\t RS.81";
					}
						break;
					case 2:
						System.out.println("1.Mutton Biryani \t\t\t\t RS.190");
						System.out.println("2.Burger \t\t\t\t RS.250");
						System.out.println("3.Paneer Tikka \t\t\t\t RS.300");
						System.out.println("4.lazania \t\t\t\t RS.220");
						System.out.println("5.Italian Pizza \t\t\t\t RS.500");
						choice2=sc.nextInt();
						switch(choice2)
						{
						case 1:
							total+=190;
							order+="\nMutton Biryani \t\t RS.190";
							break;
						case 2:
							total+=250;
							order+="\nBurger\t\t RS.250";
							break;
						case 3:
							total+=300;
							order+="\nPaneer Tikka\t\t RS.300";
							break;
						case 4:
							total+=220;
							order+="\nlazania \t\t RS.220";
							break;
						case 5:
							total+=500;
							order+="\nItalian Pizza \t\t RS.500";
						}
							break;
					case 3:
						System.out.println("1.Chocolate Pudding \t\t\t\t RS.499");
						System.out.println("2.Strawberry Cake \t\t\t\t RS.400");
						System.out.println("3.Vanila Bean \t\t\t\t RS.140");
						System.out.println("4.Choco Almond \t\t\t\t RS.150");
						System.out.println("5.Kunda \t\t\t\t RS.100");
						choice2=sc.nextInt();
						switch(choice2)
						{
						case 1:
							total+=499;
							order+="\nChocolate Pudding \t\t RS.499";
							break;
						case 2:
							total+=400;
							order+="\nStrawberry Cake\t\t RS.400";
							break;
						case 3:
							total+=300;
							order+="\nVanila Bean\t\t RS.300";
							break;
						case 4:
							total+=140;
							order+="\nlazania \t\t RS.140";
							break;
						case 5:
							total+=100;
							order+="\nKunda \t\t RS.100";
						}
							break;
					case 4:
						System.out.println("1.Fruit Punch \t\t\t\t RS.150");
						System.out.println("2.Red Sea \t\t\t\t RS.150");
						System.out.println("3.Virgin Colada \t\t\t\t RS.150");
						System.out.println("4.Pomi Twist\t\t\t\t RS.150");
						System.out.println("5.Coco-Cola \t\t\t\t RS.150");
						choice2=sc.nextInt();
						switch(choice2)
						{
						case 1:
							total+=150;
							order+="\nFruit Punch \t\t RS.150";
							break;
						case 2:
							total+=150;
							order+="\nRed Sea\t\t RS.150";
							break;
						case 3:
							total+=150;
							order+="\nVirgin Colada\t\t RS.150";
							break;
						case 4:
							total+=150;
							order+="\nPomi Twist \t\t RS.150";
							break;
						case 5:
							total+=150;
							order+="\nCoco-Cola\t\t RS.150";
						}
							break;
							default :
								System.out.println("Invalid choice");
								break;
						}
			System.out.println("Do you want to add any other Item YES/NO");
			
			ans=sc.next().charAt(0);
						
						}
		while(ans=='Y'||ans=='y');
		System.out.println("Thanks for coming :) \nVisit Again");
		System.out.println("Your Order :\n"+order);
		System.out.println("Your total bill amount is : "+total);
		System.out.println("Pay by Gpay or CASH");
		
						
						}
					}
			
			
			