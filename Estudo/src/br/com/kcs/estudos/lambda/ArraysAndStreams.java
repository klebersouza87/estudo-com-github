package br.com.kcs.estudos.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysAndStreams {	

	public static void main(String[] args) {
		
		Integer[] values = {3, 7, 1, 10, 8, 6, 9, 2, 5, 4};
		
		System.out.printf("Original Values: %s%n", 
				Arrays.asList(values));
		
		System.out.printf("Sorted Values: %s%n", 
				Arrays.stream(values)
				.sorted()
				.collect(Collectors.toList()));
		
		System.out.print("Sorted Values2: "); 
				Arrays.stream(values)
				.sorted()
				.forEach(value -> System.out.printf("%s ", value));
				System.out.println();
		
		List<Integer> greaterThan4 = Arrays.stream(values)
		.filter(value -> value > 4)
		.collect(Collectors.toList());		
		System.out.printf("Values greater than four: %s%n", greaterThan4);
		
		System.out.printf("Sorted values greater than 4: %s%n", 
				Arrays.stream(values)
				.filter(value -> value > 4)
				.sorted()
				.collect(Collectors.toList()));
		
		System.out.printf("Values greater than 4 (ascending with streams): %s%n", 
				greaterThan4.stream()
				.sorted()
				.collect(Collectors.toList()));
	}

}
