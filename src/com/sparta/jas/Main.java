package com.sparta.jas;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String testStringTrue = "racecar";
        String testStringFalse = "notlob";
        PalinCheck palindrome = new PalinCheck();
        Boolean isPalindrome = palindrome.check(testStringTrue);
        Boolean notPalindrome = palindrome.check(testStringFalse);
        System.out.println(testStringTrue + ": " + isPalindrome);
        System.out.println(testStringFalse + ": " + notPalindrome);
    }
}
