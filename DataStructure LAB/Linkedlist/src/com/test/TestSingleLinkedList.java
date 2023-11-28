package com.test;

import com.beans.SingleLinkedList;

public class TestSingleLinkedList {
public static void main(String[] args) {
	SingleLinkedList ob=new SingleLinkedList();
	ob.addAtEnd(1);
	ob.addAtEnd(2);
	ob.addAtEnd(3);
	ob.addByPosition(4,1);
	ob.addByPosition(5, 4);
	ob.displayData();
}
}
