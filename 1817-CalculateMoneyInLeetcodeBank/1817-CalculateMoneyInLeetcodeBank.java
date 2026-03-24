// Last updated: 3/24/2026, 11:23:56 AM
class Solution {
    public int totalMoney(int n) {
        int r = 0;
        int a = 7;
        int b = 1;
        int q = n/7;
        int ans = 0;
        r = n%7;
        int c = q+1;
        while(r>0){
            ans+=c;
            c++;
            r--;
        }
        while(q>0){
            
            for(int i=b;i<=a;i++){
                ans+=i;
            }
            a++;
            b++;
            q--;
        }
        
        return ans;
    }
}