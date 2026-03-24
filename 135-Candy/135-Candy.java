// Last updated: 3/24/2026, 11:30:20 AM
class Solution {
    public int candy(int[] ratings) {
        int k=ratings.length;

        int []arr1=new int[k];
        int []arr2=new int[k];
        Arrays.fill(arr1,1);
        Arrays.fill(arr2,1);
        for(int i=1;i<k;i++){
            if(ratings[i]>ratings[i-1]){
                arr1[i]+=arr1[i-1];
            }
            
        }
        for(int i=k-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                arr2[i]+=arr2[i+1];
            }
            
        }
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=Math.max(arr1[i],arr2[i]);
        }
        return sum;
    }
}