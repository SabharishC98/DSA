// Last updated: 9/25/2026, 2:29:57 PM
class Solution {
    public int countWays(int[][] intervals) {
        List<List<Integer>> l=new ArrayList<>();
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        int ans=0;
        for(int[] i:intervals){
            int a=i[0];
            int b=i[1];
            if(l.size()!=0 && l.get(l.size()-1).get(1)>=a){
                l.get(l.size()-1).set(1,Math.max(b,l.get(l.size()-1).get(1)));
                ans++;
            }
            else{
                List<Integer> temp=new ArrayList<>();
                temp.add(a);
                temp.add(b);
                l.add(temp);
            }
        }
        return (int)pow(2,l.size(),1000000007);
    }
    public long pow(long base,int exp,int mod){
        base=base%mod;
        long res=1;
        while(exp>0){
            if((exp&1)==1) res=res*base%mod;
            base=base*base%mod;
            exp>>=1;
        }
        return res;
    }
}