
public class Nested_loops_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i,j,k;
	for(i=0;i<=4;i++)
	{
		for(k=1;k<5-i;k++)
		{
			System.out.println("    ");
		}
		for(j=0;j<=1;j++)
		{
			if((i+j)%2==0)
			{
				System.out.println("1");
			}else
			{
				System.out.println("0");
			}
		}
		System.out.println();
	}
	}
}