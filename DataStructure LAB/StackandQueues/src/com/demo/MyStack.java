package com.demo;

public class MyStack {
private int []arr;
private int size;
private int top;
public MyStack() {
	arr=new int[10];
	size=10;
	top=-1;
	
}
public boolean isEmpty(){
	return top==-1;
	
}
public boolean isFull() {
	return top==size-1;
}
public boolean push(int n) {
	if(isFull()) {
		System.out.println("Stack Over flow");
		return false;
	}else
		top++;
	arr[top]=n;
	return true;
	
}
public int pop() {
	if(isEmpty()) {
		System.out.println("Stack under flow");
		return -1;

	}else {
		int num=arr[top];
		top--;
		return num;
	}
		
}
}
