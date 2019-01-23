package help_the_fruit_guy;

import java.util.Arrays;

public class FruitGuy {

    public static String[] removeRotten(String[] fruitBasket) {
        if (fruitBasket == null) return new String[0];

        String[] basket = Arrays.stream(fruitBasket)
                .map(s -> s.replace("rotten", "").toLowerCase())
                .toArray(String[]::new);

        return basket;
    }
}
