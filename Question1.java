package assignment17;

import java.util.HashMap;
import java.util.Map;

public class Question1 {

	public static int firstUniqChar(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        
       
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
     
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        
        return -1;
    }
    
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode")); 
     
    }
}