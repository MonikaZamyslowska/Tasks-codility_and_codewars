package find_the_stray_number;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    /*
    You are given an odd-length array of integers, in which all of them are the same, except for one single number.
    Complete the method which accepts such an array, and returns that single different number.
     */

    public static int stray(int[] numbers) {
        int firstElement = numbers[0];
        List<Integer> list = Arrays.stream(numbers)
                .boxed()
                .filter(integer -> integer != firstElement)
                .collect(Collectors.toList());
        if (list.size() == 1) {
            return list.get(0);
        }
        return firstElement;
    }
}
