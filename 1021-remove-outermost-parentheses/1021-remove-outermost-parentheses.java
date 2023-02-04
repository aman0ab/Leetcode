class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int j = 0;
        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) == ')'){
                --j;
            }
            if(j != 0){
              ans.append(s.charAt(i));
            }
            if(s.charAt(i) == '('){
                ++j;
            }
        }
        return ans.toString();
    }
}