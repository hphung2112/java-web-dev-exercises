package exercises;

import java.util.HashMap;

public class Studiocountingcharacter {
    public static void main(String[] args) {

        String hiddenFigures = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you've done that, it's pretty straightforward from there.";
        HashMap<Character, Double> charactersCount = new HashMap<>();
        char[] charactersInString = hiddenFigures.toCharArray();
        for (char c: charactersInString) {
            if (charactersCount.containsKey(c)) {
                final Double put = charactersCount.put(c, charactersCount.get(c) + 1);
            } else {
                charactersCount.put(c,1.00);
            }
        }
    }
}
