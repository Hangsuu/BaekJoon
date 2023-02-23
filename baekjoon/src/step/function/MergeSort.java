package step.function;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = new int[] {3,5,2,1,4,6};
		arr=merge(arr);
		for(int i=0; i< arr.length; i++) System.out.println(arr[i]);
	}
	
	public static int[] merge(int[] list) {
		if(list.length==1) return list;
		int mid=(int) Math.ceil(list.length/2.0);
		int[] temp1 = Arrays.copyOfRange(list, 0, mid);
		int[] temp2 = Arrays.copyOfRange(list, mid, list.length);
		
		return mergeSort(merge(temp1), merge(temp2));
	}
	
	public static int[] mergeSort(int[] list1, int[] list2) {
		int l = 0;
		int r = 0;
		int m = 0;
		int[] arr =  new int[list1.length+list2.length];
		while(l<list1.length && r<list2.length) {
			if(list1[l]<=list2[r]) {
				arr[m]=list1[l];
				m++;
				l++;
			}
			else {
				arr[m]=list2[r];
				m++;
				r++;
			}
		}
		if(l==list1.length) {
			for(int i=r; i<list2.length; i++) {
				arr[m]=list2[i];
				m++;
			}
		}
		else for(int i=l; i<list1.length; i++) {
			arr[m]=list1[i];
			m++;
		}
		return arr;
	}
}