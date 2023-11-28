package com.beans;

public class DoublyLinkedList {
	Node head;
	class Node{
		int num;
		Node prev;
		Node next;
		public Node(int num) {
			super();
			this.num=num;
			prev=null;
			next=null;
			
		}
		}
	public DoublyLinkedList() {
		head=null;
	}
	public void addAtEnd(int n) {
		Node newnode= new Node(n);
	
	if(head==null) {
			head=newnode;

	}
	else {
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
			
		}temp.next=newnode;
		newnode.prev=temp;
	}
   }
	public void addAtPosition(int  value,int pos) {
		Node newnode=new Node(value);
		if(pos==1) {
			newnode.next=head;
			head.prev=newnode;
			head=newnode;
			
		}
		Node temp=head;
		for(int i=1;temp!=null &&i<=pos-2;i++) {
			temp=temp.next;
			
		}if(temp!=null) {
			newnode.next=temp.next;
			newnode.prev=temp;
			temp.next.prev=newnode;
			temp.next=newnode;
		}else {
			System.out.println("Wrong position"+pos);
		}
	}
	public void deleteByKey(int num) {
		Node current =head;
		while(current!=null&&current.num!=num) {
			current=current.next;
			
		}
		if(current!=null) {
			if(current==head) {
				head=head.next;
				head.prev=null;
				current.next=null;
				current=null;
				
			}else {
				current.prev.next=current.next;
				if(current.next!=null) {
					current.next.prev=current.prev;
					current.next=null;
					
				}current.prev=null;
				current=null;
			}
		}
	}
	 public void displaydata() {
	    	Node temp=head;
	    	while(temp!=null) {
	    		System.out.println(temp.num);
	    		temp=temp.next;
	    	}
	    }
}

