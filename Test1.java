import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite
  {
	  void readFile() throws FileNotFoundException
	  {
		  FileInputStream fis = new FileInputStream("d:/abc.txt");
		  
	  }
	  void saveFile() throws FileNotFoundException
	  {
		  String txt = "This is demo";
		  FileOutputStream fos = new FileOutputStream("d:xyz.txt");
		  
	  }
	
}
class Test1
{
	  public static void main(String[]args)
      {
	       ReadAndWrite rw= new ReadAndWrite();
	       try
	       {
		      rw.readFile();
	       }
	       catch(FileNotFoundException e)
	       {
             e.printStackTrace();
	       }
	       try
	       {
		       rw.saveFile();  
	       }
	       catch(FileNotFoundException e)
	       {
		      e.printStackTrace();
	       }
		   System.out.println("hello");
	        
    }

}