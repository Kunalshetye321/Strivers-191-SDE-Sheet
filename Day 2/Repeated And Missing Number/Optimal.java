import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int repeat = -1, missing = -1;
        long sN = (long)(n*(n+1))/2;
        long s2N = (long)(n*(n+1)*(2*n+1))/6;
        long S=0, S2=0;

        for(int i = 0; i < n; i++)
        {
            S += arr.get(i);
            S2 += (long)arr.get(i)* (long)arr.get(i);
        }

        //x+y
        long a = S - sN;//x+y
        long b = S2 - s2N;//x2-y2
        b = b/a;//x-y

        repeat = (int)(a+b)/2;
        missing = (int)(a-b)/2;


        int[] mat = {missing*-1, repeat};
        
        return mat;
    }
}