class Solution {
    public int[] dailyTemperatures(int[] temp) {
        // int[] arr = new int[temperatures.length];
        // for(int i=0; i<temperatures.length; i++){
        //     arr[i] = 0;
        //     for(int j=i; j<temperatures.length; j++){
        //         if(temperatures[j] > temperatures[i]){
        //             arr[i] = j-i;
        //             break;
        //         }
        //     }
        // }
        // return arr;
        //TLE
        
        int n = temp.length;
        int res[] = new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++)
        {
            while(!st.isEmpty() && temp[i] > temp[st.peek()])
            {
                res[st.peek()] = i - st.peek();
                st.pop();
            }
            st.push(i);
        }
        return res;

    }
}
