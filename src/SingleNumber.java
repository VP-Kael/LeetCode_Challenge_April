/*
 Day 01

 Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

 Example 1:
    Input: [2,2,1]
    Output: 1
 Example 2:
    Input: [4,1,2,1,2]
    Output: 4
 */

import  java.util.ArrayList;

public class SingleNumber {
    public static void main(String[] args){
        int[] input = {4,1,2,1,2};
        System.out.println(singleNumber(input));
    }

    /*
    public static int singleNumber(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int num : nums) {
            if (temp.contains(num)) {
                temp.remove((Integer) num);
            } else {
                temp.add(num);
            }
        }
        return temp.get(0);
    }
    */
    private static int singleNumber(int[] nums){
        int result = 0;
        for (int i : nums){
            result = result^i;
        }
        return result;
    }
}
