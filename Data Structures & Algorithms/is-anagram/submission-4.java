class Solution {
    public boolean isAnagram(String s, String t) {

        char[] firstArray = s.toCharArray();
        char[] secondArray = t.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        s = new String(firstArray);
        t = new String(secondArray);

        return s.equals(t);
    }
}
