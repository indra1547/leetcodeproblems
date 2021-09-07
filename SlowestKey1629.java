class Solution {
    
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int longerPress = releaseTimes[0];
        char slowestKey = keysPressed.charAt(0);
        for(int i=1; i<releaseTimes.length; i++){
            int currentDuration = releaseTimes[i] - releaseTimes[i-1];
            if(currentDuration > longerPress || (currentDuration == longerPress && keysPressed.charAt(i) > slowestKey)){
                longerPress = currentDuration;
                slowestKey = keysPressed.charAt(i);
            }
        }
        return slowestKey; 
    }
}
