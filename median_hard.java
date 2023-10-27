
/*
 * 
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 
 * 
 * 
 * Example 1:

	Input: nums1 = [1,3], nums2 = [2]
	Output: 2.00000
	Explanation: merged array = [1,2,3] and median is 2.
	Example 2:
	
	Input: nums1 = [1,2], nums2 = [3,4]
	Output: 2.50000
	Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
	 
	
	Constraints:
	
	nums1.length == m
	nums2.length == n
	0 <= m <= 1000
	0 <= n <= 1000
	1 <= m + n <= 2000
	-106 <= nums1[i], nums2[i] <= 106
 * 
 * 
 */

package com.dibya.interview_prep.leet_code;

import java.util.Arrays;
import java.util.stream.IntStream;

public class median_hard {
	
	
	public static void main(String[] args) {
		
		int[] nums1 = {1,3};
		int[] nums2 = {2,4} ;
		
		System.out.print( findMedianSortedArrays(nums1 , nums2) );
		
	}

	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		 
//		 merge type 1 : Using Stream
		 int[] mergedArray = IntStream.concat(IntStream.of(nums1), IntStream.of(nums2)).toArray() ;
		 
//		 merge type 2 : Using For loop
		 
//		 int[] mergedArray = new int[nums1.length + nums2.length];
//		 
//		 
//		 for(int i = 0 ; i < nums1.length ; i++) {
//			 mergedArray[i] = nums1[i];
//		 }
//		 for(int j = 0 ; j < nums2.length ; j++) {
//			 mergedArray[nums1.length+j] = nums2[j];
//		 }
//		 
		 Arrays.sort(mergedArray);
		 double median = 0.0 ;
		 int index = 0 ;
		 
		 if (mergedArray.length % 2 != 0) {
			  median = mergedArray[ (int) ((mergedArray.length)/2) ];
		 }else {
			 index =(int)((mergedArray.length)/2)-1;
			 median =  (mergedArray[ index] + mergedArray[ (index+1)])/2.0;
		 }
		 
		 
		return median;
		 
		 

	        
	    }

}
