/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package rules;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnit tests for RulesOf6005.
 */
public class RulesOf6005Test {
    
    /**
     * Tests the mayUseCodeInAssignment method.
     */
    @Test
    public void testMayUseCodeInAssignment() {
        assertFalse("Expected false: un-cited publicly-available code",
                RulesOf6005.mayUseCodeInAssignment(false, true, false, false, false));
        assertTrue("Expected true: self-written required code",
                RulesOf6005.mayUseCodeInAssignment(true, false, true, true, true));
    }

    /**
     * Tests using code that is external and not cited.
     */
    @Test
    public void testExternalUncitedCode() {
        assertFalse("Expected false: uncited external code",
                RulesOf6005.mayUseCodeInAssignment(false, false, false, false, false));
    }
    /**
     * Tests using coursework written by a team mate.
     */
    @Test
    public void testTeammateCoursework() {
        assertFalse("Expected false: code from a teammate's coursework",
                RulesOf6005.mayUseCodeInAssignment(false, false, true, false, false));
    }
}
