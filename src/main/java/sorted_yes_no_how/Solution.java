package sorted_yes_no_how;

public class Solution {
    private static String ASCENDING = "yes, ascending";
    private static String DESCENDING = "yes, descending";
    private static String NO = "no";

    public static String isSortedAndHow(int[] array) {
        int countAsc = 0;
        int countDes = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                countDes++;
            }
            else if (array[i] < array[i + 1]) {
                countAsc++;
            }
        }

        if (countAsc == 0) {
            return DESCENDING;
        }
        if (countDes == 0) {
            return ASCENDING;
        }
        return NO;
    }
}
