class Solution {
    public String clearDigits(String s) {
        StringBuilder stack = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                if (stack.length() > 0) {
                    stack.deleteCharAt(stack.length() - 1); // Remove last letter
                }
            } else {
                stack.append(ch); // Push letter onto stack
            }
        }

        return stack.toString();
    }
}
