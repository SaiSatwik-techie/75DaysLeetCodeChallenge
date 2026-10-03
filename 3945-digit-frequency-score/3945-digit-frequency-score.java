class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int temp;
        while(n>0){
            temp = n%10;
            hash.put(temp,hash.getOrDefault(temp,0)+1);
            n=n/10;
        }
        int ans=0;
        for(int x:hash.keySet()){
            ans += x*hash.get(x);
        }
        return ans;
    }
}