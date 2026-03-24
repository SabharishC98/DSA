// Last updated: 3/24/2026, 11:32:32 AM
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
        if(digits.length()==0) return list;
        Map<Character, char[]> keyboard = Map.of(
            '2', new char[] { 'a', 'b', 'c' },
            '3', new char[] { 'd', 'e', 'f' },
            '4', new char[] { 'g', 'h', 'i' },
            '5', new char[] { 'j', 'k', 'l' },
            '6', new char[] { 'm', 'n', 'o' },
            '7', new char[] { 'p', 'q', 'r', 's' },
            '8', new char[] { 't', 'u', 'v' },
            '9', new char[] { 'w', 'x', 'y', 'z' });
            check(list,new StringBuilder(),digits,keyboard,0);
            return list;

    }
    public void check(List<String> list,StringBuilder temp,String digits,Map<Character, char[]> keyboard,int next){
        if(temp.length()==digits.length()){
            list.add(new String(temp));
            return;
        }
        if(next>=digits.length()) return;
        for(int i=0;i<keyboard.get(digits.charAt(next)).length;i++){
            temp.append(keyboard.get(digits.charAt(next))[i]);
            check(list,temp,digits,keyboard,next+1);
            temp.delete(temp.length()-1,temp.length());
        }
    }
}