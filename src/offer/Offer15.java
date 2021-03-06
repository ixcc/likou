package offer;

public class Offer15 {
    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0){
            res++;
            n = n&(n-1);
        }
        return res;
    }

    public int hammingWeight2(int n) {
        int res = 0;
        while (n != 0){
            res +=n&1;
            n>>>=1;
        }
        return res;
    }
}
