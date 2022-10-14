package io.javabrains.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.javabrains.common.Person;

public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		// Step 1: Sort list by last name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		// Step 2: Create a method that prints all elements in the list
		System.out.println("Printing all persons");
		printConditionally(people, person -> true, person -> System.out.println(person));
		
		// Step 3: Create a method that prints all people that have last name beginning with C
		System.out.println("Printing all persons with last name beginning with C");
		printConditionally(people, person -> person.getLastName().startsWith("C"), person -> System.out.println(person));

		System.out.println("Printing all persons with first name beginning with C");
		
		printConditionally(people, person -> person.getFirstName().startsWith("C"), person -> System.out.println(person));
		
	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}
}

