class Solution {
    public String reversePrefix(String word, char ch) {
        char[] w=word.toCharArray();
        int index=word.indexOf(ch);
        int i=0;
        while(i<=index){
            char temp=w[i];
            w[i]=w[index];
            w[index]=temp;
            i++;
            index--;
        }
        return new String(w);
    }
}