package linked_list;

import java.util.LinkedList;

public class LinkedlistAdd {

	public static void main(String[] args) {
		
		/*
		 * Different ways of adding elements to a LinkedList
		 */
		LinkedList<String> list = new LinkedList<String>();
		
		System.out.println("Initial list of elements: " + list);
		
		list.add("Rukshan");
		list.add("Kamal");
		list.add("Sunil");
		System.out.println("After invoking add(E e) method: " + list);
		
		// Adding an element at the specific position
		list.add(1, "Nimal");
		System.out.println("After invoking add(int index, E element) method: " + list);
		
		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("Ananda");
		list2.add("Shenal");
		
		// Adding second list elements to the first list
		list.addAll(list2);
		System.out.println("After invoking addAll(Collection<? extends E> c) method: " + list);
		
		LinkedList<String> list3 = new LinkedList<String>();
		list3.add("Alex");
		list3.add("Ranjan");
		
		// Adding second list elements to the first list at specific position
		list.addAll(1, list3);
		System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: " + list);
		
		// Adding an element at the first position
		list.addFirst("Pasan");
		System.out.println("After invoking addFirst(E e) method: " + list);
		
		// Adding an element at the last position
		list.addLast("Nihal");
		System.out.println("After invoking addLast(E e) method: " + list);

	}
}
