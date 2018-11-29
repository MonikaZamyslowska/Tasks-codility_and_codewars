package find_the_new_perfect_sqare;

public class NumberFun {
    /*
    You might know some pretty large perfect squares. But what about the NEXT one?
    Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter.
    Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.
    If the parameter is itself not a perfect square, than -1 should be returned. You may assume the parameter is positive.
     */

    public static long findNextSquare(long sq) {
        long root;
        long nextSq = -1;
        for(long x = 2; x * x <= sq; x++) {
            if (x * x == sq) {
                root = x + 1;
                nextSq = root * root;
            }
        }
        return nextSq;
    }
}
