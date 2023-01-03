package src.datastructure;


import src.databases.ConnectToSqlDB;

import java.io.*;
import java.util.*;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

     	String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

		try{
			File NewFile = new File(textFile);
			System.out.println(NewFile.getCanonicalPath());
			FileInputStream File_Input_Stream = new FileInputStream(NewFile);

			DataInputStream Data_Input_Stream = new DataInputStream(File_Input_Stream);
			BufferedReader Buffered_Reader = new BufferedReader(new InputStreamReader(Data_Input_Stream));
			String line;
			String[] words = null;
			ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

			while((line = Buffered_Reader.readLine()) != null){
				System.out.println(line);
				// store data into Database
				connectToSqlDB.insertDataFromStringToSqlTable(line,"file","line");
			}
			Data_Input_Stream.close();
		   }catch(Exception e){
			System.err.println("Error: " + e.getMessage());
		   }

		String[] words = null;
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		// retrieve data from database
		List<String> datafromdb= null;
		try {
			datafromdb = connectToSqlDB.readDataBase("file","line");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		String fileData = "";
			for (String s: datafromdb) {
				System.out.println(s);
				fileData = fileData + s;
			}

			words = fileData.split(" ");
			System.out.println("output string: " + Arrays.toString(words));

			// store each word into Stack and LinkedList.
		   LinkedList<String> wordsinll = new LinkedList<String>();
		   Stack<String> stk= new Stack<String>();

		for(int i=0; i< words.length; i++){
			   wordsinll.add(words[i]);
			   stk.push(words[i]);
		}

		// iterate/traverse through the list to retrieve as FIFO order from LinkedList and retrieve as FILO order from Stack.

		System.out.print(
				"Iterating the LinkedList: ");

		for (String listElement : wordsinll) {
			System.out.print(listElement + " ");
		}

		System.out.print(
				"Retrieve as FILO order from Stack : ");

		for (String listElement : stk) {
			System.out.print(listElement + " ");
		}

		// Demonstrate how to use Stack that includes push,peek,search,pop elements.

		Stack<String> stkString= new Stack<String>();
        // pushing elements into stack
		stkString.push("vince");
		stkString.push("mella");
		stkString.push("adam");
		stkString.push("johan");

		String y = (String) stkString.pop();
		System.out.println(y);

		String element = (String) stkString.peek();
		System.out.println("Element on stack top: " + element);


		Integer pos = (Integer) stkString.search("adam");

		if(pos == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element is found at position: " + pos);


		//  Use For Each loop/while loop/Iterator to retrieve data.

		for (String listElement : stkString) {
			System.out.print(listElement + " ");
		}


		while(!stkString.empty()){
			String[] values = stkString.pop().trim().replaceAll(" ", "").split("/");
			String[] moveList = values[0].trim().replaceAll(" ", "").split("-");
		}


		//iteration over the stack using while loop
		Iterator iterator = stkString.iterator();
		while(iterator.hasNext())
		{
			Object values = iterator.next();
			System.out.println(values);
		}
	}

}
