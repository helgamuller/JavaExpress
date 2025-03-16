package Collections.collections.Misc;

import java.util.Map;
import java.util.Stack;

public class Braces {
private static boolean validateBrackets(String s) {
    Stack<Character> stack = new Stack<>();
    Map<Character, Character> brackets = Map.of(')','(', '}','{', ']', '[');
    for (char c :s.toCharArray()) {
        if (brackets.containsValue(c))
        {
            stack.push(c);
        } else if (brackets.containsKey(c)) {
            if (stack.isEmpty()||stack.pop() != brackets.get(c))
            return false;
        }
    }
    return stack.isEmpty();
}

    public static void main(String[] args) {
    String s = "{([])";
        System.out.println(validateBrackets(s));

    }
}
