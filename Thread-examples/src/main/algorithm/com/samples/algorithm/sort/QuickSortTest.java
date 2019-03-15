package com.samples.algorithm.sort;

public class QuickSortTest {

	public static void main(String[] args) {
		//int[] array = {3,9,6,4,8,7,2,1,5};
		int[] array = {1,2,3,4,5,6,7,8,9};
		quickSort(array, 0, array.length -1);
		for(int a : array){
			System.out.print(a + ",");
		}
	}

	public static int[] quickSort(int[] array, int start, int end){
		if(array.length < 1 || start < 0 || end >= array.length || start > end){
			return null;
		}
		
		int smallIndex = partition(array, start, end);
		if(smallIndex > start){
			quickSort(array, start, smallIndex - 1);
		}
		if(smallIndex < end){
			quickSort(array, smallIndex + 1, end);
		}
		
		return array;
	}
	
	public static int partition(int[] array, int start, int end){
		int pivot = (int)(start + Math.random() * (end -start +1));
		int smallIndex = start -1;
		swap(array, pivot, end);
		for(int i = start; i<=end; i++){
			if(array[i] <= array[end]){
				smallIndex ++;
				if(i > smallIndex){
					swap(array, i, smallIndex);
				}
			}
		}
		
		return smallIndex;
	}
	
	public static void swap(int[] array, int i, int j){
		int temp= array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
