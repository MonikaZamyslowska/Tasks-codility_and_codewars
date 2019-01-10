package mumbling;

public class Accumul {
    /*
    This time no story, no theory. The examples below show you how to write function accum:
    Examples:
    accum("abcd") -> "A-Bb-Ccc-Dddd"
    accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
    accum("cwAt") -> "C-Ww-Aaa-Tttt"
    The parameter of accum is a string which includes only letters from a..z and A..Z.
     */

    public static String accum(String s) {
        StringBuilder builder = new StringBuilder();
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            char letter = Character.toLowerCase(s.charAt(i));
            while (counter < i + 1) {
                if (counter == 0) {
                    builder.append(Character.toUpperCase(letter));
                } else builder.append(letter);
                counter++;
            }
            if (i != s.length() - 1) {
                builder.append("-");
                counter = 0;
            }
        }
        return builder.toString();
    }
}
