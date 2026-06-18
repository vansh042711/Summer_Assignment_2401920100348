
public class q1 {
    public int largestRectangleArea(int[] h) {
        Stack<Integer> st = new Stack<>();
        int n = h.length;

        //next smallest element
        int nse[] = new int[n];
        for(int i=n-1; i>=0; i--){
            while(st.size()>0 && h[i]<=h[st.peek()]) st.pop();

            if(st.size()==0) nse[i] = n;
            else nse[i]=st.peek();

            st.push(i);
        }

        //stack empty
        while(st.size()>0) st.pop();

        //previous ssmallest element
        int pse[] = new int[n];
        for(int i=0; i<n; i++){
            while(st.size()>0 && h[i]<=h[st.peek()]) st.pop();

            if(st.size()==0) pse[i] = -1;
            else pse[i]=st.peek();

            st.push(i);
        }

        //maxArea
        int maxarea=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int area = h[i] * (nse[i]-pse[i]-1);
            maxarea = Math.max(maxarea, area);
        }
        return maxarea;
    }
}
