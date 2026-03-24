// Last updated: 3/24/2026, 11:22:12 AM
class Solution {
    public int bestClosingTime(String customers) {
        int s=0,min=0,ans=0;
        for(int i=0;i<customers.length();i++){
            char ch=customers.charAt(i);
            if(ch=='Y') s+=1;
        }
        min=s;
        for(int i=0;i<customers.length();i++){
            char ch=customers.charAt(i);
            if(ch=='Y') s-=1;
            else s+=1;
            if(s<min){
                min=s;
                ans=i+1;
            }
        }
        return ans;
    }
}