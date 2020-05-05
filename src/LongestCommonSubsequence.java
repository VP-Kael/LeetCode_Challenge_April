/*
 Day 26

 Given two strings text1 and text2, return the length of their longest common subsequence.
 A subsequence of a string is a new string generated from the original string with some characters(can be none) deleted without changing the relative order of the remaining characters. (eg, "ace" is a subsequence of "abcde" while "aec" is not). A common subsequence of two strings is a subsequence that is common to both strings.
 If there is no common subsequence, return 0.

 Example 1:
    Input: text1 = "abcde", text2 = "ace"
    Output: 3
    Explanation: The longest common subsequence is "ace" and its length is 3.

 Example 2:
    Input: text1 = "abc", text2 = "abc"
    Output: 3
    Explanation: The longest common subsequence is "abc" and its length is 3.

 Example 3:
    Input: text1 = "abc", text2 = "def"
    Output: 0
    Explanation: There is no such common subsequence, so the result is 0.
 */

public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        if(text1 == null || text2 == null || text1.length() == 0 || text2.length() == 0)
            return 0;

        char[] letters1 = text1.toCharArray();
        char[] letters2 = text2.toCharArray();
        int M = letters1.length;
        int N = letters2.length;
        int i, j;

        int[][] lcsLength = new int[M + 1][N + 1];

        for(i = 1; i <= M; i++){
            for(j = 1; j <= N; j++){
                if(letters1[i - 1] == letters2[j - 1]){
                    lcsLength[i][j] = 1 + lcsLength[i - 1][j - 1];
                }else{
                    lcsLength[i][j] = Math.max(lcsLength[i - 1][j], lcsLength[i][j - 1]);
                }
            }
        }

        return lcsLength[M][N];
    }
}
