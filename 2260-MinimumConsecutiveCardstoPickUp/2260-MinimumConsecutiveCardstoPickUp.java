// Last updated: 7/28/2026, 3:19:43 PM
1class Solution {
2    public int minimumCardPickup(int[] cards) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        int i=0,j=0,max=Integer.MAX_VALUE;
5        while(j<cards.length){
6            map.put(cards[j],map.getOrDefault(cards[j],0)+1);
7            while(i<cards.length && map.get(cards[j])>1){
8                
9                map.put(cards[i],map.get(cards[i])-1);
10                if(cards[i]==cards[j])
11                max=Math.min(max,j-i+1);
12                // System.out.println(i+" "+j);
13                i++;
14                
15            }
16            j++;
17        }
18        return max==Integer.MAX_VALUE?-1:max;
19    }
20}