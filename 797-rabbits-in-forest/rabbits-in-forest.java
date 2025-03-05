class Solution {
    public int numRabbits(int[] answers) {
    int n = answers.length;
    int[]count =new int[1000];
    int rabbits = 0 ;
    for(int i = 0 ; i< n ;i++){
        if(count[answers[i]]== 0){
        rabbits+=answers[i] +1 ;
        count[answers[i]] =answers[i];
        }
        else{
            count[answers[i]]-- ;
        }
    }    
    return rabbits;
    }
}