package com.demo;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {65,35,23,12,2,13,87,15,51,56};
		System.out.println("Given Arrays ");
		System.out.println(Arrays.toString(arr));
		InsertionSort(arr);
		System.out.println("Sorted Arrays");
		System.out.println(Arrays.toString(arr));
	}

	private static void InsertionSort(int[] arr) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			for(;j>=0 && arr[j]>key;j--) {
				arr[j+1]=arr[j];
			}
			
			arr[j+1]=key;
			System.out.println(Arrays.toString(arr));
		}
		
	}

}
