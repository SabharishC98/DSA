// Last updated: 3/24/2026, 11:28:47 AM
class Solution {
    public boolean wordPattern(String p, String s) {
        char[] ch1=p.toCharArray();
        String[] ch2=s.split(" ");
        if(ch1.length!=ch2.length) return false;
        for(int i=0;i<ch1.length;i++){
            for(int j=i+1;j<ch2.length;j++){
                if(ch1[i]==ch1[j]){
                    if(!ch2[i].equals(ch2[j])) return false;
                }
                if(ch2[i].equals(ch2[j])){
                    if(ch1[i]!=ch1[j]){
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}