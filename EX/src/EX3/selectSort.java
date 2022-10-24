package EX3;

import java.util.Arrays;

public class selectSort {

	public static void main(String[] args) {
		int s[]= {80,41,35,90,40,20};
		selectionSort(s);
		for(int i =0;i<s.length;i++) {
			System.out.print(s[i]+"\t");
		}
		System.out.println();
		

	}
	
	static int[] selectionSort(int[] arr) {
		return Arrays.sort(arr);
	}
}
