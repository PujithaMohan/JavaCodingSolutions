package com.practice.InterviewCodeSnippets;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatingCharacterInAString {
    public static void main(String[] args) {
        //return a first non repeating character's index in a string, if none exists return -1
        //ex: aabbcd - output : c
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = scanner.nextLine();
        System.out.println("Index of first non repeating character"+computeIndex(string));
    }

    public static int computeIndex(String s) {
        Map<Character, Integer> characterIntegerMap = new LinkedHashMap<>();
        for (char c : s.toCharArray())
            characterIntegerMap.put(c, characterIntegerMap.getOrDefault(c, 0) + 1);

        for (Map.Entry<Character, Integer> entry : characterIntegerMap.entrySet()) {
            if (entry.getValue() == 1) {
                return s.indexOf(entry.getKey());
            }
        }
        return -1;
    }
}