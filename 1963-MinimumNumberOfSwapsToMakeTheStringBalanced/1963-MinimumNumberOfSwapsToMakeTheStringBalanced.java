// Last updated: 9/25/2026, 2:34:07 PM
class Solution {
    public int minSwaps(String s) {
        // int open = 0, ans = 0;
        
        // // Pass 1: count unmatched ']'
        // int unmatched = 0;
        // for (char c : s.toCharArray()) {
        //     if (c == '[') open++;
        //     else {
        //         if (open > 0) open--;  // matched
        //         else unmatched++;       // unmatched ']'
        //     }
        // }
        
        // // Each swap fixes 2 unmatched brackets
        // // unmatched is always even (valid input guaranteed)
        // return (unmatched + 1) / 2;


        int ans=0,c=0,o=0;
        int n=s.length()-1,i=0;
        while(i<n){
            if(s.charAt(i)==']'){
                c++;
            }
            else{
                o++;
            }
            if(c>o){
                while(i<n && s.charAt(n)==']'){
                    n--;
                }
                n--;
                ans++;
                c--;
                o++;
            }

            i++;
        }
        return ans;
    }
}