public class DungeonGame{
    public int calculateMinimumHP(int[][] dungeon) {
        int m=dungeon.length;
        int n=dungeon[0].length;
        int[][] miniHp=new int[m][n];
        int[][] maxHp=new int[m][n];
        
        maxHp[m-1][n-1]=dungeon[m-1][n-1];
        miniHp[m-1][n-1]=-1*maxHp[m-1][n-1];
        for(int j=n-2;j>=0;j--){
            maxHp[m-1][j]=dungeon[m-1][j]+maxHp[m-1][j+1];
            miniHp[m-1][j]=(-1*maxHp[m-1][j])>miniHp[m-1][j+1]?(-1*maxHp[m-1][j]):miniHp[m-1][j+1];
        }
        for(int i=m-2;i>=0;i--){
            maxHp[i][n-1]=dungeon[i][n-1]+maxHp[i+1][n-1];
            miniHp[i][n-1]=(-1*maxHp[i][n-1])>miniHp[i+1][n-1]?(-1*maxHp[i][n-1]):miniHp[i+1][n-1];
        }
        
        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
               int up=-1*(dungeon[i][j]+maxHp[i+1][j]);
               int right=-1*(dungeon[i][j]+maxHp[i][j+1]);
               up=up>miniHp[i+1][j]?up:miniHp[i+1][j];
               right=right>miniHp[i][j+1]?right:miniHp[i][j+1];
               if(up>right){
                   maxHp[i][j]=dungeon[i][j]+maxHp[i][j+1];
                   miniHp[i][j]=(-1*maxHp[i][j])>miniHp[i][j+1]?(-1*maxHp[i][j]):miniHp[i][j+1];
               }else{
                   maxHp[i][j]=dungeon[i][j]+maxHp[i+1][j];
                   miniHp[i][j]=(-1*maxHp[i][j])>miniHp[i+1][j]?(-1*maxHp[i][j]):miniHp[i+1][j];
               }
            }
        }
        return (miniHp[0][0]>=0?miniHp[0][0]:0)+1;
    }
}