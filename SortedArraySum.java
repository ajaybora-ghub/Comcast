package com.java.test;


/*
 *   Using two pointer to solve the problem.
 *   Left Pointer is set to 0 index of array
 *   Right Pointer is set to last index of array
 *   If sum of elements at left and right pointers = total return the left, right indexes
 *   Else if sum of elements at left and right pointers is > total decrement right pointer by 1
 *   Else if sum of elements at left and right pointers < total increment left pointer by 1
 *   If no match return null
 * 
 */
public class SortedArraySum {

	public static void main(String[] args) {
		
		int numbers[] = {2, 7, 11, 15};
		int total = 9;
		int result[] = sortedArraySum(numbers, total);
		
		if(result!=null) {
			System.out.println("[" + result[0] + "," + result[1] + "]");
		}

	}
	

    public static int[] sortedArraySum(int[] numbers, Integer total) {
        int[] pair = new int[2];
        int leftPointer = 0;
        int rightPointer = numbers.length - 1;

        while (leftPointer < rightPointer) {

            if (numbers[leftPointer] + numbers[rightPointer] == total) {
            	pair[0]=leftPointer + 1;
            	pair[1]=rightPointer + 1;
                return pair;
            }

            else if (numbers[leftPointer] + numbers[rightPointer] < total) {
            	leftPointer++;
            }

            else {
            	rightPointer--;
            }
        }
        

        return null;
    }

}
