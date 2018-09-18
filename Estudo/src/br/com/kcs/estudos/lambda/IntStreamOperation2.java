package br.com.kcs.estudos.lambda;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class IntStreamOperation2 {
	public static void main(String[] args) {
		int[] values = {7, 5, 10, 2, 1, 6, 9, 4, 8, 3};
		
		System.out.print("Original values: ");
		IntStream.of(values)
			.forEach(value -> System.out.printf("%d ", value));		
		System.out.println();
		System.out.println();
		
		System.out.println("Even values:");
		IntStream.of(values)
			.filter(value -> value % 2 == 0)
			.sorted()
			.forEach(System.out::println);
		System.out.println();
				
		IntStream.of(values)
			.filter(value -> value > 4)
			.peek(value -> System.out.printf("Values greater than four: "))
			.forEach(System.out::println);
			System.out.println();
			
		IntStream.of(1, 2, 3, 4, 5)
        	.filter(e -> e > 2)
        	.peek(e -> System.out.println("Filtered value: " + e))
        	.map(e -> e * e)
        	.peek(e -> System.out.println("Mapped value: " + e))
        	.sum();
		System.out.println();
		
		System.out.print("Even value greater than four: ");
		IntPredicate greaterThanFour = value -> value > 4;
		IntPredicate evenValue = value -> value % 2 == 0;
		IntStream.of(values)
			.filter(greaterThanFour.and(evenValue))
			.sorted()
			.forEach(value -> System.out.printf("%d ", value));
		System.out.println();
		
		System.out.println("Average: " + IntStream.of(values).average().getAsDouble());
		System.out.println("Max: " + IntStream.of(values).max().getAsInt());
		System.out.println("Sum: " + IntStream.of(values).sum());
		
		System.out.println("Sum with reduce method1: " + IntStream.of(values)
			.reduce(0, (x, y) -> x + y));
		System.out.println("Sum with reduce method2: " + IntStream.of(values)
			.reduce(0, Integer::sum));
		System.out.println("Sum with reduce method3: " + IntStream.of(values)
			.reduce(Integer::sum).getAsInt());
		
		System.out.println(IntStream.range(1, 10).count());
		System.out.println(IntStream.rangeClosed(1, 10).count());
	}
}
