
public class Q1 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int j=0;
        for(int i=0; i<s.length(); i++){
            while(j<s.length() && s.charAt(j)!=' ') j++;
            for(int k=j-1; k>=i; k--){
                sb.append(s.charAt(k));
            }
            if(j!=s.length()) sb.append(" ");
            j++;
            i=j-1;
        }
        return sb.toString();
    }
}
