
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the Dijkstra Calculator\n");

        System.out.print("Enter an expression --> ");
        String expression = in.nextLine();

        System.out.println("\nThe expression evaluates to " + evaluate(expression));
    }

    public static double evaluate(String expression)
    {
        char [] expressionArray = expression.toCharArray();

        Stack operandStack = new Stack(expression.length());
        Stack operatorStack = new Stack(expression.length());

        int startOfNumber;
        int endOfNumber;

        int i = 0;

        while(i < expressionArray.length)
        {
            if (expressionArray[i] == '(' || expressionArray[i] == ' ')
            {
                i ++;
            }
            else if (expressionArray[i] >= '0' && expressionArray[i] <= '9')
            {
                startOfNumber = i;

                while (expressionArray[i] >= '0' && expressionArray[i] <= '9')
                {
                    i ++;
                }

                endOfNumber = i;

                operandStack.push(expression.substring(startOfNumber, endOfNumber));
            }
            else if (expressionArray[i] == '+' || expressionArray[i] == '-' || expressionArray[i] == '*' || expressionArray[i] == '/')
            {
                operatorStack.push(String.valueOf(expressionArray[i]));

                i ++;
            }
            else if (expressionArray[i] == ')')
            {
                String operator = operatorStack.pop();
                double rightOperand = Double.parseDouble(operandStack.pop());
                double leftOperand = Double.parseDouble(operandStack.pop());

                switch (operator)
                {
                    case "+":
                        operandStack.push(String.valueOf(leftOperand + rightOperand));
                        break;
                    case "-":
                        operandStack.push(String.valueOf(leftOperand - rightOperand));
                        break;
                    case "*":
                        operandStack.push(String.valueOf(leftOperand * rightOperand));
                        break;
                    case "/":
                        operandStack.push(String.valueOf(leftOperand / rightOperand));
                        break;
                }

                i ++;
            }
            else
            {
                throw new IllegalArgumentException("The expression you have entered is invalid");
            }
        }

        return Double.parseDouble(operandStack.pop());
    }
}
