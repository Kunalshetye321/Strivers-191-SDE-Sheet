//Brute force
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int x=-10, repeat = -1, missing = -1;
        int[] hash = new int[n+1];
        for(int i = 0; i < hash.length; i++)
            hash[i] = 0;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i == arr.get(j)){
                    x = hash[i];
                    hash[i] = x+1;
                    // System.out.println(i+","+arr.get(j));
                }
            }
        }

        for(int i = 1; i < hash.length; i++)
        {
            if(hash[i] == 2)
                repeat=i;
            if(hash[i] == 0)
                missing=i;
        }

        int[] mat = {missing, repeat};
        
        return mat;
    }
}