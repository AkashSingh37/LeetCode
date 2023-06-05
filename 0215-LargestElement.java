class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        //PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // for(int i=0; i<nums.length; i++){
        //     pq.add(nums[i]);
        // }
        // int i=1;
        // while(i<k){
        //     pq.remove();
        //     i++;
        // }
        // return pq.peek();
        
        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
