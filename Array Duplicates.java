


class Solution {
    public static ArrayList<Integer> duplicates(int[] arr) {
        // code here
        ArrayList<Integer> a=new ArrayList();
        for(int i=0;i<arr.length;i++){
            int y=arr[i];
            
            for(int j=i+1;j<arr.length;j++){
                if(y==arr[j])
                {a.add(y);
                    break;
                }
                
            }
        }
        if(a.isEmpty())
        a.add(-1);
        
        return a;
    }
}
