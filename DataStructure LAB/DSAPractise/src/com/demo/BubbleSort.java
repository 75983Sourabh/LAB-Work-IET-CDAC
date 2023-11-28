package com.demo;

import java.util.Arrays;

public class BubbleSort {
public static void main(String[] args) {
	int []arr= {1,5,2,54,32,65,61,287,49,57,67,28};
	System.out.println("before sorting of array");
	System.out.println(Arrays.toString(arr));
	BubbleSort(arr);
	System.out.println("Sorted Arrays ");
	System.out.println(Arrays.toString(arr));
}

private static void BubbleSort(int[] arr) {
	int n=arr.length;
	boolean flag;
	for(int i=0;i<n;i++) {
	flag =false;
		for(int j=0;j<n-i-1;j++)
	{
		if(arr[j]>arr[j+1]) {
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			flag=true;
		}
	}System.out.println(Arrays.toString(arr));
	if(!flag) {
		break;
	}
	}
	
}





}