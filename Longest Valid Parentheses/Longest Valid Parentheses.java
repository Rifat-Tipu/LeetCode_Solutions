class Solution {
    public int longestValidParentheses(String s) {
         Stack<Integer>st=new Stack<>();
        int mxlen=0;
        st.push(-1);

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' )
            {
                st.push(i);
                
            }
            else
            {
               st.pop();

                if(!st.isEmpty())
                {
                   int ln=i-st.peek();
                   mxlen=Math.max(mxlen,ln);
                }
                else
                {
                    st.push(i);
                }
            }
        }
        return mxlen;
    }
}                                    
