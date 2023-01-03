package src.datastructure;

import src.databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		ArrayList<String> arrList=new ArrayList<String>();
		arrList.add("Steve");
		arrList.add("Tim");
		arrList.add("Lucy");
		arrList.add("Pat");
		arrList.add("Angela");
		arrList.add("Tom");

		//displaying elements
		System.out.println(arrList);

		//Removing "Steve" and "Angela"
		arrList.remove("Steve");
		arrList.remove("Angela");

		//displaying elements
		System.out.println(arrList);

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> newList = list.stream()
				.peek(System.out::println)
				.collect(Collectors.toList());

		System.out.println(newList);

		//  Use For Each loop and while loop with Iterator to retrieve data.

		for (String listElement : arrList) {
			System.out.print(listElement + " ");
		}

		// Iterating ArrayList using Iterator
		Iterator it = arrList.iterator();

		// Holds true till there is single element
		// remaining in the list
		while (it.hasNext())

			// Print the elements of ArrayList
			System.out.print(it.next() + " ");

		//

		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

		for (String listElement : arrList) {
			System.out.print(listElement + " ");
			connectToSqlDB.insertDataFromStringToSqlTable(listElement,"arraylist","name");
		}





	}

}
