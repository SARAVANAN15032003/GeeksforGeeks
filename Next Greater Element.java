

class Solution {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            boolean t=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    list.add(arr[j]);
                    t=false;
                    break;
                }
            }
             if(t)
                list.add(-1);
            
        }
        list.add(-1);
        return list;
    }
}
