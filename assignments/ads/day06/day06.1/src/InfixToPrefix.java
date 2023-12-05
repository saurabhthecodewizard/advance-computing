import java.util.Stack;

public class InfixToPrefix {
	public static void main(String[] args) {
		String infix = "a*b/c*d+e*f-g+h";
		System.out.println("Infix : "+infix);
		System.out.println("Prefix : "+infixToPrefix(infix));
		//Answer : +-+*/*abcd*efgh
		System.out.println("Infix : 4*5+6/8*9+7-2");
		System.out.println("Evaluated prefix : "+evaluatePrefix(infixToPrefix("4*5+6/8*9+7-2")));
		System.out.println("Evaluated prefix of + 100 * 200 3 : "+evaluateMultiDigitPrefix("+ 100 * 200 3"));
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
	
	public static String infixToPrefix(String infix) {
		Stack<Character> stack = new Stack<Character>();
		StringBuilder prefix = new StringBuilder();
		for(int i = infix.length() - 1 ; i >= 0 ; i--) {
			char current = infix.charAt(i);
			if(isOperand(current))
				prefix.append(current);
			else {
				while( !stack.empty() && priority(stack.peek()) > priority(current))
					prefix.append(stack.pop());
				stack.push(current);
			}
		}
		while( !stack.empty() )
			prefix.append( stack.pop() );
		return (prefix.reverse()).toString();
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
	
	public static int evaluatePrefix(String prefix) {
		int result = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = prefix.length() - 1 ; i >= 0 ; i--) {
			char current = prefix.charAt(i);
			if(isOperand(current))
				stack.push(current - '0');
			else {
				int op1 = stack.pop();
				int op2 = stack.pop();
				
				result = calculate(op1, op2, current);
				stack.push(result);
			}
		}
		
		return stack.pop();
	}
	
	public static int evaluateMultiDigitPrefix(String prefix) {
		int result = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = prefix.length() - 1 ; i >= 0 ; i--) {
			char current = prefix.charAt(i);
			if(current == ' ')
				continue;
			else if(isOperand(current)) {
				int temp = 0, j = i;
				while(prefix.charAt(i) != ' ') {
					i--;
				}
				i++;
				for(int k = i ; k <= j ; k++)
					temp = temp*10 + (prefix.charAt(k) - '0'); 
				stack.push(temp);
			}
			else {
				int op1 = stack.pop();
				int op2 = stack.pop();
				
				result = calculate(op1, op2, current);
				stack.push(result);
			}
		}
		
		return stack.pop();
	}
}
