class underAgeException extends RuntimeException
{
	underAgeException()
	{
		super("you are under age");
	}
	underAgeException(String message)
	{
		super(message);
	}
}
class voting1{
	public static void main(String[]args){
		int age = 17;
		
		try {
			if(age < 18){
				throw new underAgeException("you cannot vote as your age is below 18");
			} else {
				
				System.out.println("you can vote now");
			}
		}catch ( underAgeException e){
				e.printStackTrace();
			
		}
	}
}



