package com.test;

import com.demo.MyStack;

public class TestMyStack {
public static void main(String[] args) {
	MyStack ob=new MyStack();
	ob.push(91);
	ob.push(44);
	ob.push(30);
	ob.push(63);
	ob.push(03);
	while(!ob.isEmpty()) {
		System.out.println(ob.pop());}
}
}
