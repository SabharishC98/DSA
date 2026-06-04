// Last updated: 6/4/2026, 12:15:08 PM
1class Solution {
2    public int sumOfBeauties(int[] nums) {
3        int n=nums.length;
4        int[] max=new int[n];
5        int[] min=new int[n];
6        max[0]=Integer.MIN_VALUE;
7        min[n-1]=Integer.MAX_VALUE;
8        for(int i=1;i<n;i++){
9            max[i]=Math.max(max[i-1],nums[i-1]);
10        }
11        for(int i=n-2;i>=0;i--){
12            min[i]=Math.min(min[i+1],nums[i+1]);
13        }
14        int c=0;
15        for(int i=1;i<n-1;i++){
16            if(nums[i]>max[i] && nums[i]<min[i]) c+=2;
17            else if(nums[i]>nums[i-1] && nums[i]<nums[i+1]) c++;
18            // System.out.println(nums[i]+" "+min[i]+" "+max[i]+" "+c);
19        }
20        return c;
21    }
22}