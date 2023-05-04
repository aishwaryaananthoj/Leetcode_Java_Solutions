class Solution {
    public int compress(char[] chars) {
        int char_length= chars.length;
        int start=0,index=0;
        if (char_length == 1) {
            return 1;
        }
        while(start<char_length){
            int count=1;
            while(start<char_length-1 && chars[start]==chars[start+1]){
                count=count+1;
                start=start+1;
            }
           chars[index++]=chars[start++];
           if(count>1){
               String countStr = String.valueOf(count);
                for (int k = 0; k < countStr.length(); k++) {
                    chars[index++] = countStr.charAt(k);
                }
           }
        }
        return index;
    }
}

//String Compression
//two pointer approach