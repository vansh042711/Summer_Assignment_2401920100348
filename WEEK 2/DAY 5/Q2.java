class Q2 {
    public Boolean isPalindrome(String s, int i, int j){
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String maxStr = "";
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                if(isPalindrome(s, i, j)){
                    if(maxStr.length()<j-i+1) {
                        maxStr = s.substring(i, j+1);
                    }
                }
            }
        }
        return maxStr;
    }
}