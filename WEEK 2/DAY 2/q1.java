class q1 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l=0;
        int r=0;
        int maxLen = 0;

        while(r<s.length()){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r),0)+1);

            while(map.get(s.charAt(r))>1){
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l)) == 0) map.remove(s.charAt(l));
                l++;
            }

            maxLen = Math.max(maxLen, r-l+1);
            r++;
        }

        return maxLen;

    }
}