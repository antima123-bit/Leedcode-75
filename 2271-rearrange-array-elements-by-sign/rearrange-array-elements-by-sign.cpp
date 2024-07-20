class Solution {
public:
    vector<int> rearrangeArray(vector<int>& n ) {
            int v = n.size();
            vector<int>pos ;
            vector<int>neg;
         for(int i=0 ; i<n.size(); i++){
            if (n[i] > 0) pos.push_back(n[i]);
            else neg.push_back(n[i]); 
         }
         for(int i =0 ; i < v/2 ; i++){
            n[i*2] =pos[i];
            n[i*2+1]=neg[i];
         }
         return n;
    }
};