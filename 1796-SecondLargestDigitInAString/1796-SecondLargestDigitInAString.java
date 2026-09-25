// Last updated: 9/25/2026, 2:35:06 PM
class Solution {
    public int secondHighest(String s) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=48 && s.charAt(i)<=57){
                if(!a.contains(s.charAt(i)-48))
                    a.add(s.charAt(i)-48);
            }
        }
        if(a.size()==0) return -1;
        int max=a.get(0);
        int sec=-1;
        for(int i:a){
            if(i>max){
                sec=max;
                max=i;
            }
            if(i>sec && i<max){
                sec=i;
            }
        }
        return sec;
    }
}