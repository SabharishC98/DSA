// Last updated: 6/16/2026, 6:33:47 AM
1class Solution {
2    public int maximumSwap(int num) {
3        char[] digits = String.valueOf(num).toCharArray();
4        HashMap<Integer, Integer> map = new HashMap<>();
5        for(int i=0;i<digits.length;i++){
6            map.put(digits[i]-'0',i);  
7        }
8        for(int i=0;i<digits.length;i++){
9            for(int j=9;j>digits[i]-'0';j--){
10                if(map.containsKey(j) && map.get(j)>i){
11                    int swapIdx=map.get(j);
12                    char t=digits[i];
13                    digits[i]=digits[swapIdx];
14                    digits[swapIdx]=t;
15                    return Integer.parseInt(new String(digits));
16                }
17            }
18        }
19        return num;
20    }
21}