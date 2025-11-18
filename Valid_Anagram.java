package org.example;

import java.util.Arrays;

public class Valid_Anagram {
    public boolean isAnagram(String s, String t) {

        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();

        Arrays.sort(sa);
        Arrays.sort(ta);

        if (Arrays.equals(sa, ta)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Valid_Anagram object = new Valid_Anagram();
        object.isAnagram("racecar", "carrace");
    }
}
