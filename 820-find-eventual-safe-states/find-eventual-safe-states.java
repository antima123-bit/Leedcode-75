class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        //here we can change the integer value into the array
        List<Integer> safeNodes = new ArrayList<>();
        for(int i =0 ; i < n ; i++){
            if(dfs(i,graph,color)){
                safeNodes.add(i);
            }
        }
return safeNodes;
    }
private boolean dfs(int node , int[][] graph , int[] color){
    if(color[node]>0){
        return color[node] == 2;
    }
    color[node] = 1;
    for(int neighbor : graph[node]){
        if(color[neighbor] == 2){
            continue;
        }
        if(color[neighbor] == 1 || !dfs(neighbor, graph , color)){
            return false;
        }
    }
    color[node] = 2;
    return true;
}


}


    
    