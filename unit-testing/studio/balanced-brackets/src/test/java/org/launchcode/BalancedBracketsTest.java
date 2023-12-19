package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void openingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void closingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void multipleBracketsIsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch][Code]"));
    }

    @Test
    public void multipleBracketsIsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch][Code"));
    }

    @Test
    public void bracketsWithinBracketsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
    @Test
    public void blankStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void reverseBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void verifyBreak() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][[[[]]]"));
    }
    @Test
    public void withStringInTheMiddle() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Word[]"));
    }
    @Test
    public void bracketsEnclosedWithWords() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("The[]End"));
    }
    @Test
    public void missingWithWords() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[The[]End"));
    }

}