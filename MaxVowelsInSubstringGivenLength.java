class Solution {
    public int maxVowels(String s, int k) {
        int len=s.length(), count =0;
        Set<Character> vowel = Set.of('a', 'e', 'i', 'o', 'u');

        if (s.length() < 1) {
            return 0;
        }
        for (int i = 0; i < k; i++) {
            if(vowel.contains(s.charAt(i)))
                count=count+1;
        }
        int result=count;
        //Perform operation for remaining n-k 
        for (int i = k; i < len ; i++) {
            // If new character is vowel the increment the count
            if(vowel.contains(s.charAt(i))) 
                count++;
            // If the previous character is vowel then decrement the count
            if(vowel.contains(s.charAt(i-k))) 
                count--;
 
            // Update result if required.
            result = Math.max(result, count);
        }
        return result;
 
    }
}

/*
Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
*/
