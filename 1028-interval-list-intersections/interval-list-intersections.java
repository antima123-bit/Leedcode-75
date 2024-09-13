class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if(firstList == null || secondList == null)return null;
        List<int[]> result = new ArrayList<>();
        int ptr1 = 0, ptr2 =0;

        while(ptr1 < firstList.length && ptr2 < secondList.length){
      int fs = firstList[ptr1][0];
      int fe = firstList[ptr1][1];
      int ss = secondList[ptr2][0];
      int se  = secondList[ptr2][1];

      if(fs <= se && ss <= fe){
        result.add(new int[]{Math.max(fs , ss), Math.min(fe,se)});
      }
      if(fe <se) ptr1++;
      else ptr2++ ;
        }
        return result.toArray(new int[0][]);
    }
}