package com.demo;

import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {
		int []arr= {91,44,30,63,3,4,7};
		System.out.println("Given Arrays ");
		System.out.println(Arrays.toString(arr) );
		heapSort(arr);
		System.out.println("Sorted Arrays");
		System.out.println(Arrays.toString(arr));
		
	}

	private static void heapSort(int[] arr) {
		int n=arr.length;
		for(int i=n/2-1;i>=0;i--) {
			heapify(arr,n,i);
			System.out.println(Arrays.toString(arr));

		}
		//System.out.println(Arrays.toString(arr));
		
		
		for(int i=n-1;i>=0;i--) {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
		heapify(arr,i,0);
			System.out.println("Size :"+i);
			System.out.println(Arrays.toString(arr));
		}
		
		
	}

	private static void heapify(int[] arr, int n, int i) {
		int largest=i;
		int l=2*i+1;
		int r=2*i+2;
		
		if(l<n&&arr[l]>arr[largest]) {
		largest=l;
		
		}if(r<n && arr[r]>arr[largest] ) 
		{
			largest=r;
		}
		if(largest!=i) {
			int temp=arr[largest];
			arr[largest]=arr[i];
			arr[i]=temp;
			heapify(arr,n,largest);
		}
		
	}
}
