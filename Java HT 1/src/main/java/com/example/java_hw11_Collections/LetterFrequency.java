package com.example.java_hw11_Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть речення:");
        String input = scanner.nextLine();

        Map<Character, Integer> letterFrequency = countLetterFrequency(input);
        printLetterFrequency(letterFrequency);
    }

    private static Map<Character, Integer> countLetterFrequency(String input) {
        Map<Character, Integer> letterFrequency = new HashMap<>();

        for (char letter : input.toCharArray()) {
            char lowerCaseLetter = Character.toLowerCase(letter);

            if (Character.isLetter(lowerCaseLetter)) {
                letterFrequency.put(lowerCaseLetter, letterFrequency.getOrDefault(lowerCaseLetter, 0) + 1);
            }
        }

        return letterFrequency;
    }

    private static void printLetterFrequency(Map<Character, Integer> letterFrequency) {
        System.out.println("Частота літер у реченні:");
        for (Map.Entry<Character, Integer> entry : letterFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

