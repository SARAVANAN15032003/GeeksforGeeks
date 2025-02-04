class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        int f=-1,l=-1;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                f=i;
                break;
            }
        }
        list.add(f);
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==x){
                l=i;
                break;
            }
        }
        list.add(l);
        return list;
    }
}
