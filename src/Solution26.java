/**
 * Copyright (C), 2016-2018, 李浩楠
 * FileName: Solution26
 * Author:   mac
 * Date:     2018/11/8 7:54 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import java.util.Stack;

/**
 * 〈longest-valid-parentheses〉<对应第32题>
 * 〈〉
 *
 * @author mac
 * @create 2018/11/8
 * @since 1.0.0
 */
public class Solution26 {
    public static int longestValidParentheses(String s) {
        int maxans = 0;
        Stack <Integer> stack = new Stack <>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        return maxans;
    }

    public static void main(String[] args) {
        System.out.println(longestValidParentheses("(()"));
        System.out.println(longestValidParentheses(")()())"));
    }
}

