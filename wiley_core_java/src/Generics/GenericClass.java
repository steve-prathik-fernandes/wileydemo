package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericClass {
	public static void main(String[] args) {
		Printer<Cat> printer = new Printer(new Cat());
		printer.print();

		Printer<Dog> printer1 = new Printer(new Dog());
		printer1.print();

		ArrayList<Object> cats = new ArrayList<>();
		cats.add(new Cat());
		cats.add(new Cat());
		cats.add(new Dog());

//		shout("Tame me to movie");
//		shout("Bring necklace");
//		shout("Amount",200000000);
//		shout(new Dog());

		List<Integer> intList = new ArrayList<>();
		intList.add(3);
		printList(intList);

		List<Integer> catList = new ArrayList<>();
		intList.add(3);
		printList(catList);
	}

	private static void printList(List<?> myList) {
		System.out.println(myList);
	}

	private static <T, V> void shout(T shoutOut, V valtoBring) {
		System.out.println(shoutOut + "@$!!#!!!!!!");
		System.out.println(valtoBring + "@$!!#!!!!!!");
	}
}
