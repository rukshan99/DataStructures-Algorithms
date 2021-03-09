package linked_list;

import java.util.*;

public class Linkedlist {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();
		list.add("Rukshan");
		list.add("Nimal");
		list.add("Kamal");
		list.add("Sunil");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
