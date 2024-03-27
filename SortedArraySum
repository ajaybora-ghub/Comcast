package com.java.test;

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

        return pair;
    }

}
