// Last updated: 3/24/2026, 11:21:38 AM
class Solution {
    public String sortVowels(String s) {
        List<Character> n=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                n.add(ch);
            }
        }
        Collections.sort(n);
        StringBuilder ans=new StringBuilder("");
        int index=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                ans.append(n.get(index++));
            }
            else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}