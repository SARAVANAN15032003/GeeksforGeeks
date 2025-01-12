


class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        String str[]=S.split("\\.");
String sb="";
String p="";
for(int i=0;i<str.length;i++){
    sb=str[i]+p+sb;
p=".";
    
}
        return sb;//.toString();
    }
}
