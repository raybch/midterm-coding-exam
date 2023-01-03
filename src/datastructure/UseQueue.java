package src.datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		//declare a Queue
		Queue<String> str_queue = new LinkedList<>();
		//initialize the queue with values
		str_queue.add("one");
		str_queue.add("two");
		str_queue.add("three");
		str_queue.add("four");
		//print the Queue
		System.out.println("The Queue contents:" + str_queue);

		//remove () method =>removes first element from the queue
		System.out.println("Element removed from the queue: "+str_queue.remove());
		//poll () => removes and returns the head
		System.out.println("Poll():Returned Head of the queue: "+str_queue.poll());
		//returns head of the queue
		System.out.println("peek():Head of the queue: "+str_queue.peek());
		//print the contents of the Queue
		System.out.println("Final Queue:"+str_queue);




		// Use For Each loop and while loop with Iterator to retrieve data.

		//traverse the Queue using Iterator
		System.out.println("The Queue elements through iterator:");
		Iterator iterator = str_queue.iterator();
		while(iterator.hasNext()){
			String element = (String) iterator.next();
			System.out.print(element + " ");
		}
		System.out.println("\n\nThe Queue elements using for loop:");
		//use new for loop to traverse the Queue
		for(Object object : str_queue) {
			String element = (String) object;
			System.out.print(element + " ");
		}



	}

}
