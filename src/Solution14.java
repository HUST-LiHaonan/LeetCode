/**
 * Copyright (C), 2016-2018, 李浩楠
 * FileName: Solution14
 * Author:   mac
 * Date:     2018/10/24 9:42 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


import java.util.ArrayList;
import java.util.List;

/**
 * 〈letter-combinations-of-a-phone-number〉<对应第十七题>
 * 〈〉
 *
 * @author mac
 * @create 2018/10/24
 * @since 1.0.0
 */
public class Solution14 {
     static char[][] lettersByDigits = new char[][]{{}, {'*'}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'},
            {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};

    public  static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>(0);
        for (int i = digits.length() - 1; i >= 0; i--) {
            char[] letters = lettersByDigits[digits.charAt(i) - '0'];
            List<String> list = new ArrayList<>(combinations.size() * letters.length);
            for (char ch : letters) {
                if (combinations.size() == 0) {
                    list.add("" + ch);
                } else {
                    for (String combination : combinations) {
                        list.add(ch + combination);
                    }
                }
            }
            combinations = list;
        }
        return combinations;
    }

    public static void main(String[] args){
        System.out.println(letterCombinations("23"));
    }
}

