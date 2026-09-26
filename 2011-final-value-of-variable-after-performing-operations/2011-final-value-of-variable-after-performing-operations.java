class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for(String ch : operations){
            if(ch.equals("X++")|| ch.equals("++X")){
                X += 1;
            }else{
                X -= 1;
            }
        }
        return X;
    }
}