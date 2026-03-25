// Last updated: 3/25/2026, 9:02:07 AM
1class Solution {
2    public int[] getNoZeroIntegers(int n) {
3        int arr[]=new int[2];
4        for(int i=1;i<n;i++){
5            int a=i;
6            int b=n-i;
7            boolean zero=false;
8            while(a>0){
9                if(a%10==0){
10                    zero=true;
11                    break;
12                }
13                a/=10;
14            }
15            if(zero) continue;
16            while(b>0){
17                if(b%10==0){
18                    zero=true;
19                    break;
20                }
21                b/=10;
22            }
23            if(zero) continue;
24            arr[0]=i;arr[1]=n-i;
25            break;
26        }
27        return arr;
28    }
29}