import java.util.Stack;

public class EvaluateReversePolishNotation {
    /*

    Evaluate the value of an arithmetic expression in Reverse Polish Notation.
    Valid operators are +, -, *, /.
    Each operand may be an integer or another expression.
    For example:
    ["2", "1", "+", "3","*"] -> ((2 + 1) * 3) -> 9
    ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6

     */

    public static void main(String[] args) {
        String[] tokens = new String[]{"4", "5", "13", "/", "+"};
        System.out.println(evalRPN(tokens));
    }

    private static int evalRPN(String[] tokens) {
        String operators = "+-*/";
        Stack<String> stack = new Stack<>();
        String result = "";

        for (String each : tokens) {
            if (!operators.contains(each)) {
                stack.push(each);
            } else {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                switch (each) {
                    case "+":
                        result = stack.push(a + b + "");
                        break;
                    case "-":
                        result = (a > b) ? stack.push(a - b + "") :stack.push(b - a + "");
                        break;
                    case "*":
                        result = stack.push(a * b + "");
                        break;
                    case "/":
                       result = (a>b)? stack.push(a / b + ""): stack.push(b / a + "");
                        break;
                    default:
                        System.err.println("\"" + each + "\" invalid operator");
                        System.exit(0);
                }

            }
        }
        return Integer.parseInt(result);
    }
}