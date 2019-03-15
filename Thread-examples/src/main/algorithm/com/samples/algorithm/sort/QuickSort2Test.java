package com.samples.algorithm.sort;

import java.util.Arrays;

/**
 * 快排：高效、快速、省空间
 * 思想：指定一个基准数[这里以第一个数为基准数]
 * 		 从数组两端向反方向扫描，右侧比基准数小的同左侧比基准数大的进行交换
 * 		当两个扫描指针碰撞时，当前碰撞点设为最新的基准数，该轮排序结束
 * 		将碰撞点两侧的数组分别进行以上步骤的递归排序，直到没有待排序数组为止
 * 优化：基准数改为三数取中能提高效率
 * @author wuyouwulv
 *
 */
public class QuickSort2Test {
	public static void main(String[] args){
		int[] arr = {3,9,6,4,8,7,2,1,5};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int[] arr, int low, int high){
		int i,j;
		if(low > high){// 当前子数组已完成排序
			return;
		}
		i = low;
		j = high;
		int pivot = arr[low];// 以第一个数为基准数
		
		while(i < j){// 左指针 < 右指针的时候
			while(pivot <= arr[j] && i<j){// 右指针往左扫描，直到扫描到比基准数小的数据
				j--;
			}
			while(pivot >= arr[i] && i< j){// 左指针往右扫描，直到扫描到比基准数大的数据
				i++;
			}
			
			if(i<j){// 指针错位，需要交换
				swap(arr, i, j);
			}
		}
		// 两指针碰撞，将碰撞点数据作为基准数据
		arr[low] = arr[i];
		arr[i] = pivot;
		
		quickSort(arr, low, j-1);// 递归快排左半数组
		quickSort(arr, j+1, high);// 递归快排右半数组
	}
	
	public static void swap(int[] array, int i, int j){
		int temp= array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
