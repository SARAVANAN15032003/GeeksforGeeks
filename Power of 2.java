

// User function Template for Java

class Solution {

    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n) {
double j=(double)n;
if(n==1){
    return true;
    }
while(j>1){
    
    j=j/2;
    if(j==1){
    return true;
    }
}return false;
    }
}
