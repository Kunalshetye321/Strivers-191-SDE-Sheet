import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
    	// Write your code here.
        for (int i =0; i < n; i++) {
            for(int j = 0; j < m; j++){
                if(matrix.get(i).get(j) == 0){
                    //row
                    for(int p = 0; p < m; p++)
                    {
                        if(matrix.get(i).get(p) != 0){
                            matrix.get(i).set(p,-1);
                        }
                    }
                    for(int q = 0; q < n; q++)
                    {
                        if(matrix.get(q).get(j) != 0){
                            matrix.get(q).set(j,-1);
                        }
                    }
                }
            }
        }
        for (int i =0; i < n; i++) {
            for(int j = 0; j < m; j++){
                if(matrix.get(i).get(j) == -1)
                    matrix.get(i).set(j, 0);
            }
        }
        // System.out.println(matrix);
        return matrix;
    }
}