class Solution {
    public int peakElement(int[] arr) {
        if(arr.length<2)
        return 0;
         if(arr[0]>arr[1])
          return 0;
       for(int i=1;i<arr.length-1;i++){
           if(arr[i-1]<arr[i] && arr[i+1]<arr[i])
           return i;
       }
       return arr.length-1;
    }
}
