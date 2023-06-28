//CN(using matrix)
class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i =0; i < n; i++) {
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    //row
                    for(int p = 0; p < m; p++)
                    {
                        if(matrix[i][p] != 0){
                            matrix[i][p] = -1;
                        }
                    }
                    //column
                    for(int q = 0; q < n; q++)
                    {
                        if(matrix[q][j] != 0){
                            matrix[q][j] =-1;
                        }
                    }
                }
            }
        }
        for (int i =0; i < n; i++) {
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == -1)
                    matrix[i][j]=0;
            }
        }
        
        // return matrix;
    }
}
