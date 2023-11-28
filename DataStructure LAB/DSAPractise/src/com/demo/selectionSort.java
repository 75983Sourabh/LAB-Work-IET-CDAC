package com.demo;

import java.util.Arrays;

public class selectionSort {
	public static void main(String[] Sourabh) {
		int arr[]= {20,10,15,40,25,87,24,36,1,2,7,4};
		System.out.println("Given Arrays");
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("Sorted Arrays");
		System.out.println(Arrays.toString(arr));
		
	}

	private static void selectionSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int min_index=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min_index]) {
					min_index=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
		}
	}
}

	