// Last updated: 3/24/2026, 11:21:33 AM
class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size()!=s.length()){
            return false;
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<words.size();i++){
            ans.append(words.get(i).charAt(0));
        }
        return s.equals(ans.toString());
    }
}