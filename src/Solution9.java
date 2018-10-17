/**
 * Copyright (C), 2016-2018, 李浩楠
 * FileName: Solution9
 * Author:   mac
 * Date:     2018/10/17 8:03 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 〈integer-to-roman〉<对应对十二题>
 * 〈〉
 *
 * @author mac
 * @create 2018/10/17
 * @since 1.0.0
 */
public class Solution9 {

    public static String intToRoman(int num) {
        Map<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        Iterator<Integer> it = map.keySet().iterator();
        StringBuffer sb = new StringBuffer();
        while (it.hasNext()) {
            Integer initx = it.next();
            String iniys = map.get(initx);
            if (num / initx > 0) {
                for (int i = 0; i < num / initx; i++) {
                    sb.append(iniys);
                }
            }
            num = num - (initx * (num / initx));
        }
        return sb.toString();
    }

    public static void main(String[] args){
        System.out.println(intToRoman(3));
    }
}

