package com.arun;

public class HeighestAndLowestNumber {
	public static void main(String[] args) {
		int arr[]= {10,20,34,44,98,5};
		findFNSHeighest(arr);
	}

	private static void findFNSHeighest(int[] arr) {
		
		int lar=arr[0];
		int sml=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			int val=arr[i];
			if(val<sml) {
				sml=val;
			}
			else if(lar<val)
			{
				lar=val;
			}
		
	}
		System.out.println("First Largest:"+lar  +"Second Largest :"+sml);

	

}
}
