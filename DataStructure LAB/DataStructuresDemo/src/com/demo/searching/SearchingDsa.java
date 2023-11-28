package com.demo.searching;

import java.util.Scanner;

public class SearchingDsa {
	
	private static void acceptData(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the Number= "+(i+1));
		   arr[i]=sc.nextInt();
		}
	}
		
		//Linear Search

		private static int linearSearch(int[] arr,int a) {
			for(int j=0;j<arr.length;j++) 
			{
			 if(arr[j]==a) {
				 return j;
				}
			 
			 }
			 return -1;
			
			
		}
		
		
		//Binary Search
		
		private static int binarySearch(int[] arr, int search) {
			int first=0;
			int last=arr.length-1;
			int cmpcnt = 0;
			
			
			while(first<=last) {
			int mid=(first+last)/2;
			cmpcnt++;
			if(arr[mid]==search) {
				System.out.println("Number found at location= "+mid);
				return mid;
			}
			else if(arr[mid]<search) 
			{
				first=mid+1;
				
			}
			else {
				last=mid-1;
			}
		
			}
			System.out.println("The total comparisons are= "+cmpcnt);
			return -1;
			
			
		}


	
	
	
	public static void main(String[] args) {
		
		int []arr=new int[10];
		Scanner sc=new Scanner(System.in);
		acceptData(arr);
		System.out.println("Enter the number which you want to Search");
		
		int search=sc.nextInt();
		int result=linearSearch(arr,search);
		//int result=binarySearch(arr,search);
		if(result!=-1) {
		System.out.println("found at location "+result);
	     } 
		else 
		{			
			System.out.println("Not Found");
	     }
	     
		
		
		
		}



	








	

















	

}
