class Solution {
public:
    double myPow(double x, int y) {
        int n= abs(y);
        double ans =1.0;
        while(n>=1){
            if(n&1)
            ans *= x;
            n/=2;
            x*=x;
        }
        return y<0? 1/ans: ans;
    }
};