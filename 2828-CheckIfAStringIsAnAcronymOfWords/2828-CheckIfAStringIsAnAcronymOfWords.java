// Last updated: 9/25/2026, 2:28:30 PM
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