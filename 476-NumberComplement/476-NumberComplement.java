// Last updated: 3/24/2026, 11:27:49 AM
class Solution {
    public int findComplement(int n) {
        if(n==0)    return 1;
        String b="";
        int a=0;
        while (n > 0) {
    int r = n % 2;
    b = r + b;  
    n = n / 2;
}

        System.out.println(b);
        String ans="";
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)=='0')
                ans+=1;
            else
                ans+=0;
        }
        int i=0;
        while(i<ans.length()){
            a=a*2+(ans.charAt(i)-48);
            i++;
        }
        System.out.print(ans);
        return a;
    
    }
}