class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> alpha = new HashMap<Character, String>();
        String[] val=s.split(" ");
        if (val.length != pattern.length()) 
            return false;
        for(int i = 0; i < pattern.length(); i++) {
            char c=pattern.charAt(i);
            String w=val[i];
            if(!alpha.containsKey(c)){
                if(alpha.containsValue(w))
                    return false;
                alpha.put(c,w);
            }
            else if(!alpha.get(c).equals(w)) 
                return false;
        }
        return true;
    }
}


//pattern= abba s="dog cat cat dog"