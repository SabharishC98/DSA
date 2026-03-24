// Last updated: 3/24/2026, 11:21:45 AM
class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder s=new StringBuilder("");
        int flag=0;
        for(int i=num.length()-1;i>=0;i--){
            if(flag==0 && num.charAt(i)=='0'){continue; }
            else{
                flag=1;
                s.append(num.charAt(i));
            }
        }
        StringBuilder ans=new StringBuilder("");
        for(int i=s.length()-1;i>=0;i--){
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}