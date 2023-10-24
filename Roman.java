class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");

        ArrayList<Integer> list = new ArrayList<>();
        for(int key : map.keySet()) {
            list.add(key);
        }

        Collections.sort(list, Collections.reverseOrder());

        for(int n : list) {
            while(num >= n) {
                sb.append(map.get(n));
                num -= n;
            }
        }
        
        
        return sb.toString();

        
    }
}
