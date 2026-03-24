// Last updated: 3/24/2026, 11:22:25 AM
class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int dif[]=new int[s.length()];
        for(int i=0;i<shifts.length;i++){
            int st=shifts[i][0];
            int en=shifts[i][1];
            int dir=shifts[i][2];
            if(dir==1){
                dif[st]+=1;
                if(en<s.length()-1) dif[en+1]-=1;
            }
            else{
                dif[st]-=1;
                if(en<s.length()-1) dif[en+1]+=1;
            }
        }
        for(int i=1;i<dif.length;i++){
            dif[i]+=dif[i-1];
        }
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < dif.length; i++) {
            int shift = dif[i] % 26;
            int newChar = ((s.charAt(i) - 'a' + shift) % 26 + 26) % 26 + 'a';
            ans.append((char) newChar);
        }

        return ans.toString();
    }
}