class Solution {
    public int compareVersion(String version1, String version2) {
        for(int i = 0 , j= 0 ; i<version1.length() || j<version2.length() ; i++ , j++) {            int val1=0;
        int val2=0;
            while(i < version1.length() && version1.charAt(i)!= '.'){
                val1 = val1*10+ version1.charAt(i++)-'0' ; 
            }
            while(j <version2.length() && version2.charAt(j) != '.'){
                val2 = val2 * 10 +version2.charAt(j++)-'0';
            }
            if(val1 <val2){
                return -1;
            }else if(val1 > val2){
                return 1;
            }
        }

return 0 ;
    }
}