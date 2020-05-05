/*
 Day 07

 Given an integer array arr, count element x such that x + 1 is also in arr.
If there're duplicates in arr, count them seperately.

 Example 1:
    Input: arr = [1,2,3]
    Output: 2
 Example 2:
    Input: arr = [1,1,3,3,5,5,7,7]
    Output: 0
 Example 3:
    Input: arr = [1,3,2,3,5,0]
    Output: 3
 Example 4:
    Input: arr = [1,1,2,2]
    Output: 2
 */

import java.util.Collections;
import java.util.ArrayList;

public class CountingElements {
    public static void main(String[] args){
        int[] input = new int[]{1,1,2,2};
        System.out.println(countElements(input));
    }

    public static int countElements(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : arr){
            arrayList.add(i);
        }
        Collections.sort(arrayList);
        int result = 0;
        for (int i : arrayList){
            if (arrayList.contains(i+1)){
                result++;
            }
        }
        return result;
    }
}
