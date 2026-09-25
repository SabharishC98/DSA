// Last updated: 9/25/2026, 2:48:13 PM
class Solution {
    public int longestSubstring(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int max=0;
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            int count=0;
            Map<Character,Integer> temp=new HashMap<>();
            if(s.length()-i<max) break;

            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                temp.put(ch,temp.getOrDefault(ch,0)+1);
                if(temp.get(ch)>=k && temp.get(ch)-1<k){
                    count++;
                }
                if(count==temp.size()){
                    max=Math.max(max,j-i+1);
                }
                if(map.get(ch)-temp.get(ch)==0 && temp.get(ch)<k) break;
            }
            map.put(s.charAt(i),map.get(s.charAt(i))-1);
        }
        // int i=0,j=0,max=0;
        // Map<Character,Integer> temp=new HashMap<>();
        // while(j<s.length() && i<s.length()){
        //     char ch=s.charAt(j);
        //     temp.put(ch,temp.getOrDefault(ch,0)+1);
        //     if(temp.get(ch)>=k && temp.get(ch)-1<k){
        //         count++;
        //     }
        //     if(count==temp.size()){
        //         max=Math.max(max,j-i+1);
        //         System.out.println(i+" "+j);
        //     }
        //     while(i<=j && map.get(ch)-temp.get(ch)<=0 && temp.get(ch)<k){
        //         System.out.println(i+" iubiubs "+j);
        //         char c=s.charAt(i);
        //         temp.put(c,temp.getOrDefault(c,0)-1);
        //         if(temp.get(c)<k && temp.get(c)+1==k) count--;
        //         if(count==temp.size()){
        //             max=Math.max(max,j-i+1);
        //         }
        //         if(temp.get(c)==0) temp.remove(c);
        //         j=i;
        //         i++;
        //         count=0;
        //         temp=new HashMap<>();
        //         break;
        //     }
        //     j++;
        //     if(j==s.length()){
        //         i++;
        //         j=i;
        //     }
        // }
        return max;
    }
}