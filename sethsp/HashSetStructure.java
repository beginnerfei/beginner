package com.hsp.sethsp;

public class HashSetStructure {

	public static void main(String[] args) {
	
		Node[] table = new Node[16];
		Node john = new Node("john", null);

		table[2] = john;
		Node jack = new Node("jack", null);
		john.next = jack;
		Node rose = new Node("Rose", null);
		jack.next = rose;
		Node lucy = new Node("lucy", null);
		table[3] = lucy; 
		System.out.println("table=" + table);

	}
}
class Node { 
	Object item; 
	Node next; 

	public Node(Object item, Node next) {
		this.item = item;
		this.next = next;
	}
}
