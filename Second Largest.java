

// User function Template for Java

class Solution {
    public int print2largest(List<Integer> arr) {
        // Code Here
        
        Set<Integer> hash=new HashSet<>(arr);
        List<Integer> list=new ArrayList<>(hash);
        Collections.sort(list);
    if(list.size()<2){
        return -1;
    }
    
        return list.get(list.size()-2);
    
        
    }
}
