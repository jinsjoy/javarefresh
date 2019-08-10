package com.generics.test;

public class Algorithm {

	public static <T> void swap(T[] a, int i, int j) {
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	public static void main(String args[]) {
		Integer a[] = {8,4,5,7};
		swap(a,2,3);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
