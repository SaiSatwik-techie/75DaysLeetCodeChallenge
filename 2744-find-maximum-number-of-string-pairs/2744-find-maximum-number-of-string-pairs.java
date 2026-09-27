class Solution {
    public static String reverse(String a){
        String ans="";
        for(int k=a.length()-1; k>=0; k--){
            ans += a.charAt(k);
        }
        return ans;
    }
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for(int i=0; i<words.length-1; i++){
            for(int j=i+1;j<words.length; j++){
               String rev = reverse(words[j]);
               if(words[i].equals(rev)){
                count++;
               }
            }
        }
        return count;
    }
}