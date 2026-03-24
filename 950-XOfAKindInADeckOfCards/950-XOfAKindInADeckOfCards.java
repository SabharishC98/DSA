// Last updated: 3/24/2026, 11:25:49 AM
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Arrays.sort(deck);
        int c=1,ans=0;
        for(int i=1;i<deck.length;i++){
            if(deck[i]==deck[i-1]) c++;
            else{
                if(ans==0) ans=c;
                else{
                    if(gcd(ans,c)==1) return false;
                    else ans=gcd(ans,c);
                }
                c=1;
            }
        }
        
        if(ans==0) ans=c;
        if(gcd(ans,c)==1 || ans<=1) return false;
        return true;
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}