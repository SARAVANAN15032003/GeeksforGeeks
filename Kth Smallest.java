

// User function Template for Java

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i:arr)q.add(i);
        for(int i=1;i<k;i++)q.poll();
        return q.poll();
    }
}
