package Lab8.Exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class FirstWay {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");

		Function<String, String> func = String::toUpperCase;
		list.forEach(s -> System.out.println(func.apply(s)));
	}


}