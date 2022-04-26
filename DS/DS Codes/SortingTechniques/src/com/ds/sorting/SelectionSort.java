package com.ds.sorting;

public class SelectionSort {
	public static int[] selectionSort(int[] arr){
		 
		 for (int i = 0; i < arr.length - 1; i++)
		 {
		 int index = i;
		 for (int j = i + 1; j < arr.length; j++)
		 if (arr[j] < arr[index])
		 index = j;
		 
		 int smallerNumber = arr[index];
		 arr[index] = arr[i];
		 arr[i] = smallerNumber;
		 
		 System.out.print("Iteration "+(i+1)+": ");
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
