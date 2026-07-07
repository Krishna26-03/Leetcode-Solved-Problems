class Solution {
    public boolean isValid(String s) {
        Stack<Character> res = new Stack<>(); 
        for(char ch : s.toCharArray()){
            if( ch == '('){
                res.push(')');
            } else if (ch == '['){
                res.push(']');
            } else if ( ch == '{'){
                res.push('}');
            } else {
                if( res.isEmpty() || res.pop() != ch){
                    return false;
                }
            }
        }
        return res.isEmpty();
    }
}