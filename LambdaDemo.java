package assignment;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaDemo {
	public static void main(String[] args) {
		
	
	List<Integer> number=Arrays.asList(1,2,3,4,5);
	List<Integer> result=number.stream().skip(2).collect(Collectors.toCollection(ArrayList::new));
    System.out.println(result.toString());
}}
