/*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

 

Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
 

Constraints:

n == height.length
2 <= n <= 105
0 <= height[i] <= 104
*/


package com.dibya.interview_prep.leet_code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Container_With_Most_Water {

	public static void main(String[] args) {
		
		int[] height = {1,8,6,2,5,4,8,3,7};
		
		System.out.print( most_water(height) ) ;
		
		
	}

	private static int most_water(int[] height) {
		int[] height_copy = height.clone();
		
		List<Integer>  ArrayList =  IntStream.of(height_copy).boxed().collect(Collectors.toList());
		
//		Remove Duplicate 
		
		for (int i = 0 ; i < height.length; i++ ) {
			
			for (int n  = i+1 ;  n < height.length ; n++) {
				if ( height[i] == height[n] ) {
					ArrayList.remove(n);
					
				}
			}
		}
		
		
		
		height = ArrayList.stream().mapToInt(Integer :: intValue).toArray();
		Arrays.sort(height);

		int second_highest = height[height.length-2];
		
		int first_highest = height[height.length-1];
		
	
		

		
		
		
		
		return (+-(ArrayList.indexOf(first_highest) - ArrayList.indexOf(second_highest))+1)*second_highest;
		
		

	}
	
	
	/*

	private static int most_water(int[] height) {
		
		int[] height_copy = height.clone();
		
//		System.out.println(Arrays.toString(height_copy));
		
		int second_highest = second_highest(height);
		
		int first_highest = first_highest(height);
		
//		System.out.println(Arrays.toString(height_copy));
		
		List<Integer>  ArrayList =  IntStream.of(height_copy).boxed().collect(Collectors.toList());
		
		
		return (+-(ArrayList.indexOf(first_highest) - ArrayList.indexOf(second_highest))+1)*second_highest;
		
		
	}

	private static int first_highest(int[] height) {
		Arrays.sort(height);
		
		return height[height.length-1];
		
		
	}

	private static int second_highest(int[] height) {
		
		Arrays.sort(height);
		
		return height[height.length-2];
		
	}
	
	*/

}
