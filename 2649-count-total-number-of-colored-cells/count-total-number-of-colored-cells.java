class Solution {
    public long coloredCells(int n) {

        //here we used the formula that generated the coloured grid n^2 +(n-1)^2 this is the formula
    return (long)Math.pow(n, 2) + (long)Math.pow((n-1),2);
    }
}