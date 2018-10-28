/**
 * Copyright (C), 2016-2018, 李浩楠
 * FileName: Solution16
 * Author:   mac
 * Date:     2018/10/28 8:47 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


import java.util.HashMap;
import java.util.Stack;

/**
 * 〈valid-parentheses〉<对应第二十题>
 * 〈〉
 *
 * @author mac
 * @create 2018/10/28
 * @since 1.0.0
 */
public class Solution16 {
    public static boolean isValid(String s) {

        HashMap<Character,Character> mappings = new HashMap<Character, Character>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');

        // Initialize a stack to be used in the algorithm.
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the current character is a closing bracket.
            if (mappings.containsKey(c)) {

                // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
                char topElement = stack.empty() ? '#' : stack.pop();

                // If the mapping for this bracket doesn't match the stack's top element, return false.
                if (topElement != mappings.get(c)) {
                    return false;
                }
            } else {
                // If it was an opening bracket, push to the stack.
                stack.push(c);
            }
        }

        // If the stack still contains elements, then it is an invalid expression.
        return stack.isEmpty();
    }

    public static void main(String[] args){
        String s1 = "()[]{}";
        String s2 = "([)]";
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
    }
}

