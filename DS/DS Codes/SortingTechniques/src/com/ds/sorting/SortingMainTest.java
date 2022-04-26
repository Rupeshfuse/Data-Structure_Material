package com.ds.sorting;

import java.util.Scanner;

public class SortingMainTest {

	public static void main(String[] args) {
		
		
		int ch, number;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Size of Elements to sort");
		number = sc.nextInt();
		
		int[] array = new int[number];
		System.out.println("Enter elements of array:");
		for(int i = 0; i < number; i++)
		{
			array[i] = sc.nextInt();
		}
		
		
		InsertionSort insert = new InsertionSort();
		BubbleSort bubble = new BubbleSort();
		SelectionSort select = new SelectionSort();
		MergeSort merge = new MergeSort();
		QuickSort quick = new QuickSort();
		HeapSort heap = new HeapSort();
		
		do
		{
			System.out.println("-----------------------------------------------");
			System.out.println("\nEnter Your Choice:");
			System.out.println("\n1.Bubble Sort\n2.Insertion Sort\n3.Selection Sort\n4.Merge Sort\n5.Quick Sort\n6.Heap Sort");
			ch = sc.nextInt();
			System.out.println("-----------------------------------------------");
			switch(ch)
			{
				case 1:
					bubble.bubbleSort(array);
					
					break;
				case 2:
					insert.insertionSort(array);
					
					break;
				case 3:
					select.selectionSort(array);
					
					break;
				case 4:
					merge.mergeSort(0,array.length);
					
					break;
				case 5:
					quick.sort(array);
					quick.printArray(array, 0, array.length-1);
					break;
				case 6:
					heap.heapSort(array);
					
					break;
					
				case 0:
					System.out.println("Exiting ");break;
				default:
					System.out.println("Wrong Choice!!!!!");break;
			}
		}while(ch != 0);

	

	}

