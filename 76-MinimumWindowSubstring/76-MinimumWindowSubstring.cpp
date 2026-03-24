// Last updated: 3/24/2026, 11:31:23 AM
class Solution {
public:
    string minWindow(string s, string t) {
        int r=0;
        int l=0;
        unordered_map<char,int> req;
        for(char c:t){
            req[c]++;
        }
        int f=0;
        int st=0;
        int mini=INT_MAX;
        unordered_map<char,int> freq;
        while(r<s.size()){
            freq[s[r]]++;
            if(req.count(s[r]) && req[s[r]]==freq[s[r]]) f++;
            while(f==req.size()){
                if(mini>r-l+1){
                    mini=r-l+1;
                    st=l;
                }
                freq[s[l]]--;
                if(req.count(s[l]) && req[s[l]]>freq[s[l]]){
                    f--;
                }
                l++;
            }
            r++;
        } 
        return mini==INT_MAX?"":s.substr(st,mini);
    }
};