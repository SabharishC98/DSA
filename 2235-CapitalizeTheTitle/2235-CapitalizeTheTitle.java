// Last updated: 3/24/2026, 11:23:01 AM
class Solution {
    public String capitalizeTitle(String s) {
        String ans[]=s.split(" ");
        StringBuilder ret=new StringBuilder("");
        for(int i=0;i<ans.length;i++){
            if(ans[i].length()>2){
                for(int j=0;j<ans[i].length();j++){
                    if(j==0){
                        if(ans[i].charAt(j)>=97 && ans[i].charAt(j)<=122){
                            ret.append((char)(ans[i].charAt(j)-32));
                        }
                        else{
                            ret.append(ans[i].charAt(j));
                        }
                    }
                    else{
                        if(ans[i].charAt(j)>=65 && ans[i].charAt(j)<=90){
                            ret.append((char)(ans[i].charAt(j)+32));
                        }
                        else{
                            ret.append(ans[i].charAt(j));
                        }
                    }
                }
            }
            else{
                for(int j=0;j<ans[i].length();j++){
                    if(ans[i].charAt(j)>=65 && ans[i].charAt(j)<=90){
                        ret.append((char)(ans[i].charAt(j)+32));
                    }
                    else{
                        ret.append(ans[i].charAt(j));
                    }
                }
            }
            if(i!=ans.length-1){
                    ret.append(" ");
                }
        }
        return ret.toString();
    }
}