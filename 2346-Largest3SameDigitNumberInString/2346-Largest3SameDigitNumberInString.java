// Last updated: 3/24/2026, 11:22:41 AM
class Solution {
    public String largestGoodInteger(String num) {
        StringBuilder sb=new StringBuilder("");
        int check=-1;
        for(int i=0;i<num.length();i++){
            if(i<=num.length()-3 && num.charAt(i)==num.charAt(i+1) && num.charAt(i+2)==num.charAt(i+1)){
                if(check==-1){
                    check=num.charAt(i)-48;
                    sb.append(num.charAt(i));
                    sb.append(num.charAt(i));
                    sb.append(num.charAt(i));
                }
                else if(num.charAt(i)-48>check){
                    check=num.charAt(i)-48;
                    sb=new StringBuilder("");
                    sb.append(num.charAt(i));
                    sb.append(num.charAt(i));
                    sb.append(num.charAt(i));
                }
                i+=1;
            }
        }
        return sb.toString();
    }
}