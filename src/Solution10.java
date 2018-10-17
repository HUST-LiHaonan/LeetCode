/**
 * Copyright (C), 2016-2018, 李浩楠
 * FileName: Solution10
 * Author:   mac
 * Date:     2018/10/17 8:12 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac
 * @create 2018/10/17
 * @since 1.0.0
 */
public class Solution10 {
    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map <Character, Integer> mapping = new HashMap <>();
        mapping.put('I', 1);
        mapping.put('V', 5);
        mapping.put('X', 10);
        mapping.put('L', 50);
        mapping.put('C', 100);
        mapping.put('D', 500);
        mapping.put('M', 1000);

        int ans = 0;
        char[] letters = s.toCharArray();

        int i = 0;
        while (i < letters.length - 1) {
            if (mapping.get(letters[i]) < mapping.get(letters[i + 1])) {
                ans += mapping.get(letters[i + 1]) - mapping.get(letters[i]);
                i = i + 2;
            } else {
                ans += mapping.get(letters[i]);
                i++;
            }
        }

        if (i == letters.length - 1) {
            ans += mapping.get(letters[i]);
        }

        return ans;
    }

    public static void main(String[] args){
        System.out.println(romanToInt("MCMXCIV"));
    }
}


