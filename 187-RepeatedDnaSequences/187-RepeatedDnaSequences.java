// Last updated: 9/25/2026, 2:51:06 PM
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer> map=new HashMap<>();
        List<String> ans=new ArrayList<>();
        if(s.length()<=10) return ans;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<10;i++){
            sb.append(s.charAt(i));
        }
        map.put(sb.toString(),map.getOrDefault(sb.toString(), 0)+1);
        for(int i=10;i<s.length();i++){
            sb.deleteCharAt(0);
            sb.append(s.charAt(i));
            map.put(sb.toString(),map.getOrDefault(sb.toString(), 0)+1);
        }
        // System.out.println(map);
        for(String i:map.keySet()){
            if(map.get(i)>1) ans.add(i);
        }
        return ans;
    }
}