/*
 Day 09

 Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

 Note that after backspacing an empty text, the text will continue empty.

 Example1:
    Input: S = "ab#c", T = "ad#c"
    Output: true
    Explanation: Both S and T become "ac".

 Example2:
    Input: S = "ab##", T = "c#d#"
    Output: true
    Explanation: Both S and T become "".

 Example3:
    Input: S = "a##c", T = "#a#c"
    Output: true
    Explanation: Both S and T become "c".

 Example4:
    Input: S = "a#c", T = "b"
    Output: false
    Explanation: S becomes "c" while T becomes "b".
 */

public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        int i = S.length()-1;
        int j = T.length()-1;

        while(i>=0 || j>=0){
            int c1=0;
            while(i>=0 && (c1>0 || S.charAt(i)=='#')){
                if(S.charAt(i)=='#'){
                    c1++;
                }else{
                    c1--;
                }

                i--;
            }

            int c2=0;
            while(j>=0 && (c2>0 || T.charAt(j)=='#')){
                if(T.charAt(j)=='#'){
                    c2++;
                }else{
                    c2--;
                }

                j--;
            }

            if(i>=0 && j>=0){
                if(S.charAt(i)!=T.charAt(j)){
                    return false;
                }else{
                    i--;
                    j--;
                }
            }else{
                if(i>=0 || j>=0){
                    return false;
                }
            }
        }

        return i<0 && j<0;
    }
}
