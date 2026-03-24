// Last updated: 3/24/2026, 11:20:48 AM
class Solution {
    public String smallestPalindrome(String s) {
        int arr[]=new int[26];
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-97]++;
        }
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        StringBuilder ch1=new StringBuilder();
        int c=0;
        for(int i=0;i<ch.length;i++){
            if(arr[ch[i]-97]%2!=0 && c==arr[ch[i]-97]-1){
                ch1.append(String.valueOf(ch[i]));
                c++;
            }
            else{
                if(c>=arr[ch[i]-97]/2) s2.insert(0,String.valueOf(ch[i]));
                else s1.append(String.valueOf(ch[i]));
                c++;
            }
            if(i!=ch.length-1 && ch[i]!=ch[i+1]) c=0;
        }
        if(ch1.length()==0) return String.valueOf(s1)+String.valueOf(s2);
        return String.valueOf(s1)+String.valueOf(ch1)+String.valueOf(s2);
    }
}