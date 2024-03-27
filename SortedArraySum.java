package com.java.test;

/*
 *   Using two pointer to solve the problem.
 *   Left Pointer is set to 0 index of array
 *   Right Pointer is set to last index of array
 *   if sum if elements at left and right pointer = total return the left, right indexes
 * 	 Else if sum is > total decrement right pointer by 1
 *   Else if sum < total increment left pointer by 1
 *   If no match return null
 * 
 */

public class SortedArraySum {

	public static void main(String[] args) {
		
		int numbers[] = {2, 7, 11, 15};
		int total = 9;
		int result[] = sortedArraySum(numbers, total);
		
		System.out.println("[" + result[0] + "," + result[1] + "]");

	}
	

    public static int[] sortedArraySum(int[] numbers, Integer total) {
        int[] pair = new int[2];
        int leftPivot = 0;
        int rightPivot = numbers.length - 1;

        while (leftPivot < rightPivot) {

            if (numbers[leftPivot] + numbers[rightPivot] == total) {
            	pair[0]=leftPivot + 1;
            	pair[1]=rightPivot + 1;
                return pair;
            }

            else if (numbers[leftPivot] + numbers[rightPivot] < total) {
            	leftPivot++;
            }

            else {
            	rightPivot--;
            }
        }

        return null;
    }

}
