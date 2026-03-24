// Last updated: 3/24/2026, 11:24:30 AM
class Solution {
    public int numberOfSubstrings(String s) {
        int i=0,j=0,max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(j<s.length()){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
            
            while(map.size()==3){
                max+=s.length()-(j);
                char ch1=s.charAt(i);
                map.put(ch1,map.get(ch1)-1);
                if(map.get(ch1)==0) map.remove(ch1);
                i++;
            }
            
            j++;
        }
        return max;
    }
}