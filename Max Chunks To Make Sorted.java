// class Solution {
//     public int maxChunksToSorted(int[] arr) {
//         int chunks = 1;
//         if(arr.length == 1){
//             return 1;
//         }
//         int max = arr[0];
//         for(int i=0; i<arr.length; i++){
//             if(max < arr[i]){
//                 chunks++;
//             }
//             max = Math.max(arr[i], max);
//         }
//         return chunks;
//     }
// }

class Solution {
    public int maxChunksToSorted(int[] arr) {
        int chunks = 0;
        int max = 0;
        
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            if (max == i) {
                chunks++;
            }
        }
        
        return chunks;
    }
}
