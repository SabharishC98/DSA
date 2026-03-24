// Last updated: 3/24/2026, 11:22:33 AM
class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8){
            return false;
        }
        int l=0,u=0,d=0,s=0;
        for(int i=0;i<password.length();i++){
            if(i!=0 && password.charAt(i)==password.charAt(i-1)){
                return false;
            }
            char c=password.charAt(i);
            if(c>96 && c<124) l=1;
            else if(c>64 && c<92) u=1;
            else if(c>47 && c<58) d=1;
            else s=1;
        }
        return (l==1 && u==1 && s==1 && d==1);
    }
}