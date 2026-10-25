class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int maxLength=0;
         int maxFreq =0;
        int l=0;
        for(int r=0; r<s.length(); r++){
            char ch = s.charAt(r);
            freq[ch-'A']++;
            
            maxFreq = Math.max(maxFreq, freq[ch-'A']); 
            int windowLength = r-l +1;
            if(windowLength - maxFreq > k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            maxLength = Math.max(maxLength, r-l+1);
        }
        return maxLength;
      
    }
}
