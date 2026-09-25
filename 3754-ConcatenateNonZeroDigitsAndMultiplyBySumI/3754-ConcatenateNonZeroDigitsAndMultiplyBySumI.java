// Last updated: 9/25/2026, 2:25:11 PM
class Solution {
    public long sumAndMultiply(int n) {
        long sum=0L;
        long num=0L;
        String s=String.valueOf(n);
        for(char ch:s.toCharArray()){
            if(ch=='0') continue;
            sum+=ch-'0';
            num=num*10+(ch-'0');
        }
        return sum*num;
    }
}