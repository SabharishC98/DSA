// Last updated: 3/24/2026, 11:26:34 AM
// class Solution {
//     public int[] dailyTemperatures(int[] t) {
//         int arr[]=new int[t.length];
//         for(int i=0;i<t.length;i++){
//             int c=1;
//             for(int j=i+1;j<t.length;j++){
//                 if(t[j]>t[i]){
//                     arr[i]=c;
//                     break;
//                 }
//                 c++;
//             }
//         }
//         return arr;
//     }
// }
class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n = t.length;
        int[] ans = new int[n];
        java.util.Stack<Integer> st = new java.util.Stack<>(); // store indices
        
        for (int i = n - 1; i >= 0; i--) {
            // Remove days that are not warmer than today
            while (!st.isEmpty() && t[st.peek()] <= t[i]) {
                st.pop();
            }
            // If stack has a warmer day, set the difference
            if (!st.isEmpty()) {
                ans[i] = st.peek() - i;
            }
            // Push current day index
            st.push(i);
        }
        return ans;
    }
}
