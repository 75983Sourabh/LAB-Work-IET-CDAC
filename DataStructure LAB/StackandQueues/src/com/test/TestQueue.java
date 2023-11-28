package com.test;

import com.demo.MyQueue;

public class TestQueue {
public static void main(String[] args) {
	MyQueue ob=new MyQueue();
	ob.enqueue(9);
	ob.enqueue(1);
	ob.enqueue(4);
	ob.enqueue(4);
	ob.enqueue(3);
	ob.enqueue(0);
	ob.enqueue(6);
	ob.enqueue(3);
	ob.enqueue(0);
	ob.enqueue(3);
	
	System.out.println(ob);
	ob.dequeue();
	System.out.println(ob);
	ob.dequeue();
	ob.dequeue();
	ob.dequeue();
	ob.dequeue();
	System.out.println(ob);

}
}
