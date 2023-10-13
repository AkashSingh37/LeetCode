class Solution {
    public int minBitFlips(int start, int goal) {
        if(start == goal){
            return 0;
        }
        int xor = start ^ goal;
        int counter=0;
        while(xor > 0) {
            xor = xor & (xor-1);
            counter++;
        }
        return counter;
    }
}
