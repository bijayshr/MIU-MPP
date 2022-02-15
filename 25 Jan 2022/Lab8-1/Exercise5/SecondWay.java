package Lab8.Exercise5;

import java.util.Arrays;
import java.util.List;


public class SecondWay {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		list.forEach(s -> System.out.println(s.toUpperCase()));
	}
}