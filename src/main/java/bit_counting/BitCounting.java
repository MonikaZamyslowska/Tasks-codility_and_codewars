package bit_counting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BitCounting {
    /*
    Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary
    representation of that number. You can guarantee that input is non-negative.
    Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
     */

    public static int countBits(int n){
        String convert = Integer.toBinaryString(n);
        List<String> binaryList = new ArrayList(Arrays.asList(convert.split("")));

        binaryList = binaryList.stream()
                .filter(character -> character.equals("1"))
                .collect(Collectors.toList());

        return binaryList.size();
    }
}
