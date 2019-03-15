package com.samples.algorithm.sort;

import java.util.Arrays;

/**
 * ���ţ���Ч�����١�ʡ�ռ�
 * ˼�룺ָ��һ����׼��[�����Ե�һ����Ϊ��׼��]
 * 		 �����������򷴷���ɨ�裬�Ҳ�Ȼ�׼��С��ͬ���Ȼ�׼����Ľ��н���
 * 		������ɨ��ָ����ײʱ����ǰ��ײ����Ϊ���µĻ�׼���������������
 * 		����ײ�����������ֱ�������ϲ���ĵݹ�����ֱ��û�д���������Ϊֹ
 * �Ż�����׼����Ϊ����ȡ�������Ч��
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
		if(low > high){// ��ǰ���������������
			return;
		}
		i = low;
		j = high;
		int pivot = arr[low];// �Ե�һ����Ϊ��׼��
		
		while(i < j){// ��ָ�� < ��ָ���ʱ��
			while(pivot <= arr[j] && i<j){// ��ָ������ɨ�裬ֱ��ɨ�赽�Ȼ�׼��С������
				j--;
			}
			while(pivot >= arr[i] && i< j){// ��ָ������ɨ�裬ֱ��ɨ�赽�Ȼ�׼���������
				i++;
			}
			
			if(i<j){// ָ���λ����Ҫ����
				swap(arr, i, j);
			}
		}
		// ��ָ����ײ������ײ��������Ϊ��׼����
		arr[low] = arr[i];
		arr[i] = pivot;
		
		quickSort(arr, low, j-1);// �ݹ�����������
		quickSort(arr, j+1, high);// �ݹ�����Ұ�����
	}
	
	public static void swap(int[] array, int i, int j){
		int temp= array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
