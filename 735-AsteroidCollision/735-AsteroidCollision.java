// Last updated: 3/24/2026, 11:26:37 AM
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i:asteroids){
            if(i<0){
                boolean insert=true;
                while(!st.isEmpty() && st.peek()>=0){
                    if(st.peek()<Math.abs(i)){
                        st.pop();
                        insert=true;
                    }
                    else if(st.peek()==Math.abs(i)){
                        st.pop();
                        insert=false;
                        break;
                    }
                    else{
                        insert=false;
                        break;
                    }
                }
                if(insert) st.push(i);
            }
            else{
                st.push(i);
            }
        }
        int[] arr=new int[st.size()];
        int len=st.size()-1;
        while(!st.isEmpty()){
            arr[len--]=st.pop();
        }
        return arr;
    }
}