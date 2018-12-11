package checking_groups;

import java.util.ArrayDeque;

public class Groups {

    public static boolean groupCheck(String s){
        ArrayDeque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            if (symbol == '(' || symbol == '[' || symbol == '{') {
                deque.push(symbol);
            }
            else if (symbol == ')' && deque.peek() == '(' || symbol == ']' && deque.peek() == '[' ||
                    symbol == '}' && deque.peek() == '{') {
                deque.pop();
            }
            else return false;
        }
        if (deque.isEmpty()) return true;

        return false;
    }
}
