// Last updated: 5/25/2026, 10:27:42 AM
1class Solution {
2    public boolean canReach(String str, int minJump, int maxJump) {
3
4    //     class Solution {
5    // public boolean canReach(String str, int minJump, int maxJump) {
6        if(str.charAt(str.length()-1)=='1') return false;
7        List<Integer> list=new ArrayList<>();
8        list.add(0);
9        for(int i=1;i<str.length();i++){
10            if(str.charAt(i)=='0'){
11                int start=i-maxJump,end=i-minJump;
12                int s=0,e=list.size()-1;
13                boolean found=false;
14                while(s<=e){
15                    int m=(s+e)/2;
16                    if(start<=list.get(m) && list.get(m)<=end){
17                        found =true;
18                        break;
19                    }
20                    else if(list.get(m)<start){
21                        s=m+1;
22                    }
23                    else{
24                        e=m-1;
25                    }
26                }
27                if(found){
28                    list.add(i);
29                }
30            }
31        }
32        return list.get(list.size()-1)==str.length()-1?true:false;
33    }
34}
35
36
37
38
39
40
41
42        // if(s.charAt(s.length()-1)=='1') return false;
43        // Queue<Integer> q=new LinkedList<>();
44        // Set<Integer> set=new HashSet<>();
45        // set.add(0);
46        // q.add(0);
47        // while(!q.isEmpty()){
48        //     int index=q.poll();
49        //     int next=index+maxJump;
50        //     if(next>=s.length()){
51        //         next=s.length()-1;
52        //     }
53        //     for(int i=next;i>=index+minJump && i>0;i--){
54        //         // System.out.println(i+" "+index+" "+s.charAt(i));
55        //         if(s.charAt(i)=='0' && !set.contains(i)){
56        //             if(i==s.length()-1) return true;
57        //             q.add(i);
58        //             set.add(i);
59        //         }
60        //     }
61        // }
62        // return false;
63//     }
64// }