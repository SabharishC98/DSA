// Last updated: 3/24/2026, 11:24:34 AM
class Solution {
    public int maximum69Number (int num) {
        int ans=0,flag=0;
        int len = String.valueOf(num).length()-1;
        while(num>0 && len>0){
            int r=(int)(num/(Math.pow(10,len)));
            if(r==6 && flag==0){
                r=9;
                flag=1;
            }
            ans=ans*10+r;
            num=(int)(num%(Math.pow(10,len)));
            len--;
        }
        if(flag==0) ans=ans*10+9;
        else ans=ans*10+num;
        return ans;
    }
}