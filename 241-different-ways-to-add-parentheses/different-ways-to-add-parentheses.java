class Solution {
    public List<Integer> diffWaysToCompute(String expression) {

        //FIRSTLY WE CREATE THE NEW ARRAY LIST WHERE WE STORE THE RESULT
        List<Integer> result = new ArrayList<>() ;
        //APPLY LOOP IN THE EXPRESSION WHICH RESULT TO MOVING INDEX BY INDEX CHECKING OF THE CHARACTERS
        for(int i = 0; i< expression.length() ; i++){
            char c = expression.charAt(i);
            //IF IN THE SUBSTRING FOUND THE OPERATORS LIKE + , - , *
            if(c =='+' || c == '-' || c =='*'){
                //NOW DIVIDE THE SUBSTRING INTO LEFT PART AND RIGHT PART EACH OTHER
                //AS WE NOW IF WE DIVIDE THE LEFT PART THEN IT WOULD BE START FROM (0, i)
                //WHERE AS FOR THE RIGHT PART THEN IT WOULD BE STRAT FROM (i,1)
                String leftPart = expression.substring(0,i);
                String rightPart = expression.substring(i+1);

                //FOR THE LEFT PART WE COMPUTE IT IN DIFFERENT WAY AS SAME AS IN THE RIGHT PART IT WOULD BE COMPUTE IN THE DIFF WAYS
                List<Integer> leftResults  =  diffWaysToCompute(leftPart);
                List<Integer> rightResults =  diffWaysToCompute(rightPart);

                //NOW MAKE A RESULT OF LEFT PART AND RIGHT PART COMBINE TO EACH OTHER
                for(int left : leftResults){
                    for(int right : rightResults){
                        //IF THERE IS + SIGN THEN ADD THE LEFT AND RIGHT PART
                        if(c == '+'){
                            result.add(left+right);
                        }
                        //IF THERE IS - SIGN THEN SUBRACT FROM LEFT - RIGHT PART EACH OTHER
                        else if(c == '-'){
                            result.add(left - right);
                        }
                        //IS THERE IS * SIGN THEN MULTIPY FROM LEFT * RIGHT PART 
                        else if(c == '*'){
                            result.add(left *right);
                        }
                    }
                }

            }
        }

        //IF THE RESULT IS EMPTY THEN ADD THE EXPRESSION OF THE OPERATORS 
        if(result.isEmpty()){
            result.add(Integer.parseInt(expression));
        }
        //AT THE END RETURN THE RESULT 
        return result;
    }
}