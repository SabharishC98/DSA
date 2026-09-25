// Last updated: 9/25/2026, 2:32:50 PM
class Solution {
    public int numberOfBeams(String[] bank) {
        int prev=0,ans=0;
        int count=0;
        for(int i=0;i<bank.length;i++){
            for(char ch:bank[i].toCharArray()){
                if(ch=='1') count++;
            }
            if(count!=0){
                ans+=prev*count;
                prev=count;
                count=0;
            }
        }
        return ans;
    }
}