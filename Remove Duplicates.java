class Solution {
    String removeDups(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(!sb.toString().contains(c+""))
            sb.append(c);
        }
        return sb.toString();
    }
}
