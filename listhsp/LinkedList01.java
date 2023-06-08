package com.hsp.listhsp;

public class LinkedList01 {

	public static void main(String[] args) {

		Node jack = new Node("jack");
		Node tom = new Node("tom");
		Node hsp = new Node("老韩");

		jack.next = tom;
		tom.next = hsp;
		hsp.pre = tom;
		tom.pre = jack;

		Node first = jack;
		Node last = hsp; 
	
		System.out.println("====从头到尾进行遍历=====");
		while (true) {
			if (first == null) {
				break;
			}
			System.out.println(first);
			first = first.next;
		}
		System.out.println("====从尾到头的遍历====");
		while (true) {
			if (last == null) {
				break;
			}
		
			System.out.println(last);
			last = last.pre;
		}

		Node smith = new Node("smith");
		
		smith.next = hsp;
		smith.pre = tom;
		hsp.pre = smith;
		tom.next = smith;

	
		first = jack;

		System.out.println("=====从头到尾进行遍历=====");
		while (true) {
			if (first == null) {
				break;
			}
		
			System.out.println(first);
			first = first.next;
		}

		last = hsp; 
		
		System.out.println("=====从尾到头的遍历=====");
		while (true) {
			if (last == null) {
				break;
			}
			System.out.println(last);
			last = last.pre;
		}

	}
}


class Node {
	public Object item; 
	public Node next; 
	public Node pre; 

	public Node(Object name) {
		this.item = name;
	}

	public String toString() {
		return "Node name=" + item;
	}
}
