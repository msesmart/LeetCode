public class powX_N{
    public double myPow(double x, int n) {
        if(n>=0)return power(x,n);
        else return 1.0/power(x,-n);
    }
    public double power(double x,int n){
        if(n==0)return 1;
        double temp=power(x,n/2);
        if(n%2==0)return temp*temp;
        else return temp*temp*x;
    }
}