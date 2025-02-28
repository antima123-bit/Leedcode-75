class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a,b) -> (a[0] - a[1]) - (b[0] - b[1]));
        int minCost = 0 ;
        int n = costs.length /2 ;
        //now we calculate the min cost for the n people who fly from city A 
        for(int i=0 ; i< n ; i++){
            minCost += costs[i][0];
        }


        //now we calculate the min cost for next n people who fly to city B 
        for(int i = n ; i< n*2 ; i++){
         minCost += costs[i][1];
        }
        return minCost;
    }
}