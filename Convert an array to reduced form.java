

//User function Template for Java

class Solution {
    void convert(int[] arr, int n) {
        //Code here
        int ar[]=arr.clone();
        Arrays.sort(ar);
       HashMap<Integer,Integer> hm=new HashMap<>();
       for(int i=0;i<n;i++){
           hm.put(ar[i],i);
       }
       for(int j=0;j<n;j++){
           arr[j]=hm.get(arr[j]);
       }
        
    }
}
