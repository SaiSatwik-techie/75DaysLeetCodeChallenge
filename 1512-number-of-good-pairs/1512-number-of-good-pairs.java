class Solution {
    public int numIdenticalPairs(int[] nums) {
       HashMap<Integer,Integer> hash = new HashMap<>();
        int prev, count =0;
       for(int num: nums){
        prev = hash.getOrDefault(num,0);
        count += prev;
        hash.put(num,prev+1);
       } 
       return count;
    }
}