package br.com.kcs.estudos.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArraysAndStreamss {

	public static void main(String[] args) {
		
		Integer[] values = {2, 9, 5, 1, 6, 3, 7, 4, 8, 10};
		
		System.out.printf("Original Values: %s%n",
		Arrays.asList(values)
			.stream()
			.collect(Collectors.toList()));
		
		System.out.printf("Original Values2: ");
		System.out.println(Arrays.asList(values));
		
		
		System.out.printf("Product of odd values: %s%n",
		Arrays.stream(values)
			.filter(value -> value % 2 != 0)
			.map(value -> value * value)
			.sorted()
			.collect(Collectors.toList()));
		
		List<Integer> greaterThanFive = Arrays.stream(values)
			.filter(value -> value > 5)
			.collect(Collectors.toList());
		
		System.out.println("Greater than five: ");
		greaterThanFive.stream()
			.sorted()
			.forEach(value -> System.out.println(value));
		
		System.out.println("Greater than five and only odd values: ");
		greaterThanFive.stream()
			.filter(value -> value % 2 != 0)
			.forEach(System.out::println);
		
		Integer[] values2 = {2, 9, 5, 1, 6, 5, 7, 2, 7, 10};
		
		Set<Integer> set = Arrays.stream(values2)
			.collect(Collectors.toSet());
		
		System.out.println("Set: " + set.toString());
	}

}
