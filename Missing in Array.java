

// User function Template for Java
class Solution {
    int missingNumber(int arr[]) {
        // code here
        Arrays.sort(arr);
        int m=0,l=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=l){
                break;
            }
            l++;
        }
        
        return l;
    }
}
