class Solution {

    public void markRow(int[][] matrix, List<Integer> row, int m){
        for(int r:row){
            for(int k=0;k<m;k++)
                 matrix[r][k]=0;
        }
    }

    public void markCol(int[][] matrix, List<Integer> col, int n){
        for(int c:col){
            for(int k=0;k<n;k++)
                 matrix[k][c]=0;
        }
    }

    public void setZeroes(int[][] matrix){

        int n=matrix.length;
        int m=matrix[0].length;

        List<Integer> row=new ArrayList<Integer>();
        List<Integer> col=new ArrayList<Integer>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        markRow(matrix, row, m);
        markCol(matrix, col,n);
    }
}