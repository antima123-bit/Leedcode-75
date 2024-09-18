class Solution {
    public String largestNumber(int[] nums) {

        //we have to convert the number into string 
        //we do convert the String.valueof(nums[i]) represent that string should be return by numbers.
        String[] numsStr = new String[nums.length];
        for(int i =0; i< nums.length ; i++){
            numsStr[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(numsStr , new Comparator<String>(){
             public int compare(String a , String b){
                String order1 = a+ b ;
                String order2 = b+a ;
                return order2.compareTo(order1);
             }
        });
        if (numsStr[0].equals("0")){
            return"0" ;
        }
        StringBuilder largestNumber = new StringBuilder() ;
        for(String num : numsStr) {
            largestNumber.append(num);
        }
        return largestNumber.toString();
    }
}