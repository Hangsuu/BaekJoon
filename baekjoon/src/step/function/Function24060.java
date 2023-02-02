package step.function;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Function24060 {
	static int num = 0;
	static int count=0;
	static int tempNum=-1;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		String[] snum = br.readLine().split(" ");
		int a = Integer.parseInt(s[0]);
		num = Integer.parseInt(s[1]);
		int[] arr = new int[a];
		for(int i=0; i<a; i++) arr[i]=Integer.parseInt(snum[i]);
		merge(arr);
		bw.write(tempNum+"");
		bw.close();
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
				count++;
				if(count==num) tempNum=list1[l];
				arr[m]=list1[l];
				m++;
				l++;
			}
			else {
				count++;
				if(count==num) tempNum=list2[r];
				arr[m]=list2[r];
				m++;
				r++;
			}
		}
		if(l==list1.length) {
			for(int i=r; i<list2.length; i++) {
				count++;
				if(count==num) tempNum=list2[i];
				arr[m]=list2[i];
				m++;
			}
		}
		else for(int i=l; i<list1.length; i++) {
			count++;
			if(count==num) tempNum=list1[i];
			arr[m]=list1[i];
			m++;
		}
		return arr;
	}
}