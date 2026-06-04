class ques3 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>op=new ArrayList<>();
        int top =0;
        int bottom= matrix.length-1;
        int left=0;
        int right= matrix[0].length-1;
        while(top<=bottom && left<=right ){
            for( int j = left ; j<= right ; j++)
            op.add(matrix[top][j]);
            top++;
            for( int i = top ; i<= bottom ; i++)
            op.add(matrix[i][right]);
            right--;
            if(top<=bottom){
                for(int j = right ; j>=left;j--)
                op.add(matrix[bottom][j]);
                bottom--;
            }
             if(left<=right){
                for(int i = bottom ; i>=top;i--)
                op.add(matrix[i][left]);
                left++;
            }
        }
        return op;
    }
}