package coreJava;

import java.util.BitSet;

public class Arrays {
    public static void biggestAndSmallestNumber(int arr[]) {
        int smallest = arr[0];
        int biggest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > biggest) {
                biggest = arr[i];
            } else if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest Number : " + smallest + "  " + "Biggest Number : " + biggest);
    }

    public static int findMissingNumber(int numbers[], int totalCount) {
        int expectedSum = totalCount * ((totalCount + 1) / 2);
        int actualSum = 0;
        for (int i : numbers) {
            actualSum += i;
        }
        return expectedSum - actualSum;
    }

    public static int countClumps(int[] nums) {
        boolean match;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] ) {
                match = true;
                count++;
            } else if (nums[i] != nums[i + 1]) {
                match = false;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int arr[] = {4, 7, 9, 10, 2, 2, 10};
        biggestAndSmallestNumber(arr);
        int arr1[] = {1, 2, 3, 5, 6, 7, 8, 9};
        System.out.println(findMissingNumber(arr1, 9));
        int a [] = {1, 2, 2, 3, 4, 4};
        System.out.println(countClumps(a));

    }
}
