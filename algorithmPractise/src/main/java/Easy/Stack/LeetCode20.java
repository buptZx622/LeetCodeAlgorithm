package Easy.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @program: github
 * @description: leetCode 20 有效的括号  https://leetcode-cn.com/problems/valid-parentheses/
 * @author: ZhuangXu
 * @create: 2019-11-03 00:30
 **/


public class LeetCode20 {
    static Map<Character,Character> map=new HashMap<>();
    static{
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
    }
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> left=new Stack<>();
        Stack<Character> right=new Stack<>();
        for (int i = 0; i <chars.length ; i++) {
            if(chars[i]=='{'||chars[i]=='['||chars[i]=='('){
                left.add(chars[i]);
            }else {
                if(left.isEmpty())
                    return false;
                Character pop = left.pop();
                if(chars[i]!=map.get(pop))
                    return false;
            }
        }
        return left.isEmpty();
    }
}
