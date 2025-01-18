class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
         //here there are two types of customer one is unsatisfied and another is satisfied 
         //firslty we find those customers jinhe hum satisfied bana skte ha 
         //ismey ye krenge jis customers me 1 arha as a grumpy tuh unhe bhar nikaal lenge baki fir usmey dekhenge ki max knsa ha tuh find kr lenege aur store kr denge 
         
         //secondly we find those customers jo alredy satisfied ha 
         //aur iske baaad hum ye dekhnege ki jo alredy 0 contain kiya ha in the grumpy tuh unhe bhi hum find out kreke add kr denge aur final result ko store kr denge 
         //jaha store ha donon elment unhe hum last me add kr denge 
        int alreadySatisfied = 0;//ismey ye pata chl rha ki jo alredy satisfied ha having no grumpy into 
        int maxGain = 0;//hum kitney satisfied kr skte ha if it is grumpy
        int gain = 0;//abhi current me kitna kiya ha 0
        for (int i = 0 ; i< n ; i++){
            if(grumpy[i] == 0){
                alreadySatisfied += customers[i];
            }
        }
        for(int i = 0 ; i < n ; i++){
            if(grumpy[i] == 1){
                gain = gain + customers[i];
            }
            if(i >= minutes){
                if(grumpy[i-minutes] == 1 ){
                    gain = gain -  customers[i-minutes];
                }
            }
            maxGain = Math.max(maxGain, gain);
        }
        return alreadySatisfied + maxGain ;
    }
}