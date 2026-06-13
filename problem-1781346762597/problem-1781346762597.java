// Last updated: 6/13/2026, 4:02:42 PM
1class Solution {
2    public int[] prevPermOpt1(int[] arr) {
3        int pivot=-1;
4        for(int i=arr.length-2;i>=0;i--){
5            if(arr[i]>arr[i+1]){
6                pivot=i;
7                break;
8            }
9        }
10        if(pivot==-1) return arr;
11        for(int i=arr.length-1;i>=0;i--){
12            if(i!=0 && arr[i]==arr[i-1]) continue;
13            if(arr[i]<arr[pivot]){
14                int t=arr[i];
15                arr[i]=arr[pivot];
16                arr[pivot]=t;
17                break;
18            }
19        }
20        return arr;
21    }
22}