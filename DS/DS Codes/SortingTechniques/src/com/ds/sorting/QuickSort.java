package com.ds.sorting;

public class QuickSort {
	private static int array[];
	 
    public static void sort(int[] arr) {
 
        if (arr == null || arr.length == 0) {
            return;
        }
        array = arr;
        quickSort(0, array.length-1);
    }
 
    private static void quickSort(int left, int right) {
 
        int i = left;
        int j = right;
        int pivot = array[left+(right-left)/2];
 
        while (i <= j) {
            
            while (array[i] < pivot) { i++; } while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        if (left < j)
            quickSort(left, j);
        if (i < right)
            quickSort(i, right);
    }
    
    public static void printArray(int arr[],int left,int right)
    {
        for (int i = left; i <=right; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    private static void exchange(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
