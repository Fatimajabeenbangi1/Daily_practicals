class Demo
{
   void display()
   {
      System.out.println("Hello");
    
   }
   void show()
   {
       this.display();
   
   }
   public static void main(String[]args)
   {
       Demo d = new Demo();
	   d.show();
   }
   
     
 
}