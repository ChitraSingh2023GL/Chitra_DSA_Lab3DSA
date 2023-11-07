package balanceBrackets.Service;
import java.util.Stack;

public class balanceBracketsService {

	char[] ch;

	public balanceBracketsService() {
		// TODO Auto-generated constructor stub
	}

	public boolean checkBalanceBrackets(String input) {
		// TODO Auto-generated method stub
		this.ch = input.toCharArray();
		Stack<Character> stk = new Stack<>();
		int matchchar;
		// boolean result=false;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ')
				continue;
			if ((ch[i] == '(') || (ch[i] == '{') || (ch[i] == '[')) {
				stk.push(ch[i]);
				continue;
			}
			if (ch[i] == '}' || ch[i] == ']' || ch[i] == ')') {

				if (stk.empty())
					return false;
			}
			if (ch[i] == '}') {

				matchchar = stk.pop();
				if ((char) matchchar != '{')
					return false;
			}
			if (ch[i] == ']') {
				matchchar = stk.pop();
				if ((char) matchchar != '[')
					return false;
			}
			if (ch[i] == ')') {
				matchchar = stk.pop();
				if ((char) matchchar != '(')
					return false;
			}

		}

		return stk.empty();
	}

}
