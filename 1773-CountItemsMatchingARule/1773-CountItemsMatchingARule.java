// Last updated: 9/25/2026, 2:35:09 PM
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c=0,index=0;
        if(ruleKey.equals("color")) index=1;
        else if(ruleKey.equals("name")) index=2;
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(index).equals(ruleValue)) c++;
        }
        return c;
    }
}