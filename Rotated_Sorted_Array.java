package DSA;

public class Rotated_Sorted_Array {
    public static int search(int[] arr, int target, int start, int end) {
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[start] <= arr[mid]) {
            if(arr[start]<= target && target <= arr[mid-1]){
                return search(arr, target, start, mid);
            }else{
                return search(arr, target, mid+1, end);
            }
        }else{
            if(arr[mid] <= target && target <= arr[end]){
                return search(arr, target, mid+1, end);
            }else{
                return search(arr, target, start, mid -1);
            }
        }
    }
    public static void main (String[] args){
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 1;
        int index = search(arr, target, 0, arr.length-1);
        System.out.println(index);
    }
}