// Last updated: 3/24/2026, 11:22:37 AM
class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<messages.length;i++){
            String[] arr=messages[i].split(" ");
            map.put(senders[i],map.getOrDefault(senders[i],0)+arr.length);
        }
        int max=0;
        String ans="";
        for(String i:map.keySet()){
            if(map.get(i)>max){ ans=i; max=map.get(i);}
            if(map.get(i)==max){
                int check=ans.compareTo(i);
                if(check<0){ ans=i;}
            }
        }
        return ans;
    }
}