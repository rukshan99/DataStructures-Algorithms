package linked_list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListReverse {

	public static void main(String[] args) {

		/*
		 * Printing linked list elements in reverse order
		 */
		LinkedList<String> list = new LinkedList<String>();
		list.add("Rukshan");
		list.add("Kamal");
		list.add("Malith");

		Iterator<String> i = list.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
