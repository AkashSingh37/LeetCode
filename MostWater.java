package ArrayLearning;

import java.util.Scanner;

public class MostWater {
    static int area(int[] height){
        int maxWater =0;
        int curr = 0;
        int left =0;
        int right = height.length-1;

        while(left < right){
            int ht = Math.min(height[left], height[right]);
            int width = right-left;
            curr = ht*width;
            maxWater = Math.max(maxWater, curr);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] height = new int[len];
        for(int i=0; i<len; i++){
            height[i] = sc.nextInt();
        }
        System.out.println(area(height));
    }
}
