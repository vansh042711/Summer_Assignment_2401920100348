class q2 {
    public boolean checkInclusion(String s1, String s2) {
          int s1freq[] = new int[26];
        int s2freq[] = new int[26];
        int s1len = s1.length();
        int s2len = s2.length();

        int l=0; 
        int r=0;

        for(int i=0; i<s1len; i++) s1freq[s1.charAt(i)-'a']++;
        
        while(r<s2len){
            s2freq[s2.charAt(r)-'a']++;

            if(r-l+1 > s1len){
                s2freq[s2.charAt(l)-'a']--;
                l++;
            }

            Boolean ans = true;
            for(int i=0; i<26; i++){
                if(s1freq[i] != s2freq[i]){
                    ans = false;
                    break;
                }
            }

            if(ans) return ans;
            r++;
        }

        return false;

    }
}