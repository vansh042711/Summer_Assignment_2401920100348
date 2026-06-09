class q3 {
    public List<Integer> findAnagrams(String s, String p) {
       List<Integer> list = new ArrayList<>();
        int pfreq[] = new int[26];
        int sfreq[] = new int[26];
        int l=0;
        int r=0;
        int plen = p.length();
        for(int i=0; i<plen; i++){
            pfreq[p.charAt(i)-'a']++;
        }

        while(r<s.length()){
            sfreq[s.charAt(r)-'a']++;

            if(r-l+1 > plen){
                sfreq[s.charAt(l)-'a']--;
                l++;
            }

            boolean anagram = true;
            for(int i=0; i<26; i++){
                if(sfreq[i]!=pfreq[i]){
                    anagram  = false;
                    break;
                }
            }

            if(anagram) list.add(l);
            r++;
        }
        return list;
    }
}