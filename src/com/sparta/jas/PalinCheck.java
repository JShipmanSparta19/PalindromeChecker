package com.sparta.jas;

import java.util.Arrays;

public class PalinCheck {

    public Boolean check(String testString){
        testString = testString.toLowerCase();
        String[] splitString = testString.split("");
        String[] reversedString = new String[splitString.length];
        for(int i = 0; i < splitString.length; i++){
            reversedString[i] = splitString[(splitString.length-1)-i];
        }

        return Arrays.equals(splitString, reversedString);
    }
}
