//basic idea behind the implementation is to add the num elements one by one with the k 
//so basically num[] = {1,2,3} , k = 45
//at first itreation 
//k=k+num[len--] , k = k+ num[2]--> k = 45+3 = 48 , k = 48
//further we take mod for taking out the last element from the k ,  k%10  = 48%10 = 8
//list.addFirst(8)---> [8]
//we have to find out the front elemnt from the k , k/10 = 48/10 = 4

//at second iteration 
//k = k+num[len--] , k = k+num[1] ---> 4 + 2 = 6 , k=6
//list.addFirst(k%10) = 6%10 =[6,8]
//k= k/10 ------> 6/10 = 0 ,  k = 0


//at third iteration 
//so basically k = k+ num[len--] = k+ 1 = 0 +1 = 1
//list.AtFirst[k%10] ---> 1%10 = 1 , [6,8,1]
//k = k/10 ----> 1/10 = 0

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
       final LinkedList<Integer> result = new LinkedList<>();
       int len = num.length - 1 ;
       while(len >= 0  || k != 0){
        if(len>= 0){
            k+=num[len--];
        }
        result.addFirst(k%10);
        k/=10;
       }
       return result;
    }
}