public class gameOfLife{
    public void gameOfLife(int[][] board) {
        if(board==null) return;
        int row=board.length;
        int col=board[0].length;
        int[][] life=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i>0)life[i-1][j]+=board[i][j];
                if(j>0)life[i][j-1]+=board[i][j];
                if(i>0&&j>0)life[i-1][j-1]+=board[i][j];
                if(i<row-1)life[i+1][j]+=board[i][j];
                if(j<col-1)life[i][j+1]+=board[i][j];
                if(i<row-1&&j<col-1)life[i+1][j+1]+=board[i][j];
                if(i>0&&j<col-1)life[i-1][j+1]+=board[i][j];
                if(i<row-1&&j>0)life[i+1][j-1]+=board[i][j];
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(life[i][j]<2||life[i][j]>3)board[i][j]=0;
                if(life[i][j]==3)board[i][j]=1;
            }
        }
        return;
    }
}