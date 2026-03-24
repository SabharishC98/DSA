// Last updated: 3/24/2026, 11:27:40 AM
class Solution {
    public String[] findWords(String[] words) {
        List<String> ans=new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        
        for (char c : "qwertyuiop".toCharArray()) map.put(c, 1);
        for (char c : "asdfghjkl".toCharArray()) map.put(c, 2);
        for (char c : "zxcvbnm".toCharArray()) map.put(c, 3);

        for(int i=0;i<words.length;i++){
            boolean check=true;
            String temp=words[i].toLowerCase();
            for(int j=0;j<words[i].length()-1;j++){
                if(map.get(temp.charAt(j))!=map.get(temp.charAt(j+1))){
                    check=false;
                    break;
                }
            }
            if(check){
                ans.add(words[i]);
            }
        }
        String[] arr=new String[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i]=ans.get(i);
        }
        return arr;
    }
}