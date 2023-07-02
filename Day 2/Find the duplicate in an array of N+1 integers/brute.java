//find the duplicate
import java.util.*;
import java.io.*;

class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++)
        {
            if(!hmap.containsKey(nums[i]))
            {
                hmap.put(nums[i], 1);
            }
            else
            {
                int cnt = hmap.get(nums[i]);
                hmap.put(nums[i], ++cnt);
            }
        }
        for (Map.Entry<Integer, Integer> e : hmap.entrySet())
	            if(e.getValue() > 1)
                    return e.getKey();

        return -1;
    }
}