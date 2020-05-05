/*
 Day 03

 Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

 Example:
    Input: [-2,1,-3,4,-1,2,1,-5,4],
    Output: 6
    Explanation: [4,-1,2,1] has the largest sum = 6.
 */

public class MaximumSubarray {
    public static void main(String[] args){
        int[] intArray = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(intArray));
    }

    private static int maxSubArray(int[] nums) {
        int currentWindowSum = nums[0];
        int largestSum = nums[0];
        for(int i=1; i<nums.length ; i++){
            currentWindowSum = Math.max(currentWindowSum+nums[i],nums[i]);
            largestSum = Math.max(largestSum,currentWindowSum);
        }
        return largestSum;
    }
}
