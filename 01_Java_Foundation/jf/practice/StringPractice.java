package jf.practice;

import java.util.HashMap;

public class StringPractice {
    public static void main(String[] args) {
        String str = "Hello";

        int len = length(str);
        System.out.println(len);
    }

    static int length(String str) {
        int length = 0;

        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {

        }
        return length;
    }

    static char[] toCharArray(String str) {
        char[] charArr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            charArr[i] = str.charAt(i);
        }

        return charArr;
    }

    static void countVC(String str) {
        // count vowels/consonants
        int numV = 0;
        int numC = 0;


        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) { // for (char ch: str.toCharArray()) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') { // if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u') {
                    numV++;
                } else  {
                    numC++;
                }
            }
        }

        System.out.printf("Vowels: %d, Consonants: %d\n", numV, numC);
    }

    public static String removeVowels(String str) {
        StringBuilder result = new StringBuilder();

        for (char ch: str.toCharArray()) {
            if (Character.isLetter(ch)) {
                char lowerCh = Character.toLowerCase(ch);
                if (lowerCh != 'a' && lowerCh != 'e' && lowerCh != 'i' && lowerCh != 'o' && lowerCh != 'u') {
                    result.append(ch);
                }
            } else {
                result.append(ch);
            }
        }

        for (char ch: str.toCharArray()) {
            char lowerCh = Character.toLowerCase(ch);
            if (lowerCh != 'a' && lowerCh != 'e' && lowerCh != 'i' && lowerCh != 'o' && lowerCh != 'u') {
                result.append(ch);
            }
        }


        return result.toString();
    }

    public static char upperCase(char c) {
//        if (!Character.isLetter(c)) return '❌'; // indicating invalid input
//
//        if (Character.isUpperCase(c)) return c;
//
//        return (char)(c - 32);

        if (c >= 'a' && c <= 'z') {
            return (char)(c - 32);
        }

        return c;
    }

    public static String toggleCase(String s) {
        StringBuilder result = new StringBuilder();

        for (char ch: s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
            } else if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static int countWords(String s) {
//        Immature way
//        int count = 0;
//
//        for (char ch: s.toCharArray()) {
//            if (ch == ' ') {
//                count++;
//            }
//        }
//
//        return count + 1;

        // Mature way
        if (s == null || s.trim().isEmpty()) return 0;

        String[] words = s.trim().split("\\s+"); // split by one or more spaces

        return words.length;
    }

    public static HashMap<Character, Integer> countFrequency(String s) {
        HashMap<Character, Integer> result = new HashMap<>();

        for (char ch: s.toCharArray()) {
            if (result.containsKey(ch)) {
                result.put(ch, result.get(ch) + 1);
            } else {
                result.put(ch, 1);
            }
        }

        return result;
    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int len = charArray.length;

        for (int i = 0; i < len / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[len - 1 - i];
            charArray[len - 1 - i] = temp;
        }

        return new String(charArray);
    }

    public static boolean palindromeCheck(String s) {
        String reversed = reverseString(s);
        return s.equals(reversed);
    }

    public static String replaceSpace(String s, char c) {
        if (s.isEmpty()) return s;

        StringBuilder result = new StringBuilder();

        for (char ch: s.toCharArray()) {
            if (Character.isSpaceChar(ch)) {
                result.append(c);
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static String simplify(String s) {
        StringBuilder str = new StringBuilder();

        for (char ch: s.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                str.append(ch);
            }
        }

        return str.toString();
    }

    public static boolean isAnagram(String s1, String s2) {
        // simplify both strings, to containing only lowered case alphabets
        String str1 = simplify(s1);
        String str2 = simplify(s2);

        // compare their lengths
        if (str1.length() != str2.length()) return false;

        // check if both have same characters in them
        int[] counter = new int[26];

        for (char ch: str1.toCharArray()) {
            counter[ch - 'a']++;
        }

        for (char ch: str2.toCharArray()) {
            counter[ch - 'a']--;
        }

        for (int n: counter) {
            if (n != 0) return false;
        }

        return true;
    }
}
