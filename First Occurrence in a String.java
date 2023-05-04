class Solution {
    public int strStr(String haystack, String needle) {
        int needle_len = needle.length();
        int haystack_len = haystack.length();

        for (int windowStart = 0; windowStart <= haystack_len - needle_len; windowStart++) {
            for (int i = 0; i < needle_len; i++) {
                if (needle.charAt(i) != haystack.charAt(windowStart + i)) {
                    break;
                }
                if (i == needle_len - 1) {
                    return windowStart;
                }
            }
        }
       return -1;
    }
}

// Find the Index of the First Occurrence in a String
//Sliding window