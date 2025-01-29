class Solution {
    public int smallestRangeII(int[] arr, int k) {
        int n=arr.length;
        Arrays.sort(arr);
        int ans=arr[n-1]-arr[0];
        int smallest=arr[0]+k,largest=arr[n-1]-k;
        
        for(int i=0;i<n-1;i++){
            int mini=Math.min(smallest,arr[i+1]-k);
            int maxi=Math.max(largest,arr[i]+k);
            // if(mini<0) continue;
            ans=Math.min(ans,maxi-mini);
        }
        
        return ans;
    }
}