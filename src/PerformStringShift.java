/*
 Day 14
 */

public class PerformStringShift  {
    public static void main(String[] args){
        String s = "abc";
        int[][] input = new int[2][];
        input[0] = new int[]{0, 1};
        input[1] = new int[]{1, 2};

        System.out.println(StringShift(s, input));
    }

    public static String StringShift(String s, int[][] input) {
        int result = 0;
        for (int[] i : input){
            if (i[0] == 1){
                result += i[1];
            }else{
                result -= i[1];
            }
        }
        return Shift(s, result);
    }

    private static String Shift(String s, int result){
        String temp = s+s;
        int l = s.length();
        int shift = 0;
        if(result < 0){
            shift = l - (-result % l);
        }else{
            shift = result % l;
        }
        int startIndex = l - shift;
        return temp.substring(startIndex, startIndex+l);
    }
}
