/*
First Transpose the Matrix.
Then Reverse Each Row

*/


class Solution {
    public void rotate(int[][] matrix) {
        int sz=matrix.length;
        for(int i=0;i<sz;i++)
        {
            for(int j=i;j<sz;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<sz;i++)
        {
            int lf=0,rt=sz-1,temp;
            while(lf<rt)
            {
                temp=matrix[i][lf];
                matrix[i][lf]=matrix[i][rt];
                matrix[i][rt]=temp;
                lf++;
                rt--;
            }
        }
    }
}
