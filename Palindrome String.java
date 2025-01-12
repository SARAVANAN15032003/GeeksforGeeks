

//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
        String s="";
        char c;
        StringBuilder sb=new StringBuilder();
        sb.append(S);
        sb.reverse();
        String f=sb.toString();
        if(S.equals(f))
        return 1;
        else 
        return 0;
    }
};
