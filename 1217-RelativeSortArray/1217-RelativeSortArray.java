// Last updated: 3/24/2026, 11:25:02 AM
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] nums=new int[arr1.length];
        List<Integer> n=new ArrayList<>();
int index=0;
        for(int i=0;i<arr2.length;i++){
            int f=0;
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    nums[index++]=arr1[j];
                    f=1;
                }
            }
        }
        for(int i=0;i<arr1.length;i++){
            int f=0;
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]) f=1;
            }
            if(f==0) n.add(arr1[i]);
        }
        Collections.sort(n);
        for(int i=0;i<n.size();i++){
            nums[index++]=n.get(i);
        }
        return nums;
    }
}