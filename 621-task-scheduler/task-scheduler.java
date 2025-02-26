class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq= new int[26];
        for(char task: tasks){
            freq[task-'A']++ ;
        }
        int maxFreq = 0 ;
        int maxFreqCount = 0;
        for(int f: freq){
            if(f>maxFreq){
                maxFreq = f;
                maxFreqCount = 1;
            }else if(f == maxFreq){
                maxFreqCount++ ;
            }
        }
        int partCount = maxFreq - 1;//here we calculate the partiyion space 
        int emptySlots = partCount*(n+1 - maxFreqCount);
        int avaiableTasks = tasks.length - (maxFreq * maxFreqCount);
        int idleSlots = Math.max(0, emptySlots- avaiableTasks);
    return tasks.length +idleSlots;
    }
}