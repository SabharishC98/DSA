// Last updated: 3/24/2026, 11:27:23 AM
class Solution {
    public String reverseStr(String s, int k) {
        if(k==1) return s;
        StringBuffer ans=new StringBuffer("");
        for(int i=0;i<s.length();i++){
            int k2=i+2*k-1;
            StringBuffer temp=new StringBuffer("");
            int f=0;
            if(i+k-1>s.length()){
                f=1;
                for(int j=i;j<s.length();j++)
                temp.insert(0,s.charAt(j));
            }
            if(f==1) {ans.append(temp); break;}
            int c=0;
            for(int j=i;j<=k2 && j<s.length();j++){
                if(c<k){
                    temp.insert(0,s.charAt(j));c++;
                }
                else temp.append(s.charAt(j));
            }
            ans.append(temp);
            i+=2*k-1;
        }
        return ans.toString();
    }
}