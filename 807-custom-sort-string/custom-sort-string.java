class Solution {
    public String customSortString(String order, String s) {
         StringBuilder result = new StringBuilder();
        char[] orderCharArray = order.toCharArray();
        char[] inputCharArray = s.toCharArray();
        for (char orderChar: orderCharArray){
            for (char inputChar: inputCharArray){
                if (inputChar == orderChar){
                    result.append(inputChar);
                }
            }
        }
        for (char c: inputCharArray){
            if (order.indexOf(c) == -1){
                result.append(c);
            }
        }
        return result.toString();  
    }
}