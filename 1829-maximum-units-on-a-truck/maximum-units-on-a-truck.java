class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        //firslty here we sort the array on the basis of the units because if we pik maximum unit then we get more capacity to store into new truck
        Arrays.sort(boxTypes , (a,b) -> b[1] - a[1]);
        //firstly we intialize the maxUnit with 0 then we gradually increase it 
        int maxUnits = 0 ; 
        for(int [] box : boxTypes){
        int boxCount = Math.min(box[0] , truckSize);
        maxUnits += boxCount * box[1];
        truckSize -= boxCount ; 
        if(truckSize == 0 ){
            break ;
        }
        }
                return maxUnits;

    }

}