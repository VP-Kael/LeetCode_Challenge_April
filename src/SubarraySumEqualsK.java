/*
 Day 22

 Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

 Example:
    Input:nums = [1,1,1], k = 2
    Output: 2
 */

import java.util.HashMap;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return k==nums[0]?1:0;
        }

        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> sums = new HashMap<>();

        for(int i : nums){
            sum += i;
            if(sum==k){
                count++;
            }
            if(sums.containsKey(sum-k)){
                count+=sums.get(sum-k);
            }
            sums.put(sum,sums.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
