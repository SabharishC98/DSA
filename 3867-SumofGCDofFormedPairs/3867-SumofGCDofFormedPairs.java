// Last updated: 7/16/2026, 12:21:25 PM
1class Solution {
2    public long gcdSum(int[] nums) {
3        // Arrays.sort(nums);
4        long sum=0L;
5        int[] prefix=new int[nums.length];
6        prefix[0]=nums[0];
7        int max=nums[0];
8        for(int i=1;i<nums.length;i++){
9            max=Math.max(max,nums[i]);
10            prefix[i]=gcd(max,nums[i]);
11            // System.out.println(prefix[i]);
12        }
13        Arrays.sort(prefix);
14        int i=0,j=nums.length-1;
15        while(i<j){
16            sum+=gcd(prefix[i],prefix[j]);
17            i++;
18            j--;
19        }
20        return sum;
21        // return 0L;
22    }
23    public int gcd(int a,int b){
24        if(b==0) return a;
25        return gcd(b,a%b);
26    }
27}