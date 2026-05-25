// Last updated: 5/25/2026, 11:37:19 AM
1class Solution {
2    public int longestCommonPrefix(int[] arr1, int[] arr2) {
3        int max=0;
4        Set<Integer> set=new HashSet<>();
5        for(int i:arr1){
6            while(i>0){
7                set.add(i);
8                i/=10;
9            }
10        }
11        for(int i:arr2){
12            while(i>0){
13            if(String.valueOf(i).length()<=max) break;
14            if(set.contains(i)){
15                max=Math.max(max,String.valueOf(i).length());
16                break;
17            }
18            i/=10;
19            }
20        }
21        return max;
22    }
23}