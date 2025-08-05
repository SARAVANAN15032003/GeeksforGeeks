class Solution {
    public boolean isPalinSent(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c))
            sb.append(c);
        }
        return sb.toString().equalsIgnoreCase(sb.reverse().toString());
    }
}
