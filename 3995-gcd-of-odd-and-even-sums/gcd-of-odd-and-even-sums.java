class Solution {
    public int gcd(int a,int b)
    {
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public int gcdOfOddEvenSums(int n) {
        int sumEven=0;
        int sumOdd=0;
        int even=2;
        int odd=1;
        for(int i=1;i<=n;i++)
        {
             sumEven+=even;
             sumOdd+=odd;
             even+=2;
             odd+=2;
        }
        return gcd(sumEven,sumOdd);
    }
}