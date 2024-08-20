import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DivisibleBy13 {

	public static void main(String[] args) {
		List<Integer> my_list = Arrays.asList(12, 65, 54, 39, 102, 339, 221, 50, 70);
		
		List<Integer> divisibleBy13 = my_list.stream()
				                             .filter(number -> number % 13 ==0)
				                             .collect(Collectors.toList());
		
		System.out.println("Numbers divisible  by 13: " + divisibleBy13);
	}

}
