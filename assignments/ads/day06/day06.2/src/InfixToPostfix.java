import java.util.Stack;

public class InfixToPostfix {
	public static void main(String[] args) {
		String infix = "a*b/c*d+e*f-g+h";
		System.out.println("Infix : "+infix);
		System.out.println("Postfix : "+infixToPostfix(infix));
		//Answer : ab*c/d*ef*+g-h+
		System.out.println("Infix : 4*5+6/8*9+7-2");
		System.out.println("Evaluated postfix : "+evaluatePostfix(infixToPostfix("4*5+6/8*9+7-2")));
		//100 200 + 2 / 5 * 7 + : 757
		System.out.println("Evaluated postfix of 100 200 + 2 / 5 * 7 + : "+evaluateMultiDigitPostfix("100 200 + 2 / 5 * 7 +"));
	}
	
	public static int priority(char operator) {
		switch (operator) {
		case '+':
		case '-':
			return 1;

		case '*':
		case '/':
		case '%':
			return 2;
		}
		return -1;
	}
	
	public static boolean isOperand(char operand) {
		return ( (operand >= 65 && operand <= 90) || (operand >= 97 && operand <= 122) || (operand >= 48 && operand <= 57) );
	}
	
	public static String infixToPostfix(String infix) {
		Stack<Character> stack = new Stack<Character>();
		StringBuilder postfix = new StringBuilder();
		for(int i = 0 ; i < infix.length() ; i++) {
			char current = infix.charAt(i);
			if(isOperand(current))
				postfix.append(current);
			else {
				while( !stack.empty() && priority( stack.peek() ) >= priority(current))
					postfix.append(stack.pop());
				stack.push(current);
			}
		}
		while( !stack.empty() )
			postfix.append( stack.pop() );
		return postfix.toString();
	}
	
	public static int calculate(int first, int second, char operator) {
		switch (operator) {
		case '+': return (first+second);
		case '-': return (first-second);
		case '*': return (first*second);
		case '/': return (first/second);
		}
		return -1;
	}
	
	public static int evaluatePostfix(String postfix) {
		int result = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0 ; i < postfix.length() ; i++) {
			char current = postfix.charAt(i);
			if(isOperand(current))
				stack.push(current - '0');
			else {
				int op2 = stack.pop();
				int op1 = stack.pop();
				
				result = calculate(op1, op2, current);
				stack.push(result);
			}
		}
		
		return stack.pop();
	}
	
	public static int evaluateMultiDigitPostfix(String postfix) {
		int result = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0 ; i < postfix.length() ; i++) {
			char current = postfix.charAt(i);
			if(current == ' ')
				continue;
			else if(isOperand(current)) {
				int temp = 0;
				while(postfix.charAt(i) != ' ') {
					temp = temp*10 + (postfix.charAt(i) - '0');
					i++;
				}
				stack.push(temp);
			}
			else {
				int op2 = stack.pop();
				int op1 = stack.pop();
				
				result = calculate(op1, op2, current);
				stack.push(result);
			}
		}
		
		return stack.pop();
	}
}






