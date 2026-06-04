class ques2 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int oldR= mat.length;
        int oldC= mat[0].length;
        if(oldR*oldC!=r*c)
        return mat;
        int [][]ans=new int[r][c];
        int row=0;
        int column=0;
        for(int i = 0;i<oldR;i++){
            for(int j=0;j<oldC;j++){
                ans[row][column]=mat[i][j];
                    column++;
                    if(column==c){
                        column=0;
                        row++;
                    }
                                }
        }
        return ans;
    }
}