// Last updated: 3/24/2026, 11:23:53 AM
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Integer []ind=new Integer[boxTypes.length];
        for(int i=0;i<boxTypes.length;i++) ind[i]=i;
        Arrays.sort(ind,(i,j)->{
            Integer r1=boxTypes[i][1];
            Integer r2=boxTypes[j][1];
            return Integer.compare(r2,r1);
        });
        int p=0;
        for(int i:ind){
            if(boxTypes[i][0]<=truckSize){
                p+=boxTypes[i][1]*boxTypes[i][0];
                truckSize-=boxTypes[i][0];
            }
            else{
                p+=(boxTypes[i][1])*truckSize;
                truckSize=0;
                break;
            }
        }
        return p;
    }
}