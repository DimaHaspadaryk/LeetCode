package org.example;

import java.util.Arrays;

public class Valid_anagram {
    public boolean isAnagram(String s, String t){
        char [] s1 = s.toCharArray();
        char [] t1 = t.toCharArray();
        boolean valid = true;
        Arrays.sort(s1);
        Arrays.sort(t1);
        if(Arrays.equals(s1,t1)){
            valid = true;
        }
        else{
            valid = false;
        }
    return valid;
    }
}
