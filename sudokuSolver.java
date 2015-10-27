public class sudokuSolver{
    public void solveSudoku(char[][] board) {
        if(board==null||board.length!=9||board[0].length!=9)return;
        int[][] row=new int[9][10];
        int[][] col=new int[9][10];
        int[][][] puzzle=new int[3][3][10];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    int index=(int)(board[i][j]-'0');
                    puzzle[i/3][j/3][index]=1;
                    row[i][index]=1;col[j][index]=1;
                }
            }
        }
        sudoku(board,row,col,puzzle,0,0);
    }
    
    public boolean sudoku(char[][] board,int[][] row,int[][]col,int[][][] puzzle,int i,int j){
        if(j>=9){i++;j=0;}
        if(i==9)return true;
        if(board[i][j]=='.'){
            for(int k=1;k<=9;k++){
                if(puzzle[i/3][j/3][k]==0&&row[i][k]==0&&col[j][k]==0){
                    board[i][j]=(char)('0'+k);
                    puzzle[i/3][j/3][k]=1; row[i][k]=1; col[j][k]=1;
                    if(sudoku(board,row,col,puzzle,i,j+1))return true;
                    board[i][j]='.';
                    puzzle[i/3][j/3][k]=0; row[i][k]=0; col[j][k]=0;
                }
            }
            return false;
        }else{
            return sudoku(board,row,col,puzzle,i,j+1);
        }
    }
}