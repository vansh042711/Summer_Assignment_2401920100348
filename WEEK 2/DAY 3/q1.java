public class q1 {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int l=n/2; l>=1; l--){
            if(n%l == 0){
                int times = n/l;
                String sub = s.substring(0, l);
                while(times!=0){
                    sb.append(sub);
                    times--;
                }

                if(sb.toString().equals(s)) return true;
            }
            sb.setLength(0);
        }
        return false;
    }
}
