package com.arun;

public class SecondHeighestNumber {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int num = SecondHeightest(arr);
		System.out.println(arr.length);
		System.out.println(num);
	}

	private static int SecondHeightest(int[] arr) {

		int sortArr = sortMethod(arr);
		int len = arr.length;
		int n = arr[len - 2];

		return n;
	}

	private static int sortMethod(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return temp;
	}

}
