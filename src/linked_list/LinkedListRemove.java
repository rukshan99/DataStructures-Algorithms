package linked_list;

import java.util.LinkedList;

public class LinkedListRemove {

	public static void main(String[] args) {

		/*
		 * Different methods of removing elements from a linked list
		 */
		LinkedList<String> list = new LinkedList<String>();

		list.add("Rukshan");
		list.add("Nimal");
		list.add("Kamal");
		list.add("Sunil");
		list.add("Amara");
		list.add("Kalindu");
		list.add("Pasindu");
		list.add("Mahinda");
		list.add("Denuwan");
		list.add("Sajith");
		System.out.println("Initial list of elements: " + list);

		// Removing specific element
		list.remove("Kalindu");
		System.out.println("After invoking remove(object) method: " + list);

		// Removing element on the basis of specific position
		list.remove(0);
		System.out.println("After invoking remove(index) method: " + list);

		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("Pasindu");
		list2.add("Sajith");

		// Adding new elements
		list.addAll(list2);
		System.out.println("Updated list : " + list);

		// Removing first element from the list
		list.removeFirst();
		System.out.println("After invoking removeFirst() method: " + list);

		// Removing first element from the list
		list.removeLast();
		System.out.println("After invoking removeLast() method: " + list);

		// Removing first occurrence of element from the list
		list.removeFirstOccurrence("Pasindu");
		System.out.println("After invoking removeFirstOccurrence() method: " + list);

		// Removing last occurrence of element from the list
		list.removeLastOccurrence("Sajith");
		System.out.println("After invoking removeLastOccurrence() method: " + list);

		LinkedList<String> list3 = new LinkedList<String>();
		list3.add("Kamal");
		list3.add("Sunil");

		// Adding new elements and removing added list
		list.addAll(list3);
		System.out.println("Updated list : " + list);

		list.removeAll(list3);
		System.out.println("After invoking removeAll() method: " + list);

		// Removing all the elements available in the list
		list.clear();
		System.out.println("After invoking clear() method: " + list);
	}

}
