package rules;

public class RulesOf6005 {
    
    public static boolean mayUseCodeInAssignment(boolean writtenByYourself,
            boolean availableToOthers, boolean writtenAsCourseWork,
            boolean citingYourSource, boolean implementationRequired) {
        
        if (writtenByYourself) {
            // If the code was written by you, you can use it.
            return true;
        } else {
            // If the code was not written by you, check other conditions.
            if (availableToOthers) {
                return false;
            } else {
                // If the code is not available to others, check further.
                if (writtenAsCourseWork) {
                	return false;
                } else {
                    if (citingYourSource) {
                        if (implementationRequired) {
                            return false;
                        }
                        return true; 
                    }
                    return false; // Not cited, cannot be used.
                }
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("You may certainly use code you wrote yourself: " +
            RulesOf6005.mayUseCodeInAssignment(true, false, true, true, true));
    }
}
