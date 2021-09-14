class Solution {
    public int maxNumberOfBalloons(String text) {
        
        int[] char_count = new int[26];
        //fill the char_count array with their frequency 
        for(int i=0; i<text.length(); i++){
            char_count[text.charAt(i)-'a']++;
        }
        int min = char_count[1]; //b
        min = Math.min(min, char_count[0]); //a
        min = Math.min(min, char_count[11]/2); //l
        min = Math.min(min, char_count[14]/2); //o
        min = Math.min(min, char_count[13]);//n
        return min;
    }
}
