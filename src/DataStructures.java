public class DataStructures {
    /*
    A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

    Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"

    Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

    Given a string, determine if it is balanced or not.
     */
    public static void dataStrucutures() {
        String input = "{()}";
        // check maybe if it's either {, (, [ first?
        // then check next and next until you find opposite? if not return false
        // transform input to char[]
        // lets say we have {()} len is 4 so } should be last or second
        // ({()}), ( opposite should be last or second, so next { should be len-1 and ( len -2
        // LIFO last in last out
    }
}
