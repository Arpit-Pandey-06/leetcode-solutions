class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> obj = new HashMap<Character, Integer>();
        obj.put('I', 1);
        obj.put('V', 5);
        obj.put('X', 10);
        obj.put('L', 50);
        obj.put('C', 100);
        obj.put('D', 500);
        obj.put('M', 1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && obj.get(s.charAt(i)) < obj.get(s.charAt(i + 1))) {
                result = result + (obj.get(s.charAt(i + 1)) - obj.get(s.charAt(i)));
                i += 1;
            } else {
                result = result + obj.get(s.charAt(i));
            }
        }
        return result;
    }
}
