public class perfectSquares{
    public int numSquares(int n) {
        while(n%4==0)n=n/4;
        if(n%8==7)return 4;
        for(int i=0;i*i<=n;i++){
            int j=(int)Math.sqrt(n-i*i);
            if(j*j+i*i==n){
                return (i>0?1:0)+(j>0?1:0);
            }
        }
        return 3;
    }
}