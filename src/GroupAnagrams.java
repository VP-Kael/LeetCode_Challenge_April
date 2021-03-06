/*
 Day 06

 Given an array of strings, group anagrams together.

 Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 Output:
 [
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
 ]
 */

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class GroupAnagrams{
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();

        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for(String str: strs){
            char[] arr = new char[26];
            for(int i=0; i<str.length(); i++){
                arr[str.charAt(i)-'a']++;
            }
            String ns = new String(arr);

            if(map.containsKey(ns)){
                map.get(ns).add(str);
            }else{
                ArrayList<String> al = new ArrayList<String>();
                al.add(str);
                map.put(ns, al);
            }
        }

        result.addAll(map.values());

        return result;
    }
}
