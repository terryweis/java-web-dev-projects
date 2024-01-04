package org.example;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {


    public static void main(String[] args) {
        String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = phrase.toCharArray();
        HashMap<Character, Integer> letters = new HashMap<>();
        for (char c : charactersInString) {
            if (letters.containsKey(c)) {
                letters.put(c, letters.get(c) + 1);
            } else {
                letters.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> count : letters.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }
    }
}