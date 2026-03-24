// Last updated: 3/24/2026, 11:22:28 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int matrix[][]=new int[m][n];
        for(int i=0;i<m;i++)
        Arrays.fill(matrix[i],-1);
        int len=matrix.length*matrix[0].length;
        int row=matrix.length,col=matrix[0].length,r=0,c=0;
        while(head!=null){
            while(c<col && head!=null){
                matrix[r][c]=head.val;
                head=head.next;
                c++;
            }
            c--;
            r++;
            while(r<row && head!=null){
                matrix[r][c]=head.val;
                head=head.next;
                r++;
            }
            r--;
            c--;
            while(c>=matrix[0].length-col && head!=null){
                matrix[r][c]=head.val;
                head=head.next;
                c--;
            }
            c++;
            r--;
            while(r>matrix.length-row && head!=null){
                matrix[r][c]=head.val;
                head=head.next;
                r--;
            }
            r++;
            c++;
            col--;
            row--;
        }
        return matrix;
    }
}