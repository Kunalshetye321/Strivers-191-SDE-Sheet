import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        int m = intervals[0].length;

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        int[] temp = new int[2];
        temp[0] = intervals[0][0];
        temp[1] = intervals[0][1];

        for(int i = 0; i < n; i++)
        {
            int p = intervals[i][0];
            int q = intervals[i][1];
            
            if(temp[1] >= p){//overlap, temp[1] will update
                // temp[1] = q;
                temp[0] = (int)Math.min(temp[0], p);
                temp[1] = (int)Math.max(temp[1], q);
                // System.out.println(temp[0]+","+temp[1]);
            }
            else{
                //not overlap, list mein add, standby will update
                 ArrayList<Integer> li =  new ArrayList<Integer>();
                 li.add(temp[0]);
                 li.add(temp[1]);
                 temp[0] = p;
                 temp[1] = q;
                 res.add(li);
            }
            if(i == n-1){//last iteration
                System.out.println(i+"-"+temp[0]+","+temp[1]);
                ArrayList<Integer> li =  new ArrayList<Integer>();
                 li.add(temp[0]);
                 li.add(temp[1]);
                 res.add(li);
                 break;
            }
        }

        int[][] mat = new int[res.size()][res.get(0).size()];
        for(int i = 0; i < res.size(); i++)
        {
            for(int j = 0; j < res.get(0).size(); j++)
            {
                mat[i][j] = res.get(i).get(j);
            }
        }

        return mat;
    }
}