class Test
{
	int i;
	void SetValue(int x)
	{
		this.i=x;
		
	}
	void show()
	{
		System.out.println(i);
	}
	public static void main(String[]args)
	{
		Test t = new Test();
		t.SetValue(10);
		t.show();
	}
	
}
	
