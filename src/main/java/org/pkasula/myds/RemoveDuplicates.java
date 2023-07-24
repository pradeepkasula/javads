package org.pkasula.myds;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int a1[] = {1};
		System.out.println(haveDuplicates(a1));
		
		int a2[] = {1,1};
		System.out.println(haveDuplicates(a2));
		
		int a3[] = {1,2,3,2,1};
		System.out.println(haveDuplicates(a3));
	}
	
	public static boolean haveDuplicates(int arr[]) {
		boolean haveDuplicates = false;
		int arrLength = arr.length;
		if(arrLength>1) {
			for(int i=0;i<arrLength-1;i++ ) {
				for(int j=i+1;j<arrLength;j++) {
					if(arr[i]==arr[j]) {
						haveDuplicates=true;
						break;
					}
				}
				if(haveDuplicates) break;
			}
		}
		return haveDuplicates;
	}

}
