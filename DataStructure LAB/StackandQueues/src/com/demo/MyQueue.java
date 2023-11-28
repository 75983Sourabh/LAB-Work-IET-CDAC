package com.demo;

import java.util.Arrays;

public class MyQueue {
	private int[] queuearr;
	private int size;
	private int front;
	private int rear;
	public MyQueue() {
		size =10;
		queuearr=new int[size];
		front=0;
		rear=-1;
		
		
		
	}public MyQueue(int s){
		size=s;
		queuearr=new int [size];
		front=0;
		rear=-1;
	}
	public boolean isFull() {
		return rear==size-1;
	}
	public boolean isEmpty() {
		return front>rear;
	}
	public void enqueue(int n) {
		if(isFull()) {
			System.out.println("Queue is full cannot added more element ");
			
		}
		else {
			rear++;
			queuearr[rear]=n;
			System.out.println("Added in the Queue");
			
		}
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty cannot delete element ");
			return -1;
			
		}else
		{
			int n=queuearr[front];
			System.out.println("removed value from front end    "+front+"---------->"+n);
			front++;
			return n;
		
		}
	}
	public String toString() {
		return Arrays.toString(queuearr)+"Front :"+front+"rear :"+rear;
	}
	
}
