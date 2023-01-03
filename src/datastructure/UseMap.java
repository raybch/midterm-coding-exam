package src.datastructure;

import src.databases.ConnectToSqlDB;

import java.util.*;
import java.util.Map.Entry;

public class UseMap {

	public static <K, V> void printMap(Map<K, V> map) {
		for (Entry<K, V> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey()
					+ " Value : " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		// Creating a HashMap
		Map<String, String> foodTable
				= new HashMap<String, String>();

		// Inserting elements to the adobe HashMap
		foodTable.put("A", "Angular");
		foodTable.put("J", "Java");
		foodTable.put("P", "Python");
		foodTable.put("H", "Hibernate");

		// Iterating HashMap through for loop
		for (Entry<String, String> set :
				foodTable.entrySet()) {

			// Printing all elements of a Map
			System.out.println(set.getKey() + " = "
					+ set.getValue());
		}

		System.out.println("Unsort Map......");
		printMap(foodTable);

		System.out.println("\nSorted Map......By Key");
		Map<String, String> treeMap = new TreeMap<String, String>(foodTable);
		printMap(treeMap);


		// Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();


		Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

		ArrayList<String> carList = new ArrayList<String>();
		carList.add("toyota");
		carList.add("bmw");
		carList.add("honda");

		map.put("car", carList);

		ArrayList<String> fruitList = new ArrayList<String>();
		fruitList .add("apple");
		fruitList .add("banana");

		map.put("fruit", fruitList );

		printMap(map);

		// Use For Each loop and while loop with Iterator to retrieve data.

		for (Entry<String, String> set :
				foodTable.entrySet()) {

			// Printing all elements of a Map
			System.out.println(set.getKey() + " = "
					+ set.getValue());
		}

		//  while loop with Iterator to retrieve data
		// Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.

		// create an object of Iterator
		Iterator<Entry<String, String>> iterate1 = foodTable.entrySet().iterator();

		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();


		// iterate through key/value mappings
		System.out.print("Entries: ");
		while(iterate1.hasNext()) {
			System.out.print(iterate1.next());
			System.out.print(", ");
			connectToSqlDB.insertDataFromStringToSqlTable(String.valueOf(iterate1.next()),"map","food_table");
		}

		// retrieve data from database
		List<String> datafromdb= null;
		try {
			datafromdb = connectToSqlDB.readDataBase("map","food_table");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		for (String s: datafromdb) {
			System.out.println(s);
		}



	}

}
