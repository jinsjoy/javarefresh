package com.generics.test;

import java.util.ArrayList;
import java.util.List;

public class Algorithm1 {

	public static <T extends Object & Comparable<? super T>> T max(List<? extends T> list, int begin, int end) {
		T maxElem = list.get(begin);
		for (++begin; begin < end; ++begin)
			if (maxElem.compareTo(list.get(begin)) < 0)
				maxElem = list.get(begin);
		return maxElem;
	}

	public static void main(String args[]) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(4);
		arr.add(7);
		arr.add(9);
		arr.add(3);
		arr.add(5);
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		int maxi = max(arr, 0 ,5);
		System.out.println("max= " + maxi);
	}
}
