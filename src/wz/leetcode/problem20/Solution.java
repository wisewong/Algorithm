package wz.leetcode.problem20;

import java.util.Stack;

/**
 * Solution
 *
 * @author wz
 * @date 2016年03月03日 15:16
 */
public class Solution {
    public boolean isValid(String s) {
        if (s.length()==0)
            return true;
        if (s.length()%2 ==1)
            return false;
        char characters[] =new char[s.length()],character;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            character = s.charAt(i);
            if (character == '(' || character == '{'|| character == '[')
                characters[index++] = character;
            else if (index <= 0)
                return false;
            else if (character == ')' && characters[--index]!='(')
                return false;
            else if (character == '}' && characters[--index]!='{')
                return false;
            else if (character == ']' && characters[--index]!='[')
                return false;
        }
        if (index!=0)
            return false;
        return true;
//        Stack<Character> stack = new Stack<>();
//        Character character;
//        for (int i = 0; i < s.length(); i++) {
//            character = s.charAt(i);
//            if (character == '(' || character == '{'|| character == '[')
//                stack.push(character);
//            else if (stack.empty())
//                return false;
//            else if (character == ')' && stack.pop()!='(')
//                return false;
//            else if (character == '}' && stack.pop()!='{')
//                return false;
//            else if (character == ']' && stack.pop()!='[')
//                return false;
//        }
//        if (!stack.empty())
//            return false;
//        return true;
    }
}
