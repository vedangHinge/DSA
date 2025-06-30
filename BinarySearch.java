package com.BS;

public class BinarySearch {
	public static int search(int []arr,int target) {
		int Start=0;
		int End=arr.length-1;
		while(Start<=End) {
			int mid=Start+(End-Start)/2;
			if(target<arr[mid]) {
				End=mid-1;
			}else if(target>arr[mid]) {
				Start=mid+1;
			}else return mid;
		}
		return -1;
	}
}
