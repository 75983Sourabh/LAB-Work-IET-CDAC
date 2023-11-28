package com.beans;

public class SingleLinkedList {
	private Node head;
	class Node{
		int n;
		Node next;
		Node(int d){
			n=d;
			next=null;
			
		}
	}
	public SingleLinkedList() {
		head=null;
	}
	public void addAtEnd(int value) {
		
		Node newnode=new Node(value);
		if(head==null) {                  
			head=newnode;
			
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
			
			
		}
		
	}
	public void addByPosition(int value,int pos) {
		Node newnode =new Node(value);
		if(head==null &&pos!=1) {
			System.out.println("List is Empty ");
		}
		if(pos==1) {
			if(head==null) {
				head=newnode;
			
		}else {
			newnode.next=head;
			head=newnode;
		}
	}else {
		Node prev=head;
		for(int i=1;prev!=null && i<=pos-2;i++) {
			prev=prev.next;
			
		}if(prev!=null) {
			newnode.next=prev.next;
			prev.next=newnode;
			
		}else {
			System.out.println("Wrong position"+pos);

		}
		}
	}
	public boolean deleteByValue(int val){
		if(head==null) {
			System.out.println("List is Empty");
			
		}
		else
		{
			if(head.n==val) {
				Node temp=head;
				head=head.next;
				temp.next=null;
				return true;
			}
			else {
				Node prev=head;
				Node current=prev.next;
				while(current!=null && current.n!=val) {
					prev=prev.next;
					current=current.next;
					
				}
				if(current!=null) {
					prev.next=current.next;
					current.next=null;
					current=null;
					return true;
				}else {
					System.out.println(val+"Not found");
					return false;
					
				}
			}
		}return false;
	}
	public boolean deleteByPosition(int pos) {
		if(pos!=1) {
			Node temp=head;
			head=head.next;
			temp.next=null;
			return true;
			
		}
		else {
			Node prev=head;
			Node current=prev.next;
			for(int i=1;current!=null && i<=pos-2;i++) {
				prev=prev.next;
				current=current.next;
				
			}if(current!=null) {
				prev.next=current.next;
				current.next=null;
				current=null;
				return true;
			}else {
				System.out.println(pos+"Position is Wrong");
				return false;
			}
		}
	}
	public void displayData() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.n);
			temp=temp.next;
		}
	}
}
