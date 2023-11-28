package com.test;

import com.beans.DoublyLinkedList;

public class TestDoublyLinkedList {
	public static void main(String[] args) {
		DoublyLinkedList ob=new DoublyLinkedList();
		ob.addAtEnd(1);
		ob.addAtEnd(2);
		ob.addAtEnd(3);
		ob.addAtEnd(4);
		ob.addAtPosition(5, 1);
		ob.addAtPosition(6, 6);
		ob.addAtEnd(7);
		ob.displaydata();
	}
}
