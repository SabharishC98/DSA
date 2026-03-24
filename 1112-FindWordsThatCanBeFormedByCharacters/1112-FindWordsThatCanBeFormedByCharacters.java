// Last updated: 3/24/2026, 11:25:15 AM
class Solution {
    public int countCharacters(String[] words, String chars) {
        int num[]=new int[26];
        int sum=0;
        for(int i=0;i<chars.length();i++){
            num[chars.charAt(i)-97]++;
        }
        for(int i=0;i<words.length;i++){
            int flag=0;
            String s=words[i];
            int nums[]=new int[26];
            for(int j=0;j<s.length();j++){
                nums[s.charAt(j)-97]++;
            }
            for(int j=0;j<s.length();j++){
                if(num[s.charAt(j)-97]<nums[s.charAt(j)-97]) flag=1;
            }
            if(flag==0) sum+=s.length();
        }
        return sum;
    }
}