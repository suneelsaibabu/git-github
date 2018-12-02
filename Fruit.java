package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Fruit {
	public static void main(String[] args) {
		List<String> fruits=new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Bana");
		Stream<String> fruitStream=fruits.parallelStream();
		fruitStream.filter(fruit->{
			System.out.println("fruits:"+fruit);
		})
		
	}.forEach(fruit->{});

}
