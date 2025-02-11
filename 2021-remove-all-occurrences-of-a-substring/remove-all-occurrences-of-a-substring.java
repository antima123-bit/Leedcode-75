class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder stack = new StringBuilder();
        for(int i = 0 ; i< s.length() ; i++){
            stack.append(s.charAt(i));
            if(stack.length() >= part.length() && stack.substring(stack.length() - part.length()).equals(part)) {
            stack.delete(stack.length () - part.length() , stack.length());
            }
            }
            return stack.toString();
        }
    }
