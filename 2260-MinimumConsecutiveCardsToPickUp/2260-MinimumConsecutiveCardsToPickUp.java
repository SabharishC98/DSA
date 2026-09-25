// Last updated: 9/25/2026, 2:32:11 PM
class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0,j=0,max=Integer.MAX_VALUE;
        while(j<cards.length){
            map.put(cards[j],map.getOrDefault(cards[j],0)+1);
            while(i<cards.length && map.get(cards[j])>1){
                
                map.put(cards[i],map.get(cards[i])-1);
                if(cards[i]==cards[j])
                max=Math.min(max,j-i+1);
                // System.out.println(i+" "+j);
                i++;
                
            }
            j++;
        }
        return max==Integer.MAX_VALUE?-1:max;
    }
}