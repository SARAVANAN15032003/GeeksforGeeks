class Solution {
    int majorityElement(int arr[]) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
for(Integer i:map.keySet()){
    if(map.get(i)>(arr.length/2))
    return i;
}
        return -1;
    }}
