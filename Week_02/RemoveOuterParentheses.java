import java.util.Stack;

class RemoveOuterParentheses {
    public String removeOuterParentheses2(String S) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        int start = 0;// 初始化原语的起始位置
        int end = 0;// 初始化原语的结束位置
        boolean flag = false;// 标志每个原语

        for (int i = 0;i < S.length();i++) {
            char ch = S.charAt(i);

            if (ch == '(') {// 遇到左括号，入栈
                stack.push(ch);
                if (!flag) {// 遇到的第一个左括号，是原语的开始位置，记录下原语开始位置
                    start = i;
                    flag = true;
                }
            }

            if (ch == ')') {// 遇到右括号，出栈
                stack.pop();
                if (stack.isEmpty()) {// 当栈空的时候，找到了一个完整的原语
                    end = i;// 记录下结束位置
                    ans.append(S.substring(start + 1,end));// 去掉原语的最外层括号，并追加到答案中
                    flag = false;// 置标志为false，往后接着找下一个原语
                    start = end;// 往后找，再次初始化原语开始位置
                }
            }
        }
        return ans.toString();
    }

    public String removeOuterParentheses3(String S) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        int start = 0;
        int end = 0;
        boolean isYuanyu = false;

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (ch == '(') {
                stack.push(ch);
                if (!isYuanyu) {
                    start = i;
                    isYuanyu = true;
                }
            }

            if (ch == ')') {
                stack.pop();
                if (stack.isEmpty()) {
                    end = i;
                    ans.append(S.substring(start + 1, end));
                    isYuanyu = false;
                    start = end;
                }
            }

        }

        return ans.toString();
    }


    public String removeOuterParentheses4(String S) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int start = 0;
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == '('){
                stack.push('(');
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    sb.append(S.substring(start + 1, i));
                    start = i + 1;
                }
            }
        }
        return sb.toString();
    }


    public String removeOuterParentheses(String S) {

        int left = 0;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(' && left++ > 0)
                res.append('(');
            if (S.charAt(i) == ')' && --left > 0)
                res.append(')');
        }
        return res.toString();
    }
}