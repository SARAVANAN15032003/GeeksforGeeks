


class Solution {
    // Function to check if brackets are balanced or not.
    static boolean isParenthesisBalanced(String s) {
        // code here
        Stack<Character> st=new Stack<>();
        char c[]=s.toCharArray();
        s="{[(";
        for(int i=0;i<c.length;i++){
            if(s.contains(c[i]+""))
            st.push(c[i]);
            else{
                if(st.size()==0)return false;
                if(c[i]==']'){
                    if(st.pop()!='[')
                    return false;
                }
                else if(c[i]==')'){
                    if(st.pop()!='(')
                    return false;
                }
                else if(c[i]=='}'){
                    if(st.pop()!='{')
                    return false;
                }
            }
        }
        return st.size()==0;
    }
}
