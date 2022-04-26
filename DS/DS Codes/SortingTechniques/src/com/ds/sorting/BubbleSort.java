package com.ds.sorting;

public class BubbleSort {
	public static int[] bubbleSort(int arr[])
	 {
	  for (int i = 0; i < arr.length; i++) {
	   for (int j = 0; j < arr.length-1-i; j++) { 
	     if(arr[j]>arr[j+1])
	     {
	       int temp=arr[j];
	       arr[j]=arr[j+1];
	       arr[j+1]=temp;
	     }
	   }
	   printArray(arr);
	  }
	  return arr;
	 }
	 
	 public static void printArray(int arr[])
	 {
	  for (int i = 0; i <arr.length; i++) {
	   System.out.print(arr[i]+" ");
	  }
	  System.out.println();
	 }
}
