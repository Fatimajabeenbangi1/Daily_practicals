import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExculdeCharacter {

	public static void main(String[] args) {
     List<String > my_list = Arrays.asList("f", "t", "r", "f", "m", "x");
     
     List<String > newlist = my_list.stream()
    		                         .filter(ch -> !ch.equals("f"))
                                     .collect(Collectors.toList());
                                     
                                     System.out.println("List without 'f':"+ newlist );
	} 

}
