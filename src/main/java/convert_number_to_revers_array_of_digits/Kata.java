package convert_number_to_revers_array_of_digits;

public class Kata {
    /*
    Convert number to reversed array of digits
    Given a random number:
    C#: long;
    C++: unsigned long;
    You have to return the digits of this number within an array in reverse order.
    Example:
    348597 => [7,9,5,8,4,3]
     */

    public static int[] digitize(long n) {
        String convert = (new Long(n).toString());
        char[] chars = convert.toCharArray();
        int[] arr = new int[chars.length];
        int counter = 0;
        for (int i = chars.length; i > 0; i--) {
            arr[counter] = Character.getNumericValue(chars[i - 1]);
            counter += 1;
        }
        return arr;
    }
}
