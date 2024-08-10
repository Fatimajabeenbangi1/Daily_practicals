class underAgeException extends Exception
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
class voting {
    public static void main(String[] args) {
        int age = 16;

        try {
            if (age < 18) {
                throw new underAgeException("You cannot vote as your age is below 18");
            } else {
                System.out.println("You can vote now");
            }
        } catch (underAgeException e) {
            e.printStackTrace();
        }
		System.out.println("hello");
    }
}




