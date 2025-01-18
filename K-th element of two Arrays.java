

// User function Template for Java

class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        //Arrays.sort(a);
        //Arrays.sort(b);
        List<Integer> list=new ArrayList<>();
        // int i=0,j=0,l=0;
        // while(i<a.length && i<b.length && l<k){
        //     list.add(a[i]);list.add(b[i]);
        //     i++;j++;l++;
        // }
        for(int i:a)list.add(i);
        for(int i:b)list.add(i);
        Collections.sort(list);
        return list.get(k-1);
    }
}
