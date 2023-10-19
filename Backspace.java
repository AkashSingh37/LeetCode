class Solution {
    static int checkString(char[] arr){
        int i =0;
        for(char c : arr){
            if(c != '#'){
                arr[i] = c;
                i++;
            }else if(i>0){
                i--;
            }
        }
        return i;
    }
    public boolean backspaceCompare(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        int l = checkString(arr1);
        int m = checkString(arr2);

        if(l != m){
            return false;
        }

        for(int i=0; i<l; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
