// Last updated: 9/25/2026, 2:45:13 PM
class Solution {
    public int maximumSwap(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<digits.length;i++){
            map.put(digits[i]-'0',i);  
        }
        for(int i=0;i<digits.length;i++){
            for(int j=9;j>digits[i]-'0';j--){
                if(map.containsKey(j) && map.get(j)>i){
                    int swapIdx=map.get(j);
                    char t=digits[i];
                    digits[i]=digits[swapIdx];
                    digits[swapIdx]=t;
                    return Integer.parseInt(new String(digits));
                }
            }
        }
        return num;
    }
}