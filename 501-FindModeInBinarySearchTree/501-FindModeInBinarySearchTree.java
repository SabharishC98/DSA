// Last updated: 3/24/2026, 11:27:39 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Solution {
    Integer currentval=null;
    int count=0;
    int maxcount=0;
    List <Integer> l = new ArrayList<>();

    public int[] findMode(TreeNode root) {

        inOrder(root);
        int[] arr = new int[l.size()];
        for(int i=0;i<l.size();i++){
            arr[i] = l.get(i);
        }
        return arr;
    }
    public void inOrder(TreeNode node){

        if(node==null)
            return;
        inOrder(node.left);
        value(node.val);
        inOrder(node.right);
    }
    public void value(int val){

        if(currentval==null || currentval!=val){
            currentval = val;
            count=1;
        }
        else{
            count++;
        }
        if(count>maxcount){
            maxcount = count;
            l.clear();
            l.add(val);
        }
        else if(count==maxcount){
            l.add(val);
        }
    }
}
// class Solution {
//     HashMap<Integer, Integer> dic = new HashMap<>();
//     int max=0;
//     public int[] findMode(TreeNode root) {
//         check(root);
//         int c=0,index=0;
//         for (int i : dic.keySet()) {
//             if(dic.get(i)==max) c++;
//         }
//         int arr[]=new int[c];
//         for (int i : dic.keySet()) {
//             if(dic.get(i)==max){
//                 arr[index++]=i;
//             }
//         }
//         return arr;
//     }
//     public void check(TreeNode root){
//         if(root==null) return ;
//         check(root.left);
//         if(dic.containsKey(root.val))
//             dic.put(root.val,dic.get(root.val)+1);
//         else
//             dic.put(root.val,0);
//         if(dic.get(root.val)>max) max=dic.get(root.val);
//         check(root.right);
//     }
// }
