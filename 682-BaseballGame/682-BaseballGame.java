// Last updated: 3/24/2026, 11:26:46 AM
class Solution {
    public int calPoints(String[] o) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<o.length;i++){
            if(o[i].charAt(0)=='D'){
                arr.add(arr.get(arr.size()-1)*2);
            }
            else if(o[i].charAt(0)=='C'){
                arr.remove(arr.size()-1);
            }
            else if(o[i].charAt(0)=='+'){
                arr.add(arr.get(arr.size()-1)+arr.get(arr.size()-2));
            }
            else{
                arr.add(Integer.valueOf(o[i]));
            }
        }
        int sum=0;
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
        }
        return sum;
    }
}