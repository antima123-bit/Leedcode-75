class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        //step1.firstly we marked the element which are present in the arr list
        //step2.After that we can see if the given marked elemnts are completely marked the row/col
        //step3.we return the smallest integer i 
        //step4.smallest integer i means firstly we see that at which index value the ror/col marked
        //step5.if arr={1,3,2,4,5} in this case if 1,2,3 marked the ans.should be arr[2] 
        //output is 2
       int m =mat.length;
       int n = mat[0].length;
       int[] rowCount = new int[m];
       int[] colCount = new int[n];
       //here we create the map where we see the marked and unmarked elements
       Map<Integer,int[]> positionMap = new HashMap<>();
       for(int i = 0;i<m ; i++){
        for(int j = 0 ; j<n ; j++){
            positionMap.put(mat[i][j] , new int[]{i,j});
        }
       }
       for(int i = 0 ;i< arr.length ; i++){
        int val = arr[i];
        int[] pos = positionMap.get(val);
        int row =pos[0];
        int col = pos[1];

        rowCount[row]++ ;
        colCount[col]++ ; 

        if(rowCount[row] == n || colCount[col] ==m){
            return i;
        }
       }
       return -1;
    }
}