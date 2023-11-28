package com.Recursion;

import java.util.Scanner;

public class Add1 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter no");
			int n = sc.nextInt();
			int sum = add(n);
			System.out.println("sum is " + sum);
		}

		public static int add(int n) {
			// TODO Auto-generated method stub
			if(n<1)
			{
				return -1;
			}
			else
			{
				if(n==1)
				{
					return 1;
				}
				return n+add(n-1);
			}
			 
		}

	}

