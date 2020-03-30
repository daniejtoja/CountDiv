// you can also use imports, for example:
// import java.util.*;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int A, int B, int K) {

        if (A % K == 0) {
            return (int)Math.floor((B - A) / K) + 1;
        } else {
            return (int)Math.floor((B - (A - (A % K))) / K);
        }
    }
}