import java.util.Stack;

public class Brackets {
    public static boolean verificarBrackets(String s) {
        Stack<Character> pilha = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                pilha.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (pilha.isEmpty()) {
                    return false;
                }
                char topo = pilha.pop();
                if ((c == ')' && topo != '(') ||
                        (c == '}' && topo != '{') ||
                        (c == ']' && topo != '[')) {
                    return false;
                }
            }
        }
        return pilha.isEmpty();
    }
}
