class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set = new HashSet<>();

        int result[] = new int[friends.length];

        for(int friend : friends){
            set.add(friend);
        }
        int index = 0;
        for(int o: order){
            if(set.contains(o)){
                result[index++] = o;
            }

        }
        return result;
    }
}