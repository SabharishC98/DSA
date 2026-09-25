// Last updated: 9/25/2026, 2:34:24 PM
class Solution {
    public boolean canReach(String str, int minJump, int maxJump) {

    //     class Solution {
    // public boolean canReach(String str, int minJump, int maxJump) {
        if(str.charAt(str.length()-1)=='1') return false;
        List<Integer> list=new ArrayList<>();
        list.add(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)=='0'){
                int start=i-maxJump,end=i-minJump;
                int s=0,e=list.size()-1;
                boolean found=false;
                while(s<=e){
                    int m=(s+e)/2;
                    if(start<=list.get(m) && list.get(m)<=end){
                        found =true;
                        break;
                    }
                    else if(list.get(m)<start){
                        s=m+1;
                    }
                    else{
                        e=m-1;
                    }
                }
                if(found){
                    list.add(i);
                }
            }
        }
        return list.get(list.size()-1)==str.length()-1?true:false;
    }
}







        // if(s.charAt(s.length()-1)=='1') return false;
        // Queue<Integer> q=new LinkedList<>();
        // Set<Integer> set=new HashSet<>();
        // set.add(0);
        // q.add(0);
        // while(!q.isEmpty()){
        //     int index=q.poll();
        //     int next=index+maxJump;
        //     if(next>=s.length()){
        //         next=s.length()-1;
        //     }
        //     for(int i=next;i>=index+minJump && i>0;i--){
        //         // System.out.println(i+" "+index+" "+s.charAt(i));
        //         if(s.charAt(i)=='0' && !set.contains(i)){
        //             if(i==s.length()-1) return true;
        //             q.add(i);
        //             set.add(i);
        //         }
        //     }
        // }
        // return false;
//     }
// }