// Last updated: 3/24/2026, 11:28:38 AM
class NumArray {
    private int[] tree;
    private int n;

    public NumArray(int[] nums) {
        n = nums.length;
        tree = new int[4 * n];
        build(nums, 0, 0, n - 1);
    }

    private void build(int[] nums, int node, int start, int end) {
        if (start == end) {
            tree[node] = nums[start];
        } else {
            int mid = (start + end) / 2;
            build(nums, 2*node+1, start, mid);
            build(nums, 2*node+2, mid+1, end);
            tree[node] = tree[2*node+1] + tree[2*node+2];
        }
    }

    public void update(int index, int val, int node, int start, int end) {
        if (start == end) {
            tree[node] = val;
        } else {
            int mid = (start + end) / 2;
            if (index <= mid)
                update(index, val, 2*node+1, start, mid);
            else
                update(index, val, 2*node+2, mid+1, end);
            tree[node] = tree[2*node+1] + tree[2*node+2];
        }
    }

    public void update(int index, int val) {
        update(index, val, 0, 0, n - 1);
    }

    private int query(int left, int right, int node, int start, int end) {
        if (right < start || end < left) return 0;
        if (left <= start && end <= right) return tree[node];
        int mid = (start + end) / 2;
        return query(left, right, 2*node+1, start, mid)
             + query(left, right, 2*node+2, mid+1, end);
    }

    public int sumRange(int left, int right) {
        return query(left, right, 0, 0, n - 1);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */