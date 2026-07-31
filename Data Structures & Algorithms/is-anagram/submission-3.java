class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character , Integer> s1 = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) { 
            s1.put(c,s1.getOrDefault(c, 0) + 1);
            }
        }
        Map<Character , Integer> s2 = new HashMap<>();
        for (char c : t.toCharArray()) {
            if (Character.isLetter(c)) { 
            s2.put(c,s2.getOrDefault(c, 0) + 1);
            }
        }
        return (s1.equals(s2));
    }
}
