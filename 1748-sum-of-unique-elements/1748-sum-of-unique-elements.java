class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int num:nums){
            hash.put(num,hash.getOrDefault(num,0)+1);
        }
        int ans=0;
        for(int i: hash.keySet()){
           if(hash.get(i)==1){
            ans+=i;
           }
        }
        return ans;
    }
}