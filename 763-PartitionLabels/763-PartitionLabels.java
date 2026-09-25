// Last updated: 9/25/2026, 2:44:11 PM
class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] arr=new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        int count=0;
        List<Integer> ans=new ArrayList<>();
        List<Integer> index=new ArrayList<>();
        Map<Character,Boolean> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),true);
            arr[s.charAt(i)-'a']--;
            if(arr[s.charAt(i)-'a']==0){
                count++;
            }
            if(count==map.size()){
                count=0;
                map=new HashMap<>();
                if(ans.size()==0){
                    ans.add(i+1);
                    index.add(i);
                }
                else{
                    // System.out.println(i+" "+ans.get(ans.size()-1));
                    
                    ans.add(i-index.get(index.size()-1));
                    index.add(i);
                }
            }
        }
        return ans;
    }
}