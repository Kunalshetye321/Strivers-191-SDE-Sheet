//Better
class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] p = new int[n];
        int[] q = new int[m];

        for(int i = 0; i < n; i++)
            p[i] = -1;
        for(int i = 0; i < m; i++)
            q[i] = -1;

        for (int i =0; i < n; i++) {
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    p[i] = 0;//row's array = 0
                    q[j] = 0;//column's array = 0
                }
            }
        }
        for (int i =0; i < n; i++) {
            for(int j = 0; j < m; j++){
                if(p[i] == 0 || q[j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        
        // return matrix;
    }
}
