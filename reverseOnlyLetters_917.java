class Solution {
    public String reverseOnlyLetters(String s) {
        
        StringBuilder rev_string = new StringBuilder();
        int j = s.length()-1;
        for(int i=0; i<s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                // if first character is a english letter
                //We need to find a letter from backwards and just add append to the resultant string
                while(!Character.isLetter(s.charAt(j))){
                    j--;
                }
                //once loop breaks, we found the letter and just append to the result string
                rev_string.append(s.charAt(j--));
            }else{
                //if not, just add to the resultant to maintain the position
                rev_string.append(s.charAt(i));
            }
        }
        return rev_string.toString();
    }
}
