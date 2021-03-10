package linked_list;

public class DoublyLinkedList {

	// Represent a node of the doubly linked list

	class Node {
		int data;
		Node previous;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	static // Represent the head and tail of the doubly linked list
	Node head;
	Node tail = null;

	// addNode() will add a node to the list
	public void addNode(int data) {
		// Create a new node
		Node newNode = new Node(data);

		// If list is empty
		if (head == null) {
			// Both head and tail will point to newNode
			head = tail = newNode;
			// head's previous will point to null
			head.previous = null;
			// tail's next will point to null, as it is the last node of the list
			tail.next = null;
		} else {
			// newNode will be added after tail such that tail's next will point to newNode
			tail.next = newNode;
			// newNode's previous will point to tail
			newNode.previous = tail;
			// newNode will become new tail
			tail = newNode;
			// As it is last node, tail's next will point to null
			tail.next = null;
		}
	}


	/* Given a node as prev_node, insert a new node after the given node */
	public void InsertAfter(Node prev_Node, int new_data) {

		/* 1. check if the given prev_node is NULL */
		if (prev_Node == null) {
			System.out.println("The given previous node cannot be NULL ");
			return;
		}

		/*
		 * 2. allocate node 3. put in the data
		 */
		Node new_node = new Node(new_data);

		/* 4. Make next of new node as next of prev_node */
		new_node.next = prev_Node.next;

		/* 5. Make the next of prev_node as new_node */
		prev_Node.next = new_node;

		/* 6. Make prev_node as previous of new_node */
		new_node.previous = prev_Node;

		/* 7. Change previous of new_node's next node */
		if (new_node.next != null)
			new_node.next.previous = new_node;
	}

	// display() will print out the nodes of the list
		public void display() {
			// Node current will point to head
			Node current = head;
			if (head == null) {
				System.out.println("List is empty");
				return;
			}
			System.out.println("Nodes of doubly linked list: ");
			while (current != null) {
				// Prints each node by incrementing the pointer.

				System.out.print(current.data + " ");
				current = current.next;
			}
		}
		
	public static void main(String[] args) {

		DoublyLinkedList dList = new DoublyLinkedList();
		// Add nodes to the list
		dList.addNode(1);
		dList.addNode(2);
		dList.addNode(3);
		dList.addNode(4);
		dList.addNode(5);
		
		dList.InsertAfter(head, 6);

		// Displays the nodes present in the list
		dList.display();
	}
}
