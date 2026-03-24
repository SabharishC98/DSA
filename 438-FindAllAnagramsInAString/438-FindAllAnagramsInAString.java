// Last updated: 3/24/2026, 11:28:01 AM
class Solution {
    public List<Integer> findAnagrams(String str, String ana) {
        
        int n=ana.length();
        List<Integer> list=new ArrayList<>();
        int i=0;
        while(i<=str.length()-n){
            if(Ana(i,n,str,ana)){
                list.add(i);
            }
            i++;
        }
        return list;
    }
    public static Boolean Ana(int i,int n,String str,String ana){
        char []a1=str.substring(i,i+n).toCharArray();
        char []a2=ana.toCharArray();
        int []ans=new int[26];
        int j=0;
        while(j<a1.length){
            ans[a1[j]-97]+=1;
            j++;
        }
        j=0;
        while(j<a2.length){
            ans[a2[j]-97]-=1;
            j++;
        }
        j=0;
        while(j<26){
            if(ans[j]!=0){
                return false;
            }
            j++;
        }
        return true;
    }
}
    