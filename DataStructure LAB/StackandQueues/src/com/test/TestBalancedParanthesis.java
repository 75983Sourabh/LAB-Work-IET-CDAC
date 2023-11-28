package com.test;

import java.util.Scanner;

import com.demo.MyStringStack;

public class TestBalancedParanthesis {
public static void main(String []args) {
	MyStringStack ob=new MyStringStack();
	Scanner sc=new Scanner(System.in);

	String str="({[][](({})}))";
	boolean status=checkBalancedParanthesis(str);
	if(status) {
		System.out.println("String Is Balanced ");
		
	}else {
		System.out.println("String is not Balanced ");
	}
	
}

private static boolean checkBalancedParanthesis(String str) {
	MyStringStack ob =new MyStringStack(str.length());
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch=='('||ch=='{'||ch=='[') {
			ob.push(ch);
			
		}else {
			if(ch==')'||ch=='}'||ch==']') {
				if(!ob.isEmpty()) {
					char ch1=ob.pop();
					if((ch==')'&& ch=='(')||(ch=='}'&&ch=='{')||(ch==']'&&ch=='[')) {
						return false;
					}
				}
			}else
				return false;
		}
	}if( ob.isEmpty())
		return true;
		else
	return false;
}
}
