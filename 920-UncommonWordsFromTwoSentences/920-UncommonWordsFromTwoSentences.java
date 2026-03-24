// Last updated: 3/24/2026, 11:25:56 AM
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> map=new HashMap<>();
        String s="";
        List<String> arr=new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==' '){
                map.put(s,map.getOrDefault(s,0)+1);
                s="";
            }
            else{
                s+=s1.charAt(i);
            }
        }
        map.put(s,map.getOrDefault(s,0)+1);
        s="";
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)==' '){
                map.put(s,map.getOrDefault(s,0)+1);
                s="";
            }
            else{
                s+=s2.charAt(i);
            }
        }
        map.put(s,map.getOrDefault(s,0)+1);
        for(String i:map.keySet()){
            if(map.get(i)==1) arr.add(i);
        }
        String[] ans=new String[arr.size()];
        for(int i=0;i<arr.size();i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
}