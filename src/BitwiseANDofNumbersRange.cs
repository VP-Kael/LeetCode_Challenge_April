/*
 Day 23

 Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.

 Example 1:
    Input: [5,7]
    Output: 4

 Example 2:
    Input: [0,1]
    Output: 0
 */

using System;

namespace BitwiseANDofNumbersRange
{
    internal class BitwiseANDofNumbersRange
    {
        public static void Main(string[] args)
        {
            var m = 5;
            var n = 7;
            
            var testProgram = new BitwiseANDofNumbersRange();
            Console.WriteLine(testProgram.RangeBitwiseAnd(m, n));
        }
        public int RangeBitwiseAnd(int m, int n) {
            int x, mask = -1;
            for (x = n - m; x != 0; x >>= 1) mask <<= 1;
            return m & n & mask;
        }
    }
}