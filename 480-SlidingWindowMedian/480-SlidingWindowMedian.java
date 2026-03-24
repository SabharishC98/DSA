// Last updated: 3/24/2026, 11:27:48 AM
import java.util.*;

class Solution {

    TreeMap<Integer,Integer> left = new TreeMap<>();
    TreeMap<Integer,Integer> right = new TreeMap<>();

    int leftSize = 0;
    int rightSize = 0;

    public double[] medianSlidingWindow(int[] nums, int k) {

        double[] res = new double[nums.length - k + 1];

        for(int i=0;i<k;i++)
            add(nums[i]);

        res[0] = getMedian();

        for(int i=k;i<nums.length;i++){

            add(nums[i]);
            remove(nums[i-k]);

            res[i-k+1] = getMedian();
        }

        return res;
    }

    void add(int num){

        if(left.isEmpty() || num <= left.lastKey()){
            left.put(num,left.getOrDefault(num,0)+1);
            leftSize++;
        } else {
            right.put(num,right.getOrDefault(num,0)+1);
            rightSize++;
        }

        balance();
    }

    void remove(int num){

        if(num <= left.lastKey()){
            delete(left,num);
            leftSize--;
        } else {
            delete(right,num);
            rightSize--;
        }

        balance();
    }

    void delete(TreeMap<Integer,Integer> map,int num){

        map.put(num,map.get(num)-1);

        if(map.get(num)==0)
            map.remove(num);
    }

    void balance(){

        if(leftSize > rightSize + 1){

            int val = left.lastKey();
            delete(left,val);
            leftSize--;

            right.put(val,right.getOrDefault(val,0)+1);
            rightSize++;
        }

        if(leftSize < rightSize){

            int val = right.firstKey();
            delete(right,val);
            rightSize--;

            left.put(val,left.getOrDefault(val,0)+1);
            leftSize++;
        }
    }

    double getMedian(){

        if(leftSize > rightSize)
            return left.lastKey();

        return ((long)left.lastKey() + right.firstKey()) / 2.0;
    }
}