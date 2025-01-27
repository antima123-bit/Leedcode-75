class Solution {
    public int numRescueBoats(int[] people, int limit) {
    Arrays.sort(people);
    int n = people.length;
    int left = 0 ; 
    int right = n - 1;
    int boat = 0 ;
    while(left<=right){
        if(people[left] +  people[right] <= limit){
        left++ ;
        }
        right-- ;
        boat++ ;
    }
    return boat ;
    }
}



