/**
 * Copyright (C), 2016-2018, 李浩楠
 * FileName: Solution18
 * Author:   mac
 * Date:     2018/10/28 9:43 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 〈generate-parentheses〉<对应第二十二题>
 * 〈〉
 *
 * @author mac
 * @create 2018/10/28
 * @since 1.0.0
 */
public class Solution18 {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public void backtrack(List<String> ans, String cur, int left, int right, int n){
        if (cur.length() == n * 2) {
            ans.add(cur);
            return;
        }
        //左括号不要超过 n
        if (left < n)
            backtrack(ans, cur+"(", left+1, right, n);
        //右括号不要超过左括号
        if (right < left)
            backtrack(ans, cur+")", left, right+1, n);
    }

    public static void main(String[] args){
        Solution18 s = new Solution18();
        List<String> l = s.generateParenthesis(3);
        System.out.println(l);
    }
}

