/**
 * Copyright (C), 2016-2018, 李浩楠
 * FileName: Solution7
 * Author:   mac
 * Date:     2018/10/15 9:21 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈regular-expression-matching〉<对应第十题>
 * 〈〉
 *
 * @author mac
 * @create 2018/10/15
 * @since 1.0.0
 */
public class Solution7 {
    public boolean isMatch(String text, String pattern) {
        if (pattern.isEmpty()) return text.isEmpty();
        boolean first_match = (!text.isEmpty() &&
                (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));

        if (pattern.length() >= 2 && pattern.charAt(1) == '*'){
            return (isMatch(text, pattern.substring(2)) ||
                    (first_match && isMatch(text.substring(1), pattern)));
        } else {
            return first_match && isMatch(text.substring(1), pattern.substring(1));
        }
    }
}

